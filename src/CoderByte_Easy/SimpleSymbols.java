package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Simple Symbols

Using the Java language, have the function SimpleSymbols(str) take the str
parameter being passed and determine if it is an acceptable sequence by either
returning the string true or false. The str parameter will be composed of + and
= symbols with several letters between them (ie. ++d+===+c++==a) and for the
string to be true each letter must be surrounded by a + symbol. So the string to
the left would be false. The string will not be empty and will have at least one
letter.

Sample test cases:

Input:  "+d+=3=+s+"
Output: "true"

Input:  "f++d+"
Output: "false"
*/
class Symbolize{
	public static boolean symbolCheck(String word) {
		boolean ans = false;
		if(Character.isAlphabetic(word.charAt(0))) {
			return false;
		}
		for(int i = 1; i < word.length(); i++) {	
			if(Character.isAlphabetic(word.charAt(i))) {	
				if(word.charAt(i - 1) == '+' && word.charAt(i + 1) == '+') {
					ans = true;
				}
				else {
					ans = false;
				}
			}
		}
		return ans;
	}
}
public class SimpleSymbols {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(Symbolize.symbolCheck(input.next()));
		input.close();
	}
}
