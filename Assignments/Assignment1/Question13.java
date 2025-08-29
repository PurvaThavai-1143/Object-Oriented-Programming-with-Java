/*
13. Exam Eligibility with Medical Cause 
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and 
medical cause (Y/N) as input and decide if the student can sit in exam. 
Input: 
Classes held: 100 
Classes attended: 60 
Medical cause (Y/N): Y 
Output: 
Student is allowed to sit for the exam
*/

import java.util.Scanner;

class Question13{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Classes held: 100");
		
		System.out.print("Classes Attended: ");
		int classes_attended = sc.nextInt();
		sc.nextLine();
		
		if(classes_attended <= 75){
			System.out.print("Have any medical issue (Y/N):");
			String medical = sc.nextLine();
	
			if(medical.equalsIgnoreCase("Y") || medical.equalsIgnoreCase("y")){
				//sc.nextLine();
				System.out.println("Student is allowed to sit for exam.");
			}
			else{
				System.out.println("Student is not allowed to sit for exam.");
			}
		}
		else{
			System.out.println("Student is allowed to sit for exam.");
		}
		
		sc.close();
		
	}
}


/*

D:\Assignment\OOPs\Assignment1>javac Question13.java

D:\Assignment\OOPs\Assignment1>java Question13
Classes held: 100
Classes Attended: 60
Have any medical issue (Y/N):y
Student is allowed to sit for exam.

*/