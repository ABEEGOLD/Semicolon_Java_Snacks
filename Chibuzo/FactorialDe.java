import java.util.Scanner;
public class FactorialDe{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.print("enter the factorial number:");
	int digits = input.nextInt();
	
	int factorial = 1;

	for( int count = 1;count <=digits; count++ ){
	factorial *= count;
	}

	System.out.print("The factorial value is,"  +factorial);

	






	}
}