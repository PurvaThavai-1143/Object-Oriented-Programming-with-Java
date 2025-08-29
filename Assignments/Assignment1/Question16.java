/*16. Vowel or Consonant Checker 
Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid input. 
Input: 
Enter a character: e 
Output: 
Vowel 
*/

import java.util.Scanner;

class Question16{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Alphabet: ");
		char character = sc.next().charAt(0);
		
		// to check character - alphabet / not
		if((character >= 'A' && character <= 'Z') || (character >='a' && character <='z')){
			System.out.println("Valid input");
			// to check character - vowel / not
			if(character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U' || 
			character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
				   System.out.println("Entered character is vowel.");
			   }
			else{
				System.out.println("Entered character is not vowel.");
			}
		}
		else{
			System.out.println("Invalid Alphabet");
		}
		
		sc.close();
		
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question16.java

D:\Assignment\OOPs\Assignment1>java Question16
Enter any Alphabet: e
Valid input
Entered character is vowel.

*/