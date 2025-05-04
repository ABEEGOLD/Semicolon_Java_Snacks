import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	
		
		int number = 0;
		int counter = 1;
		int numberOfFactors = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();

	while(counter <= number){
	
		if(number % counter == 0){	 
			System.out.println(counter+ " is the factor of " +number);
			numberOfFactors = numberOfFactors + 1;	
		}

		counter++;

	}
		System.out.println("The total number of factors is: " + numberOfFactors);

			


  }
  
}