/*
3. Bank Transaction Check 
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a 
deposit (positive) or a withdrawal (negative). 
Input: 
Enter transaction amount: -2500 
Output: 
Withdrawal transaction.
*/

import java.util.Scanner;

class Question3{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int accBalance = 5000;
		
		System.out.println("Welcom to the ICICI Bank Statement");
		
		System.out.print("Enter your name: ");
		String s1 = sc.nextLine();
		
		System.out.print("Enter transaction amount: ");
		int amount = sc.nextInt();
		
		if(amount > 0){
			System.out.println("You deposited Rs." + amount);
		}
		else{
			System.out.println("You withdrawal Rs. " + amount);
		}
		
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question3.java

D:\Assignment\OOPs\Assignment1>java Question3
Welcom to the ICICI Bank Statement
Enter your name: Purva
Enter transaction amount: -2500
You withdrawal Rs. -2500

D:\Assignment\OOPs\Assignment1>java Question3
Welcom to the ICICI Bank Statement
Enter your name: Purva
Enter transaction amount: 2500
You deposited Rs.2500

*/