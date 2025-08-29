/*
37.	Leap Year Check (Ternary) 
Scenario: Take a year as input and check if it is a leap year using ternary operator. 
Input: 
Enter year: 2024 
Output: 
Leap Year
*/

import java.util.Scanner;

class Question37{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int yr = sc.nextInt();
		
		System.out.println((yr%4==0)?"leap year":"not leap year");
		
		sc.close();
	}
}

/*D:\Assignment\OOPs\Assignment1>javac Question37.java

D:\Assignment\OOPs\Assignment1>java Question37
Enter year:
2024
leap year
*/