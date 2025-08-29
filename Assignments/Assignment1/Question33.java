/*
33.	Even or Odd (Ternary) 
Scenario: Take a number and check if it is even or odd using ternary operator. 
Input:
Enter a number: 17 
Output: 
Number is Odd
*/

import java.util.Scanner;

class Question33{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		
		System.out.println((num%2==0)?"Integer : even":"Integer : odd");
		
		sc.close();
	}
}


/*
D:\Assignment\OOPs\Assignment1>javac Question33.java

D:\Assignment\OOPs\Assignment1>java Question33
Enter an integer:
17
Integer : odd
*/