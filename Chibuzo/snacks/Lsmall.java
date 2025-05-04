import java.util.Scanner;
public class Lsmall {
public static void main(String[] arges) {
Scanner intput = new Scanner(System.in);

System.out.print("Enter first integer: ");
int number1 = input.nextInt();

System.out.print("Enter second integer: ");
int number2 = input.nextInt();

System.out.print("Enter third integer: ");
int number3 = input.nextInt();

System.out.print("Enter fourth integer: ");
int number4 = input.nextInt();

System.out.print("Enter fifth integer: ");
int number5 = input.nextInt();

		int smallest = number1;
		int largest = number1;

		if(number2 < smallest){
		System.out.printf("%d < %d%n", number2,smallest);
		}
		if(number3 < smallest){
		System.out.printf("%d < %d%n",number3, smallest);
		}
		if(number4 < smallest){
		System.out.printf("%d < %d%n",number4, smallest);
		}
		if(number5 < smallest){
		System.out.printf("%d < %d%n",number5, smallest);
		}
		System.out.printf("Smallest number is %d%n", smallest);

		if(number2 > largest){
		System.out.printf("%d > %d%n", number2,largest);
		}
		if(number3 > largest){
		System.out.printf("%d > %d%n", number3,largest);
		}
		if(number4 > largest){
		System.out.printf("%d > %d%n", number4,largest);
		}
		if(number5 > largest){
		System.out.printf("%d > %d%n", number5,largest);
		}
		System.out.printf("Largest number is %d%n",largest);
				
		


	


}

}