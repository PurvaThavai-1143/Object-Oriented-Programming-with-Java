/*
36.	Smallest of Three Numbers (Nested Ternary) 
Scenario: Take three numbers as input and print the smallest using nested ternary operator. 
Input: 
Enter numbers: 12, 8, 19 
Output: 
Smallest number: 8
*/

import java.util.Scanner;

class Question36{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number 1:");
		int n1 = sc.nextInt();
		System.out.println("number 2:");
		int n2 = sc.nextInt();
		System.out.println("number 3:");
		int n3 = sc.nextInt();
		
		int temp = (n1<n2)?n1:n2;
		
		System.out.println((temp<n3)?"smallest number: "+ temp: "smallest number: "+ n3);
		
		sc.close();
	}
}

/*
D:\Assignment\OOPs\Assignment1>javac Question36.java

D:\Assignment\OOPs\Assignment1>java Question36
number 1:
12
number 2:
8
number 3:
19
smallest number: 8
*/