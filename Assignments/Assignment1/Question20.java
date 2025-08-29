/*
20. Basic Calculator Using If-Else 
Scenario: Create a calculator that takes two numbers and an operator (+, -, *, /) and prints result using 
nested if-else. 
Input: 
Enter first number: 10 
Enter second number: 5 
Enter operator: * 
Output: 
Result: 50 
*/

import java.util.Scanner;

class Question20{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Operator(+, -, *, /): ");
		char operator = sc.next().charAt(0);
		
		double calculate;
		
		if(operator == '+'){
			calculate = num1 + num2;
			System.out.print("Result: " + calculate);
		}
		else if(operator == '-'){
			calculate = num1 - num2;
			System.out.print("Result: " + calculate);
		}
		else if(operator == '*'){
			calculate = num1 * num2;
			System.out.print("Result: " + calculate);
		}
		else if(operator == '/'){
			if(num2 == 0){
				System.out.println("Division by 0 not possible!");
			}
			else{
				calculate = num1 / num2;
				System.out.print("Result: " + calculate);
			}
		}
		else {
			System.out.println("Invalid operator! Try again");
		}
		
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question20.java

D:\Assignment\OOPs\Assignment1>java Question20
Enter 1st number: 10
Enter 2nd number: 5
Enter Operator(+, -, *, /): *
Result: 50.0

*/