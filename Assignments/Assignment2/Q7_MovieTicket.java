/*
Problem 7: Indian Movie Ticket Booking
 
Scenario: 
A cinema hall offers Normal and Premium tickets. A customer can book just name or name with 
ticket type. Keep track of total tickets sold using a static counter. 

Tasks: 
1. Create a Customer class. 
2. Implement two constructors: 
Constructor 1 → Customer(String name) 
Constructor 2 → Customer(String name, String ticketType) 
3. Static counter to track tickets sold. 
4. Print customer details and total tickets sold. 

Input Example: 
Customer1: "Rahul" 
Customer2: "Pooja", "Premium" 
Customer3: "Amit" 

Expected Output: 
Customer1: Name: Rahul, Ticket: Normal 
Customer2: Name: Pooja, Ticket: Premium 
Customer3: Name: Amit, Ticket: Normal 
Total Tickets Sold: 3

*/

class Customer{
	String name;
	String ticketType;
	static int ticketSold;
	
	Customer(String name){
		this.name = name;
		ticketSold++;
	}
	
	Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		ticketSold++;
	}
	
	void showDetails() {
        System.out.println("Name: " + name + "Ticket type: " + ticketType);
    }
	
	static void showticketSold(){
		System.out.println("Total ticket sold: " + ticketSold);
	}
}
class Q7_MovieTicket{
	public static void main(String args[]){
		
		Customer c1 = new Customer("Rahul", "Normal");
		Customer c2= new Customer("Pooja" ,"Premium");
		Customer c3 = new Customer("Amit" , "Normal");
		
		c1.showDetails();
		c2.showDetails();
		c3.showDetails();
		
		Customer.showticketSold();
	}
}



/*
Output : - 
D:\CDAC aug 25\Java\Assignment\Assignment>javac Q7_MovieTicket.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q7_MovieTicket
Name: RahulTicket type: Normal
Name: PoojaTicket type: Premium
Name: AmitTicket type: Normal
Total ticket sold: 3

*/