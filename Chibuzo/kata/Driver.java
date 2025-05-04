import java.util.Scanner;	
public class Driver {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integer: ");
	int number = input.nextInt();
	
	System.out.printf("is %d an even integer? ",number);
	System.out.println(Kata.isEvenBoolean(number));

	

  }


}