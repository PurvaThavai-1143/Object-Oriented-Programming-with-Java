/*
18. Day of the Week 
Scenario: Take day number (1–7) and print the day name. 
Input: 
Enter day number: 4 
Output: 
Day is Thursday 
*/

import java.util.Scanner;

class Question18{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number between 1-7 to print the day: ");
		int day = sc.nextInt();
		
		switch(day){
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalide input. Try again!");
		}
		sc.close();
	}
}

/*


D:\Assignment\OOPs\Assignment1>javac Question18.java

D:\Assignment\OOPs\Assignment1>java Question18
Enter number between 1-7 to print the day: 4
Thursday

*/