/*
17. Divisibility Check 
Scenario: Check if a number is divisible by 2, 3, and 5 using nested if-else. 
Input: 
Enter number: 30 
Output: 
Divisible by 2 
Divisible by 3 
Divisible by 5
*/

import java.util.Scanner;
class Question17{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			//System.out.println("number is divisible by 2");
			if(num % 3 == 0){
				//System.out.println("number is divisible by 3");
				if(num % 5 ==0){
					System.out.println("number is divisible by 2, 3, 5");
				}
			}
		}
		else{
			System.out.println("number not divisible by 2, 3, 5");
		}
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question17.java

D:\Assignment\OOPs\Assignment1>java Question17
Enter any integer:
30
number is divisible by 2, 3, 5

*/