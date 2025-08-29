/*
1. Greatest of Two Test Score
Scenario: Your friend took two mock tests. Write a program to take the two test scores as input and print 
which test the friend scored higher in. 
Input: 
Enter score for Test 1: 78 
Enter score for Test 2: 85 
Output: 
Test 2 has higher score.
*/

class Question1{
	
	public static void main(String args[]){
		
		int test1 = 78;
		int test2 = 85;
		
		System.out.println("Test 1 marks: " + test1);
		System.out.println("Test 2 marks: " + test2);
		
		if (test1 > test2){
			System.out.println("Test 1 has higher marks");
		}
		else{
			System.out.println("Test 2 has higher marks");
		}
		
	}
}



/*

D:\Assignment\OOPs\Assignment1>javac Question1.java

D:\Assignment\OOPs\Assignment1>java Question1
Test 1 marks: 78
Test 2 marks: 85
Test 2 has higher marks

*/