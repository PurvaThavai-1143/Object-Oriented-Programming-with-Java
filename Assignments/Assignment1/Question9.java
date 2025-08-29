/*
9. Employee Bonus Eligibilty
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and 
years of service as input and print bonus amount. 
Input: 
Enter salary: 50000 
Enter years of service: 6 
Output: 
Bonus amount: 2500 
*/

import java.util.Scanner;
class Question9{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your years of service: ");
		int years = sc.nextInt();
		
		if(years > 5){
			System.out.println("Congradulations! You are eligible for 5% bonus");
			System.out.print("Enter your Salary: ");
			int salary = sc.nextInt();
			
			int bonus = (salary*5)/100;
			System.out.println("Bonus amount: " + bonus);
		}
		else{
			System.out.println("Sorry, You have not completed minimum year criteria");
		}
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question9.java

D:\Assignment\OOPs\Assignment1>java Question9
Enter Your Name: Purva
Enter your years of service: 6
Congradulations! You are eligible for 5% bonus
Enter your Salary: 50000
Bonus amount: 2500

D:\Assignment\OOPs\Assignment1>java Question9
Enter Your Name: Purva
Enter your years of service: 5
Sorry, You have not completed minimum year criteria


*/