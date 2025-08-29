/*
41.	Check Armstrong Number (3-Digit) 
Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = 
number). 
Input: 
Enter number: 153 
Output: 
153 is an Armstrong number
*/

import java.util.Scanner;

class Question41{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a 3 digit number: ");
		int num = sc.nextInt();
		
		if(num > 99 && num < 999){
			int d1 = num % 10; // 1st
			int d2 = (num/10) % 10; // 2nd
			int d3 = (num / 100); // last
			
			// amstrong no = abc = a^3 + b^3 + c^3
			int result = (int)(Math.pow(d1, 3) + Math.pow(d2, 3) + Math.pow(d3, 3));
			
			if(result == num){
				System.out.println(num + " is an amstrong number.");
			}
			else{
				System.out.println(num + " is not an amstrong number.");
			}
		}
		else{
			System.out.println("Invalid input. please try again.");
		}
		
		sc.close();
	}
	
	
}

/*


D:\Assignment\OOPs\Assignment1>javac Question41.java

D:\Assignment\OOPs\Assignment1>java Question41
Enter a 3 digit number: 153
153 is an amstrong number.

*/