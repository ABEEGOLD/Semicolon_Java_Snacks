import java.util.Scanner;
public class Valueee{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


	System.out.print("Entered  first number:");
	int valueNum = input.nextInt();

	System.out.print("Enter second number:");
	int powerNum = input.nextInt();



	int raised = 1;

	for(int i = 1; i <= powerNum; i++){
	
	raised *= valueNum;
	}


	System.out.println("raised: "+ raised);

}
}	