/*
46. Character Type Checker 
Scenario: Take a character as input and print whether it is an alphabet, digit, or special character. 
Input: 
Enter character: % 
Output: 
Special Character 
*/

import java.util.Scanner;

class Question46{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= '0' && ch <= '9'){
			System.out.println("Digit");
		}
		else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Special Character");
		}
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question46.java

D:\Assignment\OOPs\Assignment1>java Question46
Enter a character: %
Special Character


*/