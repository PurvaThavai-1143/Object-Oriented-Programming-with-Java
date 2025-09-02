/*
Problem 17: Library Book Addition 

Scenario: 
Create Book class with bookId, title, author. 
● Constructor + Getters/Setters 
● Create Library class with libraryName and static totalBooks 
● Method addBook(Book b) → increments totalBooks 
● Method displayTotalBooks() → prints totalBooks 
● Add 2 books to library and display total books 

*/


class Book{
	int bookId;
	String title;
	String author;
	
	Book(int bookId, String title, String author){
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	//getter function
	int getBookId(){
		return bookId;
	}
	String getTitle(){
		return title;
	}
	String getAuthor(){
		return author;
	}
	
	//setter function
	void setBookId(int bookId){
		this.bookId = bookId;
	}
	void setTitle(String title){
		this.title = title;
	}
	void setAuthor(String author){
		this.author = author;
	}
	
	void showBookInfor(){
	System.out.println("Book id: " + bookId + ", Title: " + title + ", Author: " + author);
	}
}

class Library{
	String libraryName;
	static int totalBooks = 0;
	
	Library(String libraryName){
		this.libraryName = libraryName;
	}
	
	void addBook(Book b){
		totalBooks++;
		System.out.println("Added book: " + b.getTitle() + ", By " +b.getAuthor());
	}
	
	static void showdisplayTotalBooks(){
		System.out.println("Total books: " + totalBooks);
	}

}


class Q17_LibraryBookAdd{
	public static void main(String args[]){
		
		Library l = new Library("CDAC Library");
		
		Book b1 = new Book(101, "Java Basics" , "Johnson");
		Book b2 = new Book(102, "Let us C" , "Kanetkar");
		
		l.addBook(b1);
		l.addBook(b2);
		
		Library.showdisplayTotalBooks();
	}
}


/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q17_LibraryBookAdd.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q17_LibraryBookAdd
Added book: Java Basics, By Johnson
Added book: Let us C, By Kanetkar
Total books: 2

*/