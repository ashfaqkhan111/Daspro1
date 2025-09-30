package prtc;
import java.util.Scanner;

public class prtc{
	
	public static void main (String[]args) {
		
		
		Scanner input = new Scanner(System.in);
		
		double driverFee = 200000;
		double fuelFee = 10000;
		double carRantelPrice = 300000;
		
		
		System.out.println("***Enter The Values***");
	System.out.print("Enter rental period = ");
	int rentaldays = input.nextInt();
	
	System.out.print("Enter distance travaled = ");
	double distance = input.nextDouble();
	
double totalcost =  (carRantelPrice * rentaldays) + (driverFee * rentaldays) + (fuelFee * distance);
	System.out.println("***Results***");
	System.out.println("the tolal cost is = " +totalcost);
	
	input.close();
	
	}	
	
}
