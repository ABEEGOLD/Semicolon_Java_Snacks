import java.util.Scanner;
public class Comparing{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter integer:");
int number = input.nextInt();
int square = number * number;
System.out.printf("Square is %d%n",square);



	if(number > 100){
	System.out.printf("%d > 100%n",number);
	}

	if(square > 100){
	System.out.printf("%d > 100%n", square);
	}

	if(number == 100){
	System.out.printf("%d == 100%n",number);
	
	}

	if(square == 100){
	System.out.printf("%d == 100%n", square);
	}

	if(number != 100){
	System.out.printf("%d != 100%n",number);
	}

	if(square != 100){
	System.out.printf("%d != 100%n",square);
	}

	if(number < 100){
	System.out.printf("%d < 100%n",number);
	}

	if(square < 100){
	System.out.printf("%d < 100%n", square);
	}
	


}

}