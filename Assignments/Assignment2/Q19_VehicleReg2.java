/*
Problem 19:  Vehicle Registration – Static BlockView
Scenario: 
Add a static block to Vehicle class: 
● Print "Welcome to CDAC Vehicle Registration Portal" when class loads 
● Verify that the message prints only once when multiple vehicles are created

*/


class Vehicle{
	
	String regNo;
    String ownerName;
    String vehicleType;
    static int vehicleCount = 0;
	
	static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }
	
	 Vehicle(String ownerName, String vehicleType) {
        vehicleCount++; // increment counter
        this.regNo = "MH-2025-" + vehicleCount; // auto-generated regNo
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
	
	//getter
	 String getRegNo() {
        return regNo;
    }

    String getOwnerName() {
        return ownerName;
    }

    String getVehicleType() {
        return vehicleType;
    }

    // Display vehicle info
    void showVehicleInfo() {
        System.out.println("Reg No: " + regNo + " | Owner: " + ownerName + " | Type: " + vehicleType);
    }
}


class Q19_VehicleReg2{
	public static void main(String args[]) {
        // Create multiple vehicles
        Vehicle v1 = new Vehicle("Purva", "Car");
        Vehicle v2 = new Vehicle("Manisha", "Bike");
        Vehicle v3 = new Vehicle("Suresh", "Truck");

        // Display registration details
        v1.showVehicleInfo();
        v2.showVehicleInfo();
        v3.showVehicleInfo();
    }
}

/*
Output:-

D:\CDAC aug 25\Java\Assignment\Assignment>javac Q19_VehicleReg2.java

D:\CDAC aug 25\Java\Assignment\Assignment>java Q19_VehicleReg2
Welcome to CDAC Vehicle Registration Portal
Reg No: MH-2025-1 | Owner: Purva | Type: Car
Reg No: MH-2025-2 | Owner: Manisha | Type: Bike
Reg No: MH-2025-3 | Owner: Suresh | Type: Truck

*/