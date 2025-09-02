
/*
Problem 16: Employee Net Salary

Scenario: 
Extend previous problem. Add method calculateNetSalary(): 
● Add 10% HRA, 5% DA, deduct 2% PF from basicSalary 
● Print net salary for 2 employees


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
	double basicSalary;
	static int counter = 1001;
	double finalSalary;
	
	
	//default constructer - 
	Employee(){
		this.id = counter++;
		this.name = "Unknown";
		this.basicSalary = 20000.0;
	}
	
	//parameterized constructer - 
	Employee(String name, double basicSalary){
		this.id = counter++;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	int getId(int id){
		return id;
	}
	
	String getName(String name){
		return name;
	}
	
	double getBasicSalary(double basicSalary){
		return basicSalary;
	}
	
	//Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
	double calculateNetSalary(){
		finalSalary = basicSalary + (((basicSalary*10)/100) + ((basicSalary*5)/100) - ((basicSalary*2)/100));
		return finalSalary;
		
	}
	
	void showEmpInfo(){
		System.out.println("ID : " + id + " Name: " + name + " Basic Salary: " + basicSalary);
		System.out.println("Employee Pay Slip : Add 10% HRA, 5% DA, deduct 2% PF from basicSalary");
		System.out.println("Final salary of employee: " + calculateNetSalary());
	}
	
}


class Q16_EmpNetSalary{
	public static void main(String args[]){
		
		Employee e1 = new Employee();
		Employee e2 = new Employee("Suresh" , 50000.0);
	
		e1.showEmpInfo();
		System.out.println("");
		e2.showEmpInfo();
		
	}

}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q16_EmpNetSalary.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q16_EmpNetSalary
ID : 1001 Name: Unknown Basic Salary: 20000.0
Employee Pay Slip : Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
Final salary of employee: 22600.0

ID : 1002 Name: Suresh Basic Salary: 50000.0
Employee Pay Slip : Add 10% HRA, 5% DA, deduct 2% PF from basicSalary
Final salary of employee: 56500.0
*/