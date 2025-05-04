import java.util.Scanner;
public class Accepts{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter first integers:");
int num1 = input.nextInt();

System.out.print("Enter second integers:");
int num2 = input.nextInt();



if(num1 > num2){
int difference = num1 - num2;
System.out.printf("print the difference is  %d%n", difference);

}





}

}