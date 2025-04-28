import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a positive integer:");
	int positiveNum = input.nextInt();
	if(positiveNum > 0){

		if(positiveNum % 3 != 0 && positiveNum % 2 != 0){
		System.out.print(positiveNum + " is a prime Number");
		}else 
		
		System.out.print(positiveNum + " is not a prime number");
		
	}


	
  }
}