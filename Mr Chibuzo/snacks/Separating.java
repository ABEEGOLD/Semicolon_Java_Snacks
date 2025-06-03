import java.util.Scanner;
public class Separating{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter five digits number:");
int number = input.nextInt();

if(number < 10000){
System.out.print("invalid");
}


if(number == 10000){
System.out.print("number");
}

int firstNumber = 0;
int secondNumber = 0;
int thirdNumber = 0;
int fourthNumber = 0;
int fifthNumber = 0;


firstNumber = number / 10000;
secondNumber = number / 1000 % 10;
thirdNumber = number / 100 % 10;
fourthNumber = number / 10  % 10;
fifthNumber = number  % 10;


System.out.printf("%d %d %d %d %d", firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber);





}


}