import java.util.Scanner;
public class AcceptTwo {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first integers:");
int firstNumber = input.nextInt();

System.out.print("Enter second integer:");
int secondNumber = input.nextInt();

int sum = firstNumber + secondNumber;
System.out.printf("sum of firstNumber and secondNumber is %d%n:", sum);

int product = firstNumber * secondNumber;
System.out.printf("product of firstNumber with secondNumber is %d%n:", product);

int average = (firstNumber +  secondNumber)/ 2;
System.out.printf("average of %d%n is:", average);

int distance = firstNumber - secondNumber;
System.out.printf("the distance of %d%n is:", distance);

int maximum = firstNumber;
System.out.printf("the maximum of %d%n :", maximum);
int minimum = secondNumber;  
System.out.printf("the minimum of %d%n : ", minimum);


}

} 