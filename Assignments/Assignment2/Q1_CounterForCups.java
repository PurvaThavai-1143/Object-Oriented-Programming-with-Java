/*
Problem 1: Counter for Cups 
 
Scenario: You are keeping track of how many cups of tea are prepared in your home. 
Requirements: 

1. Create a class TeaCup with instance variable: teaType (String). 
2. Create a static variable totalCups to count all cups created. 
3. Constructor should initialize teaType and increment totalCups. 
4. Create getter for teaType. 
5. Create a static method showTotalCups() to print total cups. 

Input Example: 
Cup1: teaType = "Masala Tea" 
Cup2: teaType = "Green Tea" 
Cup3: teaType = "Ginger Tea" 

Expected Output: 
Cup1 type: Masala Tea 
Cup2 type: Green Tea 
Cup3 type: Ginger Tea 
Total cups made: 3
*/

class TeaCup{
	String teaType;
	static int totalCups;
	
	TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
	}
	
	String getTeaType(){
		return teaType;
	}	
	
	static void showTotalCups(){
		System.out.println("total cups: " + totalCups);
	}
}

class Q1_CounterForCups{
	public static void main(String args[]){
		TeaCup c1 = new TeaCup("Masala tea");
		TeaCup c2 = new TeaCup("Green tea");
		TeaCup c3 = new TeaCup("Ginger tea");
		
		System.out.println("Cup1 type: " + c1.getTeaType());
		System.out.println("Cup2 type: " + c2.getTeaType());
		System.out.println("Cup3 type: " + c3.getTeaType());
		
		TeaCup.showTotalCups();
		
	}
}


/*
Output :-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q1_CounterForCups.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q1_CounterForCups
Cup1 type: Masala tea
Cup2 type: Green tea
Cup3 type: Ginger tea
total cups: 3

*/