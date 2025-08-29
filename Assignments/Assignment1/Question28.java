/*
28.	Traffic Signal Instruction 
Scenario: Take traffic signal color as input (Red, Green, Yellow) and print appropriate instruction. Input: 
Enter traffic light color: Green 
Output: 
Go
*/

import java.util.Scanner;

class Question28{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter traffic light colour (Red, Green, Yellow): ");
		String colour = sc.nextLine();
		
		if (colour.equalsIgnoreCase("Red")){
			System.out.println("Stop");
		}
		else if (colour.equalsIgnoreCase("Yellow")){
			System.out.println("Wait");
		}
		else{
			System.out.println("Go");
		}
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question28.java

D:\Assignment\OOPs\Assignment1>java Question28
Enter traffic light colour (Red, Green, Yellow): green
Go


*/