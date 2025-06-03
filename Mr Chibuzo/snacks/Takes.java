import java.util.Scanner;
public class Takes{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

 
System.out.print("Enter first integer:");
int num1 = input.nextInt();

System.out.print("Enter second integer:");
int num2 = input.nextInt();


int product = num1 * num2;
System.out.printf("product num1 * num2 is %d%n",product);

}

}