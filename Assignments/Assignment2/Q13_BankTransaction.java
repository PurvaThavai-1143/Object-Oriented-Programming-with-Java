/*
Problem 12: Bank Account Basic Info
 
Scenario: 
Create BankAccount class with accountHolder and balance. 
● Use parameterized constructor to initialize account. 
● Create getter and setter for balance. 
● In main, create one account and display details. 



Problem 13: Bank Deposit & Withdrawal 
Scenario: 
Extend previous problem. Add methods: 
● deposit(double amount) → adds to balance 
● withdraw(double amount) → subtracts from balance 
● Create two accounts, perform deposit/withdraw, display updated balance. 

*/


class BankAcc{
	String accountHolder;
	double balance;
	
	
	BankAcc(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//getter for balance
	double getBalance(){
		return balance;
	}
	
	// setter for balance
	void setBalance(double balance){
		this.balance = balance;
	}
	
	void deposit(double amount){
		if(amount > 0){
			balance = amount + balance;
			System.out.println(accountHolder + " deposited: " + amount);
		}
		else{
			System.out.println("invalide deposit amount");
		}
	}
	
	void showAccountDetails(){
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
	
	void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal!");
        }
    }
}

class Q13_BankTransaction{
	public static void main(String args[]){
		
		BankAcc a1 = new BankAcc("Manisha" , 5000.0);
		BankAcc a2 = new BankAcc("Purva" , 15000.0);
		
		System.out.println("Initial acc detail:");
		a1.showAccountDetails();
		a2.showAccountDetails();
		
		a1.deposit(1000.0);
		a1.withdraw(20000);
		
		
		a2.deposit(2000.0);
		a2.withdraw(20000.0);
		
		
		System.out.println("\nUpdated acc details:");
		a1.showAccountDetails();
        a2.showAccountDetails();
	}
}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>java Q13_BankTransaction
Initial acc detail:
Account holder: Manisha
Balance: 5000.0
Account holder: Purva
Balance: 15000.0
Manisha deposited: 1000.0
Invalid or insufficient balance for withdrawal!
Purva deposited: 2000.0
Invalid or insufficient balance for withdrawal!

Updated acc details:
Account holder: Manisha
Balance: 6000.0
Account holder: Purva
Balance: 17000.0
*/