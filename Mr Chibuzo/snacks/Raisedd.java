import java.util.Scanner;
public class Raisedd{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first number:");
	int number1 = input.nextInt();

	System.out.print("Enter second number:");
	int number2 = input.nextInt();


	int raised = 1;
	 number1 = 0;
	 number2 = 0;


	for (int bee = 0; bee < number2; bee++){
	raised *= number2;
}
	System.out.printf("%d raised to power %d is %d%n:", number1, number2,raised);
	





	}
}