package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: First Factorial

Using the Java language, have the function FirstFactorial(num) take the num
parameter being passed and return the factorial of it (e.g. if num = 4, return
(4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the
input will always be an integer.

Sample test cases:

Input:  4
Output: 24

Input:  8
Output: 40320
*/

public class FirstFactorial {
	
	public static void findFactorial(int number) {
		int mul = 1;
		for(int i = 1; i <= number; i++) {
			mul *= i;
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		findFactorial(input.nextInt());
		input.close();
	}
}
