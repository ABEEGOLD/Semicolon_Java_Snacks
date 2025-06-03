import java.util.Scanner;

public class Digits{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number1 =input.nextInt();

int num2 = number1 / 10;

int num1 = number1 % 10;
int num3 = num2 % 10;
int num4 = num2 / 10;

int sum = num1 + num3 + num4;
System.out.printf("The sum is %d%n: ",sum);
}
}