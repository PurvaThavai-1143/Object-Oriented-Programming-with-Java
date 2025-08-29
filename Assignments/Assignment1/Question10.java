/*
10. Exam Attendance Eligibility 
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as 
input, print allowance. 
Input: 
Enter total classes held: 100 
Enter classes attended: 78 
Output: 
Student is allowed to sit for the exam.
*/

import java.util.Scanner;
class Question10{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int classes_held = 100;
		System.out.println("Total Classes held: " + classes_held);
		
		System.out.print("Total Classes Attended: ");
		int classes_attended = sc.nextInt();
		
		if(classes_attended >= 75){
			System.out.println("Student is allowed to sit for the exam.");
		}
		else{
			System.out.println("Student is not eligible.");
		}
		
		sc.close();
	}
}

/*

D:\Assignment\OOPs\Assignment1>javac Question10.java

D:\Assignment\OOPs\Assignment1>java Question10
Total Classes held: 100
Total Classes Attended: 78
Student is allowed to sit for the exam.

D:\Assignment\OOPs\Assignment1>java Question10
Total Classes held: 100
Total Classes Attended: 74
Student is not eligible.

*/