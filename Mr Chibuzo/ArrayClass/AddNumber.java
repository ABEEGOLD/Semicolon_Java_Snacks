import java.util.Scanner;
public class AddNumber{

	public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number:");
		int firstNumber = input.nextInt();
		System.out.print("Enter second number:");
		int secondNumber = input.nextInt();

		firstNumber = firstNumber + secondNumber;
	System.out.printf("The added number is %d%n:", firstNumber, secondNumber);


		
	}

}