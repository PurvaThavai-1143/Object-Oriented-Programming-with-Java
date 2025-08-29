/*
32. Positive, Negative, or Zero (Ternary) 
Scenario: Take a number and determine if it is positive, negative, or zero using ternary operator. 
Input: 
Enter a number: -12 
Output: 
Number is Negative
*/

import java.util.Scanner;
class Question32{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		int num = sc.nextInt();
		
		
		System.out.println((num == 0)?"number is 0":(num>0)?"number is positive":"number is negative");
	//	System.out.println((num == 0 && num > 0 && num < 1)?("Number is zero"):("Number is positive"):("Number is Negative"));
		sc.close();
	}
}



/*
D:\Assignment\OOPs\Assignment1>javac Question32.java

D:\Assignment\OOPs\Assignment1>java Question32
Enter integer: -12
number is negative
*/