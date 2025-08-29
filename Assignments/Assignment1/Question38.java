/*
38.	Vowel or Consonant (Ternary) 
Scenario: Take a character and check if it is a vowel or consonant using ternary operator. 
Input: 
Enter character: i 
Output: 
Vowel
*/

import java.util.Scanner;

class Question38{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter character: ");
		char ch = sc.next().charAt(0);
		
		boolean temp1 = ch=='a' || ch =='e' || ch =='i' || ch=='o' || ch=='u';
		boolean temp2 = ch=='A' || ch =='E' || ch =='I' || ch=='O' || ch=='U';
		System.out.println((temp1 || temp2 )?"vowel":"consonant");
		
		sc.close();
	}
}

/*
D:\Assignment\OOPs\Assignment1>javac Question38.java

D:\Assignment\OOPs\Assignment1>java Question38
Enter character: i
vowel
*/