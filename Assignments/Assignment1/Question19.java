/*
19. Days in a Month 
Scenario: Take month number (1–12) and print number of days in that month. 
Input: 
Enter month number: 2 
Output: 
28 or 29 days
*/
import java.util.Scanner;

class Question19{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number between 1-12 to print days of that month: ");
		int monthNo = sc.nextInt();
		
		switch(monthNo){
			case 1:
			System.out.println("Jan: 31days");
			break;
			case 2:
			System.out.println("Feb: 28 or 29 days");
			break;
			case 3:
			System.out.println("March: 31 days");
			break;
			case 4:
			System.out.println("April: 30 days");
			break;
			case 5:
			System.out.println("May: 31 days");
			break;
			case 6:
			System.out.println("June: 30 days");
			break;
			case 7:
			System.out.println("July: 31 days");
			break;
			case 8:
			System.out.println("Aug: 31 days");
			break;
			case 9:
			System.out.println("Sept: 30 days");
			break;
			case 10:
			System.out.println("Oct: 31 days");
			break;
			case 11:
			System.out.println("Nov: 30 days");
			break;
			case 12:
			System.out.println("Dec: 31 days");
			break;
			default:
			System.out.println("Invalide input. Try again!");
		}
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question19.java

D:\Assignment\OOPs\Assignment1>java Question19
Enter number between 1-12 to print days of that month:
2
Feb: 28 or 29 days

**