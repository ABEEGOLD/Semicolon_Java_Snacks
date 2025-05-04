import java.util.Scanner;
public class LitersFuel{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


	        System.out.print("Total budget for fuel: ");
		int numberOfLiters = input.nextInt();

	        int pricePerLiters = 855;
		double total = numberOfLiters / pricePerLiters;
		System.out.printf("the budget of fuel is %.2f",total);
	

	
	
}




}