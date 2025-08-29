/*
49. Days in Month Considering Leap Year 
Scenario: Take a year and month number, print days in that month considering leap years. 
Input: 
Enter year: 2024 
Enter month number: 2 
Output: 
29 days 
*/

import java.util.Scanner;

class Question49{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		System.out.print("Enter month number [1-12]: ");
		int month = sc.nextInt();
		
		int days = 0;
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
			
			case 4: case 6 : case 9 : case 11:
			days = 30;
			break;
			
			case 2:
			if(year % 4 == 0){
				days = 29;
			}
			else{
				days = 28;
			}
			break;
			
			default:
			
			System.out.println("Invalide month number. Try again");
			System.exit(0);
		}
		System.out.println("Number of days in month " +month + "of year" + year + " = " + days);		
		
		sc.close();
		
	}
}


/*
D:\Assignment\OOPs\Assignment1>javac Question49.java

D:\Assignment\OOPs\Assignment1>java Question49
Enter year: 2024
Enter month number [1-12]: 2
Number of days in month 2of year2024 = 29

*/