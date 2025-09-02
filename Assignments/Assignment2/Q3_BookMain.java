/*
Problem 3: Library Book Tracker  

Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.  

Requirements: 
1. Create a Book class with instance variables: title (String), author (String), issued (boolean). 
2. Create static variable totalIssuedBooks to keep track of the total number of books issued. 
3. Create a constructor to initialize the book details. 
4. Create getters and setters for all instance variables. 
5. Create a static method showTotalIssued() to print total issued books. 
6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued 
books.  

Input Example: 
Book1: "Harry Potter", Author: "J.K. Rowling", Issued: true 
Book2: "Five Point Someone", Author: "Chetan Bhagat", Issued: false 
Book3: "Rich Dad Poor Dad", Author: "Robert Kiyosaki", Issued: true 

Expected Output: 
Book1 issued? true 
Book2 issued? false 
Book3 issued? true 
Total books issued: 2
*/


class Book{
	String title;
	String author;
	boolean issued;
	static  int totalIssuedBooks = 0;
	
	Book(String title, String author, boolean issued){
		
		this.title = title;
		this.author = author;
		this. issued = issued;
		if(issued==true){
			totalIssuedBooks++;
			
		}
	}
	
	//setter method
	String setTitle(String title){
		this.title = title;
		return title;
	}
	
	String setAuthor(String author){
		this.author = author;
		return author;
	}
	
	boolean setIssued(boolean issued){
		if(this.issued != issued) {
			if(issued) {
				totalIssuedBooks++;  
			} 
			else {
				totalIssuedBooks--;  
				this.issued = issued;  
			}
		}
		return issued;
	}
	
	//getter method
	String getTitle(){
		return title; 
	}
	
	String getAuthor(){
		return author;
	}
	
	boolean getIssued(){
		return issued;
	}
	
	static void showTotalIssued(){
		
		System.out.println("Total books issued: "+totalIssuedBooks);
	}
}

class Q3_BookMain{
	public static void main(String args[]){
		Book b1 = new Book("Harry Potter","J.K. Rowling", true);
        Book b2 = new Book("Five Point Someone","Chetan Bhagat",false);
		Book b3 = new Book( "Rich Dad Poor Dad","Robert Kiyosaki",true);
		
		System.out.println("Title 1: "+b1.getTitle());
		System.out.println("Author 1: "+b1.getAuthor());
		System.out.println("Book1 issued? "+b1.getIssued());
		System.out.println();
		
		b1.setTitle("Can't Heart Me");
		b1.setIssued(false);
		b2.setAuthor("Elon Musk");
		b3.setIssued(false);
		
		System.out.println("Title 1: "+b1.getTitle());
		System.out.println("Author 1: "+b1.getAuthor());
		System.out.println("Book1 issued? "+b1.getIssued());
		System.out.println();
		
		System.out.println("Title 2: "+b2.getTitle());
		System.out.println("Author 2: "+b2.getAuthor());
		System.out.println("Book2 issued? "+b2.getIssued());
		System.out.println();
		
		System.out.println("Title 3: "+b3.getTitle());
		System.out.println("Author 3: "+b3.getAuthor());
		System.out.println("Book3 issued? "+b3.getIssued());
		System.out.println();
		
		Book.showTotalIssued();
		
	}
}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q3_BookMain.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q3_BookMain
Title 1: Harry Potter
Author 1: J.K. Rowling
Book1 issued? true

Title 1: Can't Heart Me
Author 1: J.K. Rowling
Book1 issued? false

Title 2: Five Point Someone
Author 2: Elon Musk
Book2 issued? false

Title 3: Rich Dad Poor Dad
Author 3: Robert Kiyosaki
Book3 issued? false

Total books issued: 0

*/