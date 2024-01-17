package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Letter Changes

Using the C++ language, have the function LetterChanges(str) take the str
parameter being passed and modify it using the following algorithm. Replace
every letter in the string with the letter following it in the alphabet (ie. c
becomes d, z becomes a). Then capitalize every vowel in this new string (a, e,
i, o, u) and finally return this modified string.

Sample test cases:

Input:  "hello*3"
Output: "Ifmmp*3"

Input:  "fun times!"
Output: "gvO Ujnft!"
*/

public class LetterChanges {
	public static void letterChange(String sen) {
		String ans = "", ans2 = "";
		for(int i = 0; i < sen.length(); i++) {
			
			if(Character.isAlphabetic(sen.charAt(i))) {
				char ch = sen.charAt(i);
				ch++;
				ans += ch;
			}
			else {
				ans += sen.charAt(i);
			}
		}
		for(int i = 0; i < ans.length(); i++) {
			if(ans.charAt(i) == 'a' || ans.charAt(i) == 'e' || ans.charAt(i) == 'i' || ans.charAt(i) == 'o' || ans.charAt(i) == 'u') {
				ans2 += Character.toUpperCase(ans.charAt(i));
			}
			else {
				ans2 += ans.charAt(i);
			}
		}
		System.out.println(ans2);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		letterChange(input.nextLine());
		input.close();
	}
}
