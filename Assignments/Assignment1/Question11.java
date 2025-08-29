/*
11. Grade Based on Percentage 
Scenario: Your friend got exam marks. Take percentage marks as input and print the grade: 
● 90+ → A+ 
● 76–89 → A 
● 66–75 → B+ 
● 51–65 → B 
● 36–50 → C 
● Below 35 → Fail 
Input: 
Enter percentage marks: 82 
Output: 
Grade: A 
*/

import java.util.Scanner;

class Question11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		
		if(marks>=90){
			System.out.println("Grade: A+");
		}
		else if(marks>=76 && marks<=89){
			System.out.println("Grade: A");
		}
		else if(marks>=66 && marks<=75){
			System.out.println("Grade: B+");
		}
		else if(marks>=51 && marks<=65){
			System.out.println("Grade: B");
		}
		else if(marks>=36 && marks<=50){
			System.out.println("Grade: C");
		}
		else{
			System.out.println("Fail");
		}
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question11.java

D:\Assignment\OOPs\Assignment1>java Question11
Enter your marks: 82
Grade: A

*/