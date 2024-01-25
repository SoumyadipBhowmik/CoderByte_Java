package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Letter Capitalize

Using the Java language, have the function LetterCapitalize(str) take the str
parameter being passed and capitalize the first letter of each word. Words will
be separated by only one space.

Sample test cases:

Input:  "hello world"
Output: "Hello World"

Input:  "i ran there"
Output: "I Ran There"
*/

public class LetterCapitalize {
	
	public static String capitalize(String word) {
		String ans = "";
		ans += Character.toUpperCase(word.charAt(0));
		for(int i = 1; i < word.length(); i++) {
			ans += word.charAt(i);
		}
		return ans;
	}
	
	public static void capitalizeFirst(String sentence) {
		
		String [] arr = sentence.split(" ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = capitalize(arr[i]);
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		capitalizeFirst(input.nextLine());
		input.close();
		
	}
}
