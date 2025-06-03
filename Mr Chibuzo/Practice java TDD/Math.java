import java.util.Scanner;
public class Math {
	public static int add(int num1,int num2){
		if (num1 < 0 || num2 < 0) {
			return 0;
		}
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("First number: ");
		int num1 = in.nextInt();

		System.out.print("Second number: ");
		int num2 = in.nextInt();

		System.out.print("Sum is " + add(num1, num2));
		System.out.print("Done!");
	}
}