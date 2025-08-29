/*
40.	Discount on Purchase (Ternary) 
Scenario: A shop gives 10% discount if purchase amount > 1000. Take purchase amount and print total 
cost using ternary. 
Input: 
Enter purchase amount: 1200 
Output: 
Total cost after discount: 1080
*/

import java.util.Scanner;

class Question40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("total purchase: ");
		int price = sc.nextInt();
		
		int discount = (price - (price*10)/100);
		
		System.out.println((price > 1000)?"eligible for discount : "+discount : "not eligible");
		
		sc.close();
	}
}

/*
D:\Assignment\OOPs\Assignment1>javac Question40.java

D:\Assignment\OOPs\Assignment1>java Question40
total purchase: 1200
eligible for discount : 1080
*/