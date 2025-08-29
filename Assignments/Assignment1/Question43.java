/*
43.	Sum of Digits of a Number 
Scenario: Take a number as input and print the sum of its digits. 
Input: 
Enter number: 482 
Output: 
Sum of digits: 14
*/

import java.util.Scanner;

class Question43{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int temp = Math.abs(num); // to handle negative numbers
		
		while (temp>0){
			int digit = temp % 10; //extra last digit
			sum += digit; // addd digit to sum
			temp/= 10; // remove last digit
		}
		System.out.println("Sum of digits: " + sum);
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question43.java

D:\Assignment\OOPs\Assignment1>java Question43
enter a number: 482
Sum of digits: 14


*/