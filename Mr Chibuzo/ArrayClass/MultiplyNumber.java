import java.util.Scanner;
public class MultiplyNumber{

	public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number:");
		int firstNumber = input.nextInt();
		System.out.print("Enter second number:");
		int secondNumber = input.nextInt();
		System.out.print("Enter third number:");
		int thirdNumber = input.nextInt();

		firstNumber = firstNumber * secondNumber * thirdNumber;
	   System.out.printf("multiply three %d%n",firstNumber,secondNumber,thirdNumber); 
		
	}

}