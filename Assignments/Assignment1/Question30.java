/*
30.	Menu-Based Simple Arithmetic Operations
Scenario: Implement a menu-based program that asks user to select operation (Addition, Subtraction, Multiplication, Division) and prints result.
Input: 
Select operation (1-Addition, 2-Subtraction): 1 Enter first number: 20 Enter second number: 30
Output:
Result: 50
*/


import java.util.Scanner;

class Question30{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select from below operation list");
		System.out.println("addition: 1");
		System.out.println("subtraction: 2 ");
		System.out.println("multiplication: 3");
		System.out.println("division: 4");
		System.out.print("Which operation do you want to perform?(1-4) : ");
		int operation = sc.nextInt();
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		double result;
		if(operation == 1){
			result = num1 + num2;
			System.out.println("Result num1 + num2 = " + result);
		}
		else if(operation == 2){
			if(num1 > num2){
				result = num1 - num2;
				System.out.println("Result of num1 - num2 = " + result);
			}
			else{
				result = num2 - num1;
				System.out.println("As num2 > num1 so, Result of num2 - num1 = " + result);
			}
		}
		else if(operation == 3){
			result = num1 * num2;
			System.out.println("Result num1 * num2 = " + result);
		}
		else if(operation == 4){
			if(num1 == 0){
				System.out.println("As num1 is 0, we cannot perform any operation");
			}
			else if(num2 == 0){
				System.out.println("As num2 is 0, we cannot perform any operation");
			}
			else{
				if(num1 > num2){
					result = num1 / num2;
					System.out.println("Result num1 / num2 = " + result);
				}
				else{
					result = num2 / num1;
					System.out.println("As num2 > num 1 so, Result num2 / num1 = " + result);
				}
			}
				
			}
		else{
			System.out.println("Invalide input");
		}
		sc.close();
			
		
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question30.java

D:\Assignment\OOPs\Assignment1>java Question30
Select from below operation list
addition: 1
subtraction: 2
multiplication: 3
division: 4
Which operation do you want to perform?(1-4) : 1
Enter 1st number: 20
Enter 2nd number: 30
Result num1 + num2 = 50.0

*/