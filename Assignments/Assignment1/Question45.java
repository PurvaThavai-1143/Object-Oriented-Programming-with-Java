/*
45. Sort Three Numbers in Ascending Order
Scenario: Tae three numbers and print them in ascending order.
Input:
Enter numbers: 45, 12, 78
Output:
12, 45, 78
*/

import java.util.Scanner;

class Question45{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int num3 = sc.nextInt();
		
		int result;
		
		if(num1 > num2){
			result = num1;
			num1 = num2;
			num2 = result;
		}
		if(num1 > num3){
			result = num1;
			num1 = num3;
			num3 = result;
		}
		if(num2 > num3){
			result = num2;
			num2 = num3;
			num3 = result;
		}
		System.out.println("Numbers in ascending order: "+ num1 +", " + num2 + ", " + num3);
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question45.java

D:\Assignment\OOPs\Assignment1>java Question45
Enter 1st number: 45
Enter 2nd number: 12
Enter 3rd number: 78
Numbers in ascending order: 12, 45, 78

*/