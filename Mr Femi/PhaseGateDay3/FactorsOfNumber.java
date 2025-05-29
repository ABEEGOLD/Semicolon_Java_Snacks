import java.util.Scanner;
public class FactorsOfNumber{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
			int numbers = input.nextInt();

			numbers = 7;
		System.out.print("The factorial of number is"+ numberFactor(numbers));
	
	}


public static int numberFactor(int numbers){

	int factorial = 7;
	int count = 0;
	for(int num = 0;num<=numbers;num++){
		count++;
		if(numbers < factorial){
			factorial = numbers;
		}
	}return factorial;

		


}



}