/*
14. Reverse a 4-Digit Number 
Scenario: Take a 4-digit number and print its reverse.  
Input: 
Enter 4-digit number: 1234 
Output: 
Reversed number: 4321
*/
import java.util.Scanner;

class Question14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 4 digit number: ");
		int num = sc.nextInt();
		
		if(num >= 999 && num < 10000){
			int d1 = num % 10; // last 
			int d2 =(num / 10) % 10;
			int d3 =(num /100) % 10;
			int d4 = (num / 1000);
			
			int reverse = (d1*1000)+(d2*100)+(d3*10)+(d4);
			System.out.println("Reverse number: "+ reverse);
			
		}
		else{
			System.out.println("You have not entered 4 digit number try again!");
		}
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question14.java

D:\Assignment\OOPs\Assignment1>java Question14
Enter 4 digit number: 1234
Reverse number: 4321

*/