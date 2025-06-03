import java.util.Scanner;
public class Largest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter first integers:");
int num1 = input.nextInt();

System.out.print("Enter second integers:");
int num2 = input.nextInt();

System.out.print("Enter third integers:");
int num3 = input.nextInt();

System.out.print("Enter fourth integers:");
int num4 = input.nextInt();

System.out.print("Enter fifth  integers:");
int num5 = input.nextInt();


int largest = num1;
int smallest = num1;
 




if(num2 > largest){
largest = num2;
if(num2 < smallest){
smallest = num2;
}
}

if(num3 > largest){
largest = num3;
if(num3 < smallest){
smallest = num3;
}
}

if(num4 > largest){
largest = num4;
if(num4 < smallest){
smallest = num4;
}
}

if(num5 > largest){
largest = num5;
if(num5 < smallest){
smallest = num5;
}
}

System.out.printf("The largest number is %d%n", largest);
System.out.printf("The smallest number is %d%n", smallest); 












}


}