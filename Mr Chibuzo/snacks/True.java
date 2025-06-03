import java.util.Scanner;
public class True{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer:");
int firstNum = input.nextInt();
System.out.print("Enter second integer:");
int secondNum = input.nextInt();
System.out.print("Enter third integer:");
int thirdNum = input.nextInt();

int num1 = firstNum;  
int num2 = secondNum;
int num3 = thirdNum;

if(num2 > num1 && num3 > num2){
System.out.printf("True");
}

}

} 
