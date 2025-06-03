import java.util.Scanner;
public class Collectss{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first number:");
int firstNumber = input.nextInt();

System.out.print("Enter second number:");
int secondNumber = input.nextInt();

System.out.print("Enter third number:");
int thirdNumber = input.nextInt();

System.out.print("Enter fourth number:");
int fourthNumber = input.nextInt();

System.out.print("Enter fifth number:");
int fifthNumber = input.nextInt();

int largest = firstNumber, secondNumber,thirdNumber,fourthNumber,fifthNumber;
int smallest = firstNumber, secondNumber,thirdNumber,fourthNumber,fifthNumber;

 if(firstNumber > secondNumber){
largest = firstNumber;
System.out.printf("largest is: %d%n", largest);
}else if(secondNumber > firstNumber){
largest = secondNumber;
System.out.printf("largest is: %d%n", largest);
}







}

}