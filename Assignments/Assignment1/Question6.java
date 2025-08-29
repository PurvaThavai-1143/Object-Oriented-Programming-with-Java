/*
6. Leap Year Check for a Birthday 
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input 
and check if it’s a leap year. 
Input: 
Enter year: 2024 
Output: 
2024 is a leap year. 
*/

import java.util.Scanner;

class Question6{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter birth year: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0){
			System.out.println("Yehh! Its Leap year. You will get party this year.");
		}
		else{
			System.out.println("Oh shit! You miss the party.");
		}
		
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question6.java

D:\Assignment\OOPs\Assignment1>java Question6
Enter birth year: 2024
Yehh! Its Leap year. You will get party this year.

D:\Assignment\OOPs\Assignment1>java Question6
Enter birth year: 2022
Oh shit! You miss the party.

*/