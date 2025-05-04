import java.util.Scanner;

public class Element {

public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter radius");
Double r = input.nextDouble();
Double d = 2 * r;
Double c = 2 * 3.14159 * r;
Double a = 3.14159 * r * r;
System.out.printf("diameter is: %f%n", d);
System.out.printf("circumference is: %f%n", c);
System.out.printf("area is: %f%n", a);

}
}