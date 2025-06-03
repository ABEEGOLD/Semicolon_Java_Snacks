import java.util.Scanner;
public class Arit {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter first integer: ");
int firstNumber = input.nextInt();
System.out.print("Enter second number: ");
int secondNumber = input.nextInt();

 firstNumber = firstNumber * firstNumber;
 secondNumber = secondNumber * secondNumber;

int square = firstNumber = secondNumber;  
if(square == firstNumber){
square = firstNumber; 

}
if(square == secondNumber){
square = firstNumber;

}
System.out.printf("square is not %d%n", square);


if(square != firstNumber){
square = firstNumber;
}

if(square != secondNumber){
square = secondNumber;
}
System.out.printf("square is not %d%n", square);

int sumSquare = firstNumber + secondNumber;

System.out.printf("the sum of their square is %d%n",sumSquare);

int difference = firstNumber - secondNumber;
System.out.printf("the difference - %d%n", difference);







}




} 