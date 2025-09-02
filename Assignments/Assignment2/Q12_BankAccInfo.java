/*
Problem 12: Bank Account Basic Info 

Scenario: 
Create BankAccount class with accountHolder and balance. 
● Use parameterized constructor to initialize account. 
● Create getter and setter for balance. 
● In main, create one account and display details. 

*/

class BankAccount{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
	
	void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
class Q12_BankAccInfo{
	public static void main(String args[]){
		BankAccount b1 = new BankAccount("Manisha", 50000.0);
		System.out.println("Before update in account:");
		b1.showAccountDetails();
		
		b1.setBalance(120000.0);
		System.out.println("\nAfter update:");
		b1.showAccountDetails();
	}
	
}


/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q12_BankAccInfo.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q12_BankAccInfo
Before update in account:
Account Holder: Manisha
Balance: 50000.0

After update:
Account Holder: Manisha
Balance: 120000.0

*/