/*
42.	Armstrong Numbers Between 100–500 
Scenario: Print all Armstrong numbers between 100 and 500. Output: 
153 
370 
371 
407
*/



class Question42{
	public static void main(String args[]){
		
		System.out.println("Amstrong numbers between 100 and 500 are:");
		
		for (int num = 100; num <=500 ; num++){
			int d1 = num%10; //unit
			int d2 = (num / 10) % 10; //tensd
			int d3 = (num / 100); //hundreds
			
			int result = (int)(Math.pow(d1,3) + Math.pow(d2,3) + Math.pow(d3,3));
			
			if (result == num) {
				System.out.println("Amstrong numbers are as below: ");
				System.out.println(num);
			}
		}
		
	}
	
}

/*

D:\Assignment\OOPs\Assignment1>javac Question42.java

D:\Assignment\OOPs\Assignment1>java Question42
Amstrong numbers between 100 and 500 are:
Amstrong numbers are as below:
153
Amstrong numbers are as below:
370
Amstrong numbers are as below:
371
Amstrong numbers are as below:
407

*/