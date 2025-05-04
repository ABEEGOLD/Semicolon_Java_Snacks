import java.util.Scanner;
public class PromptRun{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter v meters/second: ");
double v = input.nextDouble();

System.out.print("Acceleration a in meter/second squared: ");
double a = input.nextDouble();

double length = (v * v) / (2 * a);
System.out.printf("the minimum runway length is %.3f%n", length);






}


}