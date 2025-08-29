/*
23. Basic Calculator Using Switch-Case 
Scenario: Create a calculator that uses switch-case for operators (+, -, *, /) and prints result. 
Input: 
Enter first number: 15 
Enter second number: 3 
Enter operator: / 
Output: 
Result: 5
*/

import java.util.Scanner;

class Question23{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter numer 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter numer 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter character (+, -, *, /): ");
		char operator = sc.next().charAt(0);
		
		double result;
		switch(operator){
			case '+':
			result = num1 + num2;
			System.out.println("Result: "+ result);
			break;
			case '-':
			result = num1 - num2;
			System.out.println("Result: "+ result);
			break;
			case '*':
			result = num1 * num2;
			System.out.println("Result: "+ result);
			break;
			case '/':
			result = num1 / num2;
			System.out.println("Result: "+ result);
			break;
			default:
			System.out.println("Invalide operator. Try again!");
		}
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question23.java

D:\Assignment\OOPs\Assignment1>java Question23
Enter numer 1: 15
Enter numer 2: 3
Enter character (+, -, *, /): /
Result: 5.0

*/