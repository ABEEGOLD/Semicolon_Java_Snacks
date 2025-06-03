import java.util.Scanner;
public class AverageCompute{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter a number:");
	int firstNumber = input.nextInt();

	System.out.print("Enter a number:");
	int secondNumber = input.nextInt();

	System.out.print("Enter a number:");
	int thirdNumber = input.nextInt();
	
	System.out.print("Enter a number:");
	int fourthNumber = input.nextInt();

	System.out.print("Enter a number:");
	int fifthNumber= input.nextInt();



				
	
	int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		 sum = sum /5;
			
	System.out.println("The average of number:"+sum);	





	}

}









