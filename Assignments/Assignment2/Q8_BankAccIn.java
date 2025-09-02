/*
Problem 8: Bank Account Initialization 

Scenario: 
A bank wants to initialize the interest rate for all accounts once when the system starts. Each account 
has account holder name, balance, and interest rate. Students should practice static blocks for 
initialization and setters/getters to modify and access account details. 

Tasks: 
1. Create a BankAccount class. 
2. Use a static block to initialize interest rate to 4%. 
3. Create instance variables: name (String) and balance (double). 
4. Create setters and getters for name and balance. 
5. Print account details including interest rate. 

Input Example: 
Account1: Name="Rohit", Balance=5000 
Account2: Name="Priya", Balance=15000 

Expected Output: 
Bank Interest Rate Initialized: 4.0% 
Account1: Name=Rohit, Balance=5000.0, Interest Rate=4.0% 
Account2: Name=Priya, Balance=15000.0, Interest Rate=4.0% 

*/

class BankAccount{
	String name;
	double balance;
	static double interest;
	
	static{
		interest = 4.0;
		System.out.println("Bank Interest Rate Initialized: " + interest + "%");
	}
	
	
	BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	
	void setName(String name){
		this.name = name;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	
	String getName(){
		return name; 
		}
    double getBalance(){
		return balance; 
		}
	
		
	void showDetail(){
		System.out.println("name: " +name + " balance: " +balance + " Interest Rate " +interest);
	}
}
class Q8_BankAccIn{
	public static void main(String args[]){
		
		BankAccount c1 =  new BankAccount("Rohit", 5000.0);
		BankAccount c2 =  new BankAccount("Priya", 15000.0);
		
		c1.showDetail();
		c2.showDetail();
		

	}
}	


/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q9_BankAccIn.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q9_BankAccIn
Bank Interest Rate Initialized: 4.0%
name: Rohit balance: 5000.0 Interest Rate 4.0
name: Priya balance: 15000.0 Interest Rate 4.0

*/