package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: First Reverse

Using the Java language, have the function FirstReverse(str) take the str
parameter being passed and return the string in reversed order. For example: if
the input string is "Hello World and Coders" then your program should return the
string sredoC dna dlroW olleH.

Sample test cases:

Input:  "coderbyte"
Output: "etybredoc"

Input:  "I Love Code"
Output: "edoC evoL I"
*/


public class FirstReverse {
	
	public static String firstReverse(String str) {
		
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			ans = str.charAt(i) + ans;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(firstReverse(input.nextLine()));
		input.close();
	}
}
