import java.util.Scanner;
public class Ended{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);


	int largest = 0;
	int smallest = 0;
	int mumu = -1;
        int number = 1; 
		System.out.print("Enter number or -1 to stop:");

	
		while(true){
	 		number = input.nextInt();

			
         		if(number > largest){
				largest = number;
	 		}
	 		if(number < smallest){
				smallest = number;
	 		}
			if(number == mumu){
				break;
			}

        	}
		
			System.out.printf("Enter number largest is %d%n",largest);
         		System.out.printf("Enter number samllest is %d%n", smallest);
             
 	}
}