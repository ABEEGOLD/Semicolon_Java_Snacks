import java.util.Scanner;
public class Positive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter the first integer:");
int number1 = input.nextInt();
System.out.print("Enter second integer:");
int number2 = input.nextInt();

int num1 = number1;
int num2 = number2;

int positive = 0;
if(num1 > num2){
positive = num1;
System.out.printf("positive is %d%n",positive);
}else if(num2 > num1){
positive = 2;
System.out.printf("positive is %d%n", positive);
}

int negative = 0;
if(num1 < num2){
negative = num1;
System.out.printf("Negative is %d%n", negative);
}else if(num2 < num1){
negative = num2;
System.out.printf("Negative is %d%n", negative);
}

int product = num1 * num2;
System.out.printf("product is %d%n is:",product);

int sum = num1 + num2;
System.out.printf("sum is %d%n", sum);

}


}