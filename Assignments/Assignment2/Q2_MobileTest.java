/*
Problem 2: Simple Mobile Tracker 

Scenario: A shop wants to count how many mobiles are added to their inventory. 

Requirements: 
1. Create a class Mobile with instance variable: model (String). 
2. Create a static variable totalMobiles to count total mobiles added. 
3. Constructor should initialize model and increment totalMobiles. 
4. Create a getter for model. 
5. Create a static method showTotalMobiles() to print total mobiles. 

Input Example: 
Mobile1: model = "Samsung Galaxy M32" 
Mobile2: model = "Redmi Note 12" 

Expected Output: 
Mobile1 model: Samsung Galaxy M32 
Mobile2 model: Redmi Note 12 
Total mobiles in stock: 2 
*/

class Mobile {
    static int totalMobiles;
	String model;
	int mobileId;
    String mobileName;

       /* Mobile(int id, String name){
		mobileId = id;
		mobileName = name;
		totalMobiles++; 
		*/
	 Mobile(String model){
		this.model = model;
		totalMobiles++;
	}
	
	 String getModel(){
		return model;
	}
	static void showTotalMobiles(){
		System.out.println("totalMobiles" +  totalMobiles);
	}
	
}
class Q2_MobileTest {
	public static void main(String args[]){
		Mobile m1 = new Mobile("Samsung");
		Mobile m2 = new Mobile("iphone");
		Mobile m3 = new Mobile("OnePlus");
		
		System.out.println("Mobile1: " + m1.getModel());
		System.out.println("Mobile2 : " +  m2.getModel());
		System.out.println("Mobile3 : " +  m3.getModel());
		Mobile.showTotalMobiles();
	}

}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q2_MobileTest.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q2_MobileTest
Mobile1: Samsung
Mobile2 : iphone
Mobile3 : OnePlus
totalMobiles3
*/