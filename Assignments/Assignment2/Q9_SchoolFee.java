/*
Problem 9: School Fee System 

Scenario: 
A school wants to initialize the tuition fee for all students once at program start. Each student has name 
and class. Use static blocks to set the fee and setters/getters to update/access student information. 

Tasks: 
1. Create a Student class. 
2. Use a static block to initialize tuitionFee to 30000. 
3. Create instance variables: name (String) and className (String). 
4. Create setters and getters for name and className. 
5. Print student details including tuition fee.
 
Input Example: 
Student1: Name="Anjali", Class="10th" 
Student2: Name="Vikram", Class="12th" 

Expected Output: 
School Tuition Fee Initialized: 30000 
Student1: Name=Anjali, Class=10th, Tuition Fee=30000 
Student2: Name=Vikram, Class=12th, Tuition Fee=30000 

*/

class Student{
	String name;
	String className;
	static int tuitionFee;
	
	static{
		tuitionFee = 30000;
		System.out.println("Tuition Fee Initialized: " + tuitionFee);
	}
	
	//getter function - 
	String getName(){
		return name;
	}
	String getClassName(){
		return className;
	}
	
	//setter function -
	void setName(String name){
		this.name = name;
	}
	void setClassName(String className){
		this.className = className;
	}
	
	void showstudentDetails(){
		System.out.println("Student 1: Name = " + name + " , Class = " + className + " ,Tuition Fees = " +tuitionFee);
	}
}

class Q9_SchoolFee{
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Anjali");
		s1.setClassName("10th");
		
		s2.setName("Vikram");
		s2.setClassName("12th");
		
		s1.showstudentDetails();
		s2.showstudentDetails();
		
	}
}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q9_SchoolFee.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q9_SchoolFee
Tuition Fee Initialized: 30000
Student 1: Name = Anjali , Class = 10th ,Tuition Fees = 30000
Student 1: Name = Vikram , Class = 12th ,Tuition Fees = 30000

*/