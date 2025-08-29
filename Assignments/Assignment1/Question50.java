/*
50. Divisibility by 2, 3, 5 with Custom Messages 
Scenario: Take a number and check divisibility by 2, 3, and 5, printing custom messages for each. 
Input: 
Enter number: 30 
Output: 
Divisible by 2 
Divisible by 3 
Divisible by 5 
C-
*/


import java.util.Scanner;

class Question50{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer: ");
		int num = sc.nextInt();
		
		if(num%2==0){
			System.out.println(num + " is divisible by 2");
		}
		if(num%3==0){
			System.out.println(num + "is divisible by 3");
			
		}
		if(num%5==0){
			System.out.println(num + "is divisible by 5");
		}
		if(num%2!=0 && num%3!=0 && num%5!=0){
			System.out.println("number is not divisible by 2, 3 and 5");
		}
		sc.close();
		
		
	}
}

/*
D:\Assignment\OOPs\Assignment1>javac Question50.java

D:\Assignment\OOPs\Assignment1>java Question50
Enter any integer:
30
30 is divisible by 2
30is divisible by 3
30is divisible by 5

D:\Assignment\OOPs\Assignment1>java Question50
Enter any integer:
45
45is divisible by 3
45is divisible by 5

*/