/*
34.	Voting Eligibility (Ternary) 
Scenario: Ask user age and print “Eligible” or “Not Eligible” to vote using ternary operator. 
Input: 
Enter age: 20 
Output: 
Eligible to vote
*/

import java.util.Scanner;

class Question34{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println((age >= 18)?"Eligible":"Not eligible");
		
		sc.close();
	}
}


/*
D:\Assignment\OOPs\Assignment1>javac Question34.java

D:\Assignment\OOPs\Assignment1>java Question34
Enter your age:
20
Eligible
*/