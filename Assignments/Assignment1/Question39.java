/*
39.	Bonus Eligibility (Ternary) 
Scenario: A company gives 5% bonus if years of service > 5. Take salary and years of service, print 
bonus eligibility using ternary. 
Input: 
Enter salary: 50000 
Enter years of service: 6 
Output: 
Bonus: 2500
*/

import java.util.Scanner;

class Question39{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter year of service: ");
		int yr = sc.nextInt();
		System.out.println("Salary: ");
		int salary = sc.nextInt();
		
		int bonus = (salary*5)/100;
		
		System.out.println((yr>5)?"eligible for bonus : "+bonus : "not eligible");
		
		sc.close();
	}
}


/*
D:\Assignment\OOPs\Assignment1>javac Question39.java

D:\Assignment\OOPs\Assignment1>java Question39
Enter year of service:
6
Salary:
50000
eligible for bonus : 2500
*/