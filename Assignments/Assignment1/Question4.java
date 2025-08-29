/*
4. Even or Odd Locker Numbers
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is 
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number
*/

import java.util.Scanner;
class Question4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your locker number: ");
		int locker = sc.nextInt();
	
		if(locker % 2 == 0){
			System.out.println("Even locker number");
		}
		else{
			System.out.println("Odd locker number");
		}
		
		sc.close();
	
	}
}



/*

D:\Assignment\OOPs\Assignment1>javac Question4.java

D:\Assignment\OOPs\Assignment1>java Question4
Enter your locker number: 17
Odd locker number

*/