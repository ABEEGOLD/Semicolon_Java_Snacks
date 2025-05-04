import java.util.Scanner;
public class MonthPayment{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		

		System.out.print("Enter the principal address: ");
		double principal = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		double rate = input.nextDouble();

		System.out.print("enter the duration in a year: ");
		double duration = input.nextDouble();



		duration = 10 * 12;
		rate = (rate / 100) / 12;

double denominator = rate * Math.pow((1 + rate), duration);
double numerator = Math.pow((1 + rate), duration) - 1;


double mortgage = principal * (denominator / numerator);

System.out.printf("The monthly payment is %.2f%n:", mortgage);		


    }

}