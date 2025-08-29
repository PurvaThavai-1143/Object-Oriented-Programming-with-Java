/*
15. Lucky Number Check 
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky. 
Input: 
Enter 4-digit number: 3521 
Output: 
Not a lucky number 
*/

import java.util.Scanner;

class Question15{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 4 digit number: ");
		int num = sc.nextInt();
		
		if(num > 999 && num < 10000){
			
			int d1 = (num / 1000); //1st
			int d2 = (num / 100)%10;  //2nd
			int d3 = (num / 10) % 10; //3rd
			int d4 = (num % 10); //last
			
			if((d1 + d2)==(d3 + d4)){
				System.out.println("Lucky number.");
			}
			else{
				System.out.println("Not a lucky number.");
			}
		}
		else{
			System.out.println("you hjave not entered 4 digit number. Try Again!");
		}
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question15.java

D:\Assignment\OOPs\Assignment1>java Question15
Enter 4 digit number: 3521
Not a lucky number.

D:\Assignment\OOPs\Assignment1>java Question15
Enter 4 digit number: 2433
Lucky number.


*/