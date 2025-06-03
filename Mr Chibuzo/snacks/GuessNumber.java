	import java.util.Scanner;
	public class GuessNumber {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int computerNum =   (int)(Math.random() * 10) + 1;

	int counter = 0;

	while(counter < 3){
		System.out.print("Enter any number between 1 - 10: ");
		int selectedNum = input.nextInt();

		if(selectedNum > computerNum){
			System.out.println("invalid number,  number is too high");
		}
		else if (selectedNum < computerNum){
			System.out.println("invalid number,  number is too low");
		}
		else{
			System.out.println("correct number");
			break;
		}
	
		counter = counter + 1;
	}
}

}