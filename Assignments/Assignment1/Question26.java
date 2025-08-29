/*
26.	Season Based on Month 
Scenario: Print season based on month number: 
Dec–Feb → Winter
Mar–May → Summer
Jun–Aug → Monsoon
Sep–Nov → Autumn 
Input: 
Enter month number: 12
Output: 
Season is Winter

*/


import java.util.Scanner;

class Question26{
    public static void main(String[] args){
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } 
		else if (month >= 3 && month <= 5) {
            season = "Summer";
        } 
		else if (month >= 6 && month <= 8) {
            season = "Monsoon";
        } 
		else if (month >= 9 && month <= 11) {
            season = "Autumn";
        } 
		else {
            season = "Invalid month number!";
        }

        System.out.println("Season is " + season);

        sc.close();
    }
}

/*

D:\Assignment\OOPs\Assignment1>javac Question26.java

D:\Assignment\OOPs\Assignment1>java Question26
Enter month number (1-12): 12
Season is Winter

*/