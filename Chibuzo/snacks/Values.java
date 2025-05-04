import java.util.Scanner;
 public class Values{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter first integers:");
int number1 = input.nextInt();
System.out.print("Enter second integer:");
int number2 = input.nextInt();

int largest = 0;
if(number1 > number2){
largest = number1;
System.out.printf("largest is %d%n", largest);
}else if(number2 > number1) {
largest = number2;
System.out.printf("largest is %d%n", largest);
}


int smallest = 0;
if(number1 < number2){
smallest = number1;
System.out.printf("smallest value %d%n is:", smallest);
}else{
System.out.printf("number is %d%n is:", number2);
}

if(number1 == number2){
System.out.println("0"); 
}else{
System.out.println("print numbers are not the same");
}

int result1 = number1 % 6;
int result2 = number2 % 6;
if(result1 == result2){
System.out.printf("reminder of %d%n is the same:",result1,result2);
}else{
System.out.println("remainder are not equal");
}










  


}


}