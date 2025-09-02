/*
Problem 18:  Vehicle Registration – Static Counter 
 
Scenario: 
Create Vehicle class with regNo, ownerName, vehicleType. 
● Static variable: vehicleCount 
● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
● Getter methods for all fields
● Create 2 vehicles, display registration details

*/

class Vehicle{
	String regNo;
	String ownerName;
	String vehicleType;
	static int vehicleCount = 0;
	
	Vehicle(String ownerName, String vehicleType){
		vehicleCount++;
		this.regNo = "MH-2025-" + vehicleCount;
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	String getRegNo(){
		return regNo;
	}
	String getOwnerName(){
		return ownerName;
	}
	String getVehicleType(){
		return vehicleType;
	}
	
	
	// disply vehicle info
	void showVehicleInfo(){
		System.out.println("REg no: " + regNo + " | Owner: " + ownerName + " | Type: " + vehicleType);
	}
}

class Q18_VehicalReg{
	public static void main(String args[]) {
        // Create two vehicles
        Vehicle v1 = new Vehicle("Purva", "Car");
        Vehicle v2 = new Vehicle("Manisha", "Bike");

        // Display vehicle registration details
        v1.showVehicleInfo();
        v2.showVehicleInfo();
    }
}




/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q18_VehicalReg.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q18_VehicalReg
REg no: MH-2025-1 | Owner: Purva | Type: Car
REg no: MH-2025-2 | Owner: Manisha | Type: Bike

*/