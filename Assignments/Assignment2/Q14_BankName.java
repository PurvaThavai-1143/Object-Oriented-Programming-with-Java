/*
Problem 14: Bank Name Display 

Scenario: 
Add a static variable bankName = "CDAC Bank" and static method displayBankName() to 
BankAccount. 
● Call displayBankName() from main. 
● Create one account to verify instance creation.
*/

class BankAcc{
	String accountHolder;
	double balance;
	
	static String bankName = "CDAC Bank";
	
	BankAcc(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	static void displayBankName(){
		System.out.println("Bank name: " + bankName);
	}
	
	void showAccDetails(){
		System.out.println("Account holder: "+ accountHolder);
		System.out.println("balance:" + balance);
	}
}
class Q14_BankName{
	public static void main(String args[]){
		BankAcc.displayBankName();
		
		BankAcc acc = new BankAcc("Purva", 1000.0);
		acc.showAccDetails();
	}
}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q14_BankName.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q14_BankName
Bank name: CDAC Bank
Account holder: Purva
balance:1000.0

*/