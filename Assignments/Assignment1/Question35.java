/*
35.	Pass/Fail Check (Ternary) 
Scenario: Take marks as input and print Pass or Fail using ternary operator (Pass if >=35). 
Input: 
Enter marks: 28 
Output: 
Fail
Fail
*/


import java.util.Scanner;

class Question35{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		System.out.println((marks >= 35)?"Pass":"Fail");
		
		sc.close();
	}
}

/*
D:\Assignment\OOPs\Assignment1>javac Question35.java

D:\Assignment\OOPs\Assignment1>java Question35
Enter your marks:
28
Fail
*/