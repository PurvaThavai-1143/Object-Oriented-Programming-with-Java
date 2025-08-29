/*
47. Even/Odd Status of Two Numbers 
Scenario: Take two numbers and print if both are even, both odd, or mixed. 
Input: 
Enter first number: 12 
Enter second number: 17 
Output: 
Numbers are mixed (one even, one odd)
*/

import java.util.Scanner;

class Question47 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        if(num1 % 2 == 0 && num2 % 2 == 0){
            System.out.println("Both numbers are even");
        }
        else if(num1 % 2 != 0 && num2 % 2 != 0){
            System.out.println("Both numbers are odd");
        }
        else{
            System.out.println("Numbers are mixed (one even, one odd)");
        }
        
        sc.close();
    }
}

/*

D:\Assignment\OOPs\Assignment1>javac Question47.java

D:\Assignment\OOPs\Assignment1>java Question47
Enter first number: 12
Enter second number: 17
Numbers are mixed (one even, one odd)

*/