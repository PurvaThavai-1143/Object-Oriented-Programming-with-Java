/*
12. Oldest and Youngest Among Three Friends 
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the 
oldest and youngest. 
Input: 
Enter age of Friend 1: 22 
Enter age of Friend 2: 25 
Enter age of Friend 3: 20 
Output: 
Oldest: Friend 2 
Youngest: Friend 3
*/

import java.util.Scanner;

class Question12{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Age of Friend 1: ");
		int friend1 = sc.nextInt();
	
		System.out.print("Age of Friend 2: ");
		int friend2 = sc.nextInt();
		
		System.out.print("Age of Friend 3: ");
		int friend3 = sc.nextInt();
		
		// to know who is oldest
		if(friend1 > friend2 && friend1 >  friend3){
			System.out.println("Oldest: Friend 1");
		}
		else if(friend2 > friend1 && friend2 >  friend3){
			System.out.println("Oldest: Friend 2");
		}
		else{
			System.out.println("Oldest: Friend 3");
		}
		
		// to know who is yougest
		if(friend1 < friend2 && friend1 <  friend3){
			System.out.println("Youngest: Friend 1");
		}
		else if(friend2 < friend1 && friend2 <  friend3){
			System.out.println("Youngest: Friend 2");
		}
		else{
			System.out.println("Youngest: Friend 3");
		}
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question12.java

D:\Assignment\OOPs\Assignment1>java Question12
Age of Friend 1: 22
Age of Friend 2: 25
Age of Friend 3: 20
Oldest: Friend 2
Youngest: Friend 3

*/