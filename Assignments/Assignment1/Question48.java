/*
48.	Grade with Plus/Minus
Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
 Input: 
Enter marks: 78 
Output: 
Grade: A-
*/
import java.util.Scanner;

public class Question48{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "A−";
        } else if (marks >= 65) {
            grade = "B";
        } else if (marks >= 55) {
            grade = "C";
        } else if (marks >= 35) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}


/*
D:\Assignment\OOPs\Assignment1>javac Question48.java

D:\Assignment\OOPs\Assignment1>java Question48
Enter marks: 78
Grade: A?

*/