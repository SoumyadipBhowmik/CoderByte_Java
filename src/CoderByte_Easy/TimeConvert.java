package CoderByte_Easy;

import java.util.Scanner;

/*
Coderbyte coding challenge: Time Convert

Using the Java language, have the function TimeConvert(num) take the num
parameter being passed and return the number of hours and minutes the parameter
converts to (ie. if num = 63 then the output should be 1:3). Separate the
number of hours and minutes with a colon.

Sample test cases:

Input:  126
Output: "2:6"

Input:  45
Output: "0:45"
*/

public class TimeConvert {
	
	public static void checkTime(int number) {
		int hour = 0, min = 0;
		if(number < 60) {
			System.out.println("0:" + number);
		}
		
		else {
			min = number % 10;
			hour = number / 60;
			System.out.println(hour + ":" + min);
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		checkTime(input.nextInt());
		input.close();
	}
}
