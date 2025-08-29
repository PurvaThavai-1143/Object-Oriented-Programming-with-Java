/*
29.	Day Type Selection 
Scenario: Take user input for day type (1–Workday, 2–Weekend) and print working status. 
Input: 
Enter day type (1–Workday, 2–Weekend): 2 
Output: 
It’s weekend. No work today.
*/

import java.util.Scanner;

class Question29{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Work day types: 1-Workday , 2:-Weekend");
		System.out.print("Enter day type: ");
		int day = sc.nextInt();
		
		if(day == 1){
			System.out.println("It's Work day");
		}
		else{
			System.out.println("Its weekend. No work day.");
		}
		
		sc.close();
	}
}

/*


D:\Assignment\OOPs\Assignment1>javac Question29.java

D:\Assignment\OOPs\Assignment1>java Question29
Work day types: 1-Workday , 2:-Weekend
Enter day type: 2
Its weekend. No work day.

*/