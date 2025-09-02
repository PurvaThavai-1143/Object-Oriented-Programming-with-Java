/*
Problem 15:  Employee Auto-ID Generator 

Scenario: 
Create Employee class with id, name, basicSalary. 
● Add static counter starting from 1001 for IDs. 
● Default constructor → name = "Unknown", salary = 20000 
● Parameterized constructor → accept name and salary 
● Getter for all variables 
● Create 2 employees and display their IDs, names, salary

*/


class Employee{
	int id;
	String name;
	double salary;
	static int counter = 1001; 
	
	
	// default constructor -
	Employee(){
		this.id = counter++;
		this.name = "Unknown";
		this.salary = 20000.0;
	}
	
	// parameterized constructor -
	Employee(String name, double salary){
		this.id = counter++;
		this.name = name;
		this.salary = salary;
	}
	
	//getter function
	int getId(int id){
		return id;
	}
	
	String getName(String name){
		return name;
	}
	
	double getSalary(double salary){
		return salary;
	}
	
	
	void showEmpInfo(){
		System.out.println("Name: " + name + " Ids: " + id + " Salary: " + salary);
	}
}

class Q15_EmpIdGen{
	public static void main(String args[]){
		Employee e1 = new Employee();
		Employee e2 = new Employee("Surest" , 35000.0);
		
		e1.showEmpInfo();
		e2.showEmpInfo();
	}
}


/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q15_EmpIdGen.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q15_EmpIdGen
Name: Unknown Ids: 1001 Salary: 20000.0
Name: Surest Ids: 1002 Salary: 35000.0

*/