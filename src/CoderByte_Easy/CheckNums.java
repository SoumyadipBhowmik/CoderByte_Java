package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Check Nums

Using the Java language, have the function CheckNums(num1,num2) take both
parameters being passed and return the string true if num2 is greater than num1,
otherwise return the string false. If the parameter values are equal to each
other then return the string -1.

Sample test cases:

Input:  num1 = 3 & num2 = 122
Output: "true"

Input:  num1 = 67 & num2 = 67
Output: "-1"

Input:  num1 = 83 & num2 = 67
Output: "false"
*/

public class CheckNums {
	public static void checkNum(int num1, int num2) {
		if(num1 < num2) {
			System.out.println("true");
		}
		else if(num1 == num2) {
			System.out.println(-1);
		}
		else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		checkNum(input.nextInt(), input.nextInt());
		input.close();
	}
}
