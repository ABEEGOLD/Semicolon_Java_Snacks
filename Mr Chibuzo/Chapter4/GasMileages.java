//prompt user to enter miles driven
//prompt user to enter gallon used
//instantiates counter to 0
//calculate miles driven / gallon used
//instantiate combine miles diver and gallon used  to 0
//add miles driven and gallonn used to CmGand s.out
//increment counter for every trip
//when value = sentinel,s.out average
//combinemilespergallon = combinemilespergallon + milesperGallon
 //average = combinemilespergallon / counter.

import java.util.Scanner;
public class GasMileages{
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);

			
			while(true)
		System.out.print("Enter gallon used (-1 to end):");
		double gallonUsed = input.nextInt();
		System.out.print("Enter miles driven");
		double milesDriven = input.nextInt();
		
			milesDriven = 0;
			gallonUsed = 0;
			int counter = 0;
			double CombineMilesPerGallon = 0;
			int milesPerGallon = 0;

					
			milesDriven = milesDriven / gallonUsed;
			counter++;
			milesDriven = milesDriven + gallonUsed + CombineMilesPerGallon;
			System.out.printf("miles combine per each trip is %.2f%n:",CombineMilesPerGallon); 

			combineMilesPerGallon = combineMilesPerGallon + milesPerGallon;
			counter++;
			int average = combineMilesPerGallon / counter;
			System.out.printf("the total of combine miles per gallon is %.2f%n:", average); 
			
			

			


			
		
	
			

	}

}




