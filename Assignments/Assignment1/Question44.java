/*
44. Reverse 4-Digit Number and Palindrome Check 
Scenario: Take a 4-digit number, reverse it, and check if it is a palindrome. 
Input: 
Enter 4-digit number: 1221 
Output: 
Reversed number: 1221 
Palindrome: Yes 
*/

//palindrome : original no. == reverse no.

import java.util.Scanner;

class Question44{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a 4 digit number to check palindrome: ");
		int num = sc.nextInt();
			
		int original = num;
		int reverse = 0;
		
		//to reverese the given no.
		while(num > 0){
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("reverse number: " + reverse);
		
		if(original == reverse){
			System.out.println("Palindrome : yes");
		}
		else{
			System.out.println("Palindrome : no");
		}
	
	sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question44.java

D:\Assignment\OOPs\Assignment1>java Question44
Enter a 4 digit number to check palindrome: 122
reverse number: 221
Palindrome : no

D:\Assignment\OOPs\Assignment1>java Question44
Enter a 4 digit number to check palindrome: 1221
reverse number: 1221
Palindrome : yes


*/