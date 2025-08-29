/*
2. Highest Salary Among Three Offers 
Scenario: You have three job offers. Take the offered salaries as input and print which company is 
offering the highest salary. 
Input: 
Enter salary for Company 1: 45000 
Enter salary for Company 2: 52000 
Enter salary for Company 3: 50000 
Output: 
Company 2 offers the highest salary
*/

import java.util.Scanner;

class Question2{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter salary for Company 1: ");
		int company1 = sc.nextInt();
		
		System.out.print("Enter salary for Company 2: ");
		int company2 = sc.nextInt();
		
		System.out.print("Enter salary for Company 3: ");
		int company3 = sc.nextInt();
		
		if(company1 > company2 && company1 > company3){
			System.out.println("Company 1 offers higher package than Company 2 and Company3");
		}
		else if(company2 > company1 && company2 > company3){
			System.out.println("Company 2 offers highter package than Company 1 and Company3");
		}
		else{
			System.out.println("Company 3 offers higher package than Company 1 and Company 2");
		}
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question2.java

D:\Assignment\OOPs\Assignment1>java Question2
Enter salary for Company 1: 45000
Enter salary for Company 2: 52000
Enter salary for Company 3: 50000
Company 2 offers highter package than Company 1 and Company3

*/