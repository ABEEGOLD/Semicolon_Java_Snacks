import java.util.Scanner;

public class Digits1{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number1 =input.nextInt();

if(number1 > 0 && number1 < 1000){
int num1 = number1 % 10;
int num2 = (number1 / 10) % 10;
int num3 = (number1 / 10) / 10;

int sum = num1 + num2 + num3;
System.out.printf("The sum is %d%n: ",sum);
} else {
System.out.print("Enter an integer between 0 and 1000");
}


}
}