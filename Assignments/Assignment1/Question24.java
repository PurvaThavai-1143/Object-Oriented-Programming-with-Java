/*
24.	Grade Using Switch (Ranges) 
Scenario: Take marks (0–100) and print grade using switch-case grouping: 
	0–24 → F 
	25–44 → E 
	45–54 → D 
	55–69 → C 
	70–84 → B 
	85–100 → A 
Input: Enter marks: 78
Output: Grade: B
*/



import java.util.Scanner;
class Question24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		
		if(marks >= 0 || marks <= 100){
			
			switch(marks/10){
				case 10:
				case 9:
				case 8:
				if(marks >= 85){
					System.out.println("Grade A");
				}
				else{
					System.out.println("Grade B");
				}
				break;
				
				case 7:
				System.out.println("Grade B");
				break;
				
				case 6:
				case 5:
				if(marks >= 55){
					System.out.println("Grade C");
				}
				else{
					System.out.println("Grade D");
				}
				break;
				
				case 4:
				if(marks >= 45){
					System.out.println("Grade D");
				}
				else{
					System.out.println("Grade E");
				}
				break;
				
				case 3:
				case 2:
				if(marks >= 25){
					System.out.println("Grade E");
				}
				else{
					System.out.println("Grade F");
				}
				break;
				
				case 1:
				case 0:
				System.out.println("Grade F");
			}
			
		}
		sc.close();
	}
	
}
















/*
import java.util.Scanner;

class Question24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        String grade;

        switch (marks) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
            case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
            case 20: case 21: case 22: case 23: case 24:
                grade = "F";
                break;
				
            case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34:
            case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                grade = "E";
                break;
				
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54:
                grade = "D";
                break;
				
            case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64:
            case 65: case 66: case 67: case 68: case 69:
                grade = "C";
                break;
				
            case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
            case 80: case 81: case 82: case 83: case 84:
                grade = "B";
                break;
				
            case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94:
            case 95: case 96: case 97: case 98: case 99: case 100:
                grade = "A";
                break;
				
            default:
                grade = "Invalid Marks";
        }

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
*/
/*

D:\Assignment\OOPs\Assignment1>javac Question24.java

D:\Assignment\OOPs\Assignment1>java Question24
Enter marks (0-100): 78
Grade: B

*/