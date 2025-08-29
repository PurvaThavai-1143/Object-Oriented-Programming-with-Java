/*
31.	Greatest of Two Numbers (Ternary) 
Scenario: You want to quickly compare two numbers. Take two numbers as input and print the greatest using a ternary operator. 
Input: 
Enter first number: 45 
Enter second number: 30 
Output: 
Greatest number: 45
*/

import java.util.Scanner;

class Question31{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number 1: ");
		int num1 = sc.nextInt();
		System.out.print("number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println((num1>num2)?("Greatest number:" + num1):("Greatest number:" + num2));
		
		sc.close();
	}
}



/*
D:\Assignment\OOPs\Assignment1>javac Question31.java

D:\Assignment\OOPs\Assignment1>java Question31
number 1: 45
number 2: 30
Greatest number:45
*/