package CoderByte_Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Using the C++ language, have the function AlphabetSoup(str) take the str string
parameter being passed and return the string with the letters in alphabetical
order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not
be included in the string.

Sample test cases:

Input:  "coderbyte"
Output: "bcdeeorty"

Input:  "hooplah"
Output: "ahhloop"
*/

public class AlphabetSoup {
	
	public static void alphaSoup(String sen) {
		char [] arr = sen.toCharArray();
		Arrays.sort(arr);
		System.out.print(String.valueOf(arr));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		alphaSoup(sc.next());
		sc.close();
	}

}
