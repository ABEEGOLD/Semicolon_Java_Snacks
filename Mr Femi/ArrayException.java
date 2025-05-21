import java.util.Arrays;
import java.util.Scanner;
public class ArrayException{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers:");
		int[] numbers = {8,0,1,4,9,2};
		
		System.out.println("The number iterate is" +iteratesNumber(numbers));
		System.out.println("The maximum is:" +maximumIn(numbers));
		System.out.println("The minimum value is:" +minimumIn(numbers));
		System.out.println("The sum value is:" +sumOf(numbers));
	
	}


public static int iteratesNumber(int[] numbers){
	int[] values = {8,0,1,4,9,2};

	int sumNumber = 0;
	for(int i = 0;i<numbers.length;i++){
		sumNumber = numbers[i];
			
			int totalSum = 0;
		for(int count=0;count<numbers.length; count++){
			totalSum = numbers[count];
		}
	}return sumNumber;	 	

}	

public static int maximumIn(int[] numbers){
	 int numberMaximum = 0;
	for(int cou=0;cou<numbers.length;cou++){
		if(numbers[cou] < numberMaximum){
			numberMaximum = numbers[cou];
		}
	}return numberMaximum;
}


public static int minimumIn(int[] numbers){
	int minimumNumber = 0;
	for(int k=0;k<numbers.length;k++){
		if(numbers[k] > minimumNumber){
			minimumNumber = numbers[k];
		}
	}return minimumNumber;
}


public static int sumOf(int [] numbers){
			 int sum = 0;
			for(int counter=0; counter < numbers.length;counter++){
				 sum += numbers[counter];
			}return sum;
		


}





}