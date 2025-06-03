	import java.util.Scanner;
	public class Doloop{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	
	System.out.print("Entered  first number:");
	int firstNum = input.nextInt();


	System.out.print("Enter second number:");
	int secondNum = input.nextInt();

	int sum = 0;
	
	int numberAdd = 0;

	do{



		System.out.printf("Enter if wishes to perform the operation again:");
		int repeat = input.nextInt();
		
		if(repeat % 2 == 0){ 
		sum+=repeat;
		System.out.printf("repeated is %d%n:", repeat);
		}

                while(numberAdd != sum){
		System.out.println("\nThe sum of Added number is  = "+numberAdd, +sum);
		}

		
	        System.out.println("terminate");











	}
}
