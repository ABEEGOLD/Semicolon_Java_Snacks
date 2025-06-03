import java.util.Scanner;	
public class Driverr {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int firstNumber = input.nextInt();
	
	System.out.printf("is %d an prime integer? ",firstNumber);
	System.out.println(Katai.isPrimeNumber(firstNumber));

	


   }  
}