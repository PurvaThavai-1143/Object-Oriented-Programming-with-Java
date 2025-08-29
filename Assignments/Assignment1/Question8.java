/*
8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount 
as input and calculate final cost. 
Input: 
Enter total purchase amount: 1200 
Output: 
Final cost after discount: 1080
*/

import java.util.Scanner;

class Question8{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total purchase amount: ");
		int cost = sc.nextInt();
		
		if(cost>1000){
			System.out.println("You are eligible for 10% discount");
			double finalcost = cost-(cost*10)/100;
			System.out.println("Final cost after discoun: "+finalcost);
		}
		else{
			System.out.println("not eligible");
		}
		
		sc.close();
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question8.java

D:\Assignment\OOPs\Assignment1>java Question8
Enter total purchase amount: 1200
You are eligible for 10% discount
Final cost after discoun: 1080.0

D:\Assignment\OOPs\Assignment1>java Question8
Enter total purchase amount: 999
not eligible

*/