/*
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a 
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden
*/

import java.util.Scanner;

class Question5{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are designing a small gerdern");
		
		System.out.print("Enter length for a garden: ");
		int length = sc.nextInt();
		System.out.print("Enter breadth for a garden: ");
		int breadth = sc.nextInt();
		
		if(length == breadth){
			System.out.println("You are designing a sqaure garden");
		}
		else{
			System.out.println("You are designing a rectangular garden");
		}
		
		sc.close();
	}
}



/*

D:\Assignment\OOPs\Assignment1>javac Question5.java

D:\Assignment\OOPs\Assignment1>java Question5
You are designing a small gerdern
Enter length for a garden: 12
Enter breadth for a garden: 12
You are designing a sqaure garden

D:\Assignment\OOPs\Assignment1>java Question5
You are designing a small gerdern
Enter length for a garden: 12
Enter breadth for a garden: 13
You are designing a rectangular garden

*/