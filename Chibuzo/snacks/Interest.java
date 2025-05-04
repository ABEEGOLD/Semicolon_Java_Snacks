import java.util.Scanner;
public class Interest {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter balance: ");
double balance = input.nextDouble();


System.out.print("Enter annual interest rate: ");
double annuelInterestRate = input.nextDouble();

double interest = balance * (annuelInterestRate/1200);
System.out.printf("the interest is %f%n", interest);



}


}
