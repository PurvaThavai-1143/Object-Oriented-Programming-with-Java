/*
25.	Message Based on Number (1–5) 
Scenario: Take a number (1–5) and print a message according to the case. Useful for simple menu selection.
 Input: Enter a number: 3 
Output: You selected option 3.
*/

import java.util.Scanner;

class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int option = sc.nextInt();

        switch(option) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid selection! Please enter a number between 1 and 5.");
        }

        sc.close();
    }
}


/*


D:\Assignment\OOPs\Assignment1>javac Question25.java

D:\Assignment\OOPs\Assignment1>java Question25
Enter a number (1-5): 3
You selected option 3.


*/