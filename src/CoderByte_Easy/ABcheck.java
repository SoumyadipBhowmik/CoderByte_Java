package CoderByte_Easy;

/*
Coderbyte coding challenge: AB Check (v1, v2)

Using the Java language, have the function ABCheck(str) take the str parameter
being passed and return the string true if the characters a and b are separated
by exactly 3 places anywhere in the string at least once (ie. "lane borrowed"
would result in true because there is exactly three characters between a and b).
Otherwise return the string false.

Sample test cases:

Input:  "after badly"
Output: "false"

Input:  "Laura sobs"
Output: "true"
*/

public class ABcheck {
	
	static boolean checkAB(String sen) {
		
		char [] arr = sen.toCharArray();
		
		for(int i = 0; i < arr.length - 4; i++) {
			if(arr[i] == 'a') {
				if(arr[i + 4] == 'b') {
					return true;					
				}
			}
		}	
		return false;
	}
	public static void main(String[] args) {
		String s1 = "after badly";
		System.out.println(checkAB(s1));
	}
}
