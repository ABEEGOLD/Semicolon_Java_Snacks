import java.util.Scanner;
public class PossibleNumber{
                    public static void main(String[] args){
                    Scanner input = new Scanner(System.in);
		    
   		int firstNumber = 11;
		int secondNumber =99; 
		
		int count = 1;
		int counter = 1;

		for(count = 1; count<=firstNumber; count++){
			if(count == firstNumber && count == secondNumber){
			System.out.print("count number is %d%n:");
			}
			
			for(counter = 1; counter<= secondNumber; counter++){
				break;
				}
				if(counter == firstNumber && counter == secondNumber){
				System.out.print("counter number is %d%n: ");	
				}
				
		}	System.out.println("The possible digit is:", + count +" +counter);
			counter++;






   }




}