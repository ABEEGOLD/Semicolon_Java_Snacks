import java.util.Scanner;
public class Summat{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int natural = 1;
	int sumTotal = 10;


		for(natural = 1; natural <=10; natural++){
			sumTotal+=natural;
		}


		 System.out.printf("Sum = %d", sumTotal);

			
 	}
}