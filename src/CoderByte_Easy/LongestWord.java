package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Longest Word

Using the Java language, have the function LongestWord(sen) take the sen
parameter being passed and return the largest word in the string. If there are
two or more words that are the same length, return the first word from the
string with that length. Ignore punctuation and assume sen will not be empty.

Sample test cases:

Input:  "fun&!! time"
Output: "time"

Input:  "I love dogs"
Output: "love"
*/

public class LongestWord {
	
	public static void longestWord(String sen) {
		String longest = "";
		String [] arr = sen.split(" ");
		for(int i = 0; i < arr.length; i++) {
			if(longest.length() < arr[i].length() && !arr[i].contains("&!!")) {
				longest = arr[i];
			}
		}
		System.out.println(longest);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		longestWord(input.nextLine());
		input.close();
	}

}
