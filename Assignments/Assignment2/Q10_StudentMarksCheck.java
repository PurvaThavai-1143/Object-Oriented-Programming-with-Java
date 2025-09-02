
/*
Problem 10: Student Marks Checker 

Scenario: 
Create a Student class with rollNo, name, and marks. 
● Use a parameterized constructor to initialize all fields. 
● Create a getter and setter for marks. 
● In main, create one student, update marks using setter, and print student details.

*/

class Student{
	String name;
	int rollNo;
	int marks;
	
	Student(String name, int rollNo, int marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	int getMarks(){
		return marks;
	}
	
	void setMarks(int marks){
		this.marks = marks;
	}
	
	void showStudentDetails(){
	System.out.println("Student name: " + name);
	System.out.println("Student roll no: " + rollNo);
	System.out.println("Student marks: " + marks);
	}
}

class Q10_StudentMarksCheck{
	public static void main(String[] args) {
		Student s1 = new Student("Purva" , 29 , 67);
		System.out.println("Initial details: ");
		s1.showStudentDetails();
	
		s1.setMarks(90);
		System.out.println("\nAfter Updating Marks:");
		s1.showStudentDetails();
	
	
	}
}

/*
Otuput:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q10_StudentMarksCheck.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q10_StudentMarksCheck
Initial details:
Student name: Purva
Student roll no: 29
Student marks: 67

After Updating Marks:
Student name: Purva
Student roll no: 29
Student marks: 90
*/