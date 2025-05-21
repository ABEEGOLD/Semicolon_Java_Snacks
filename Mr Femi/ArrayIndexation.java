import java.util.Arrays;
public class ArrayIndexation{
	public static void main(String[] args){
		int[] numbers = {8,0,1,4,9,2};

	System.out.println("The number iterate is" + Arrays.toString(iterateThroughNumber(numbers)));




	}

public static int[] arrayAddsNumbers(int[] numbers){
	int[] sumOfArray = new int[numbers.length];
		int sumOfArrayCounter = 0;
	for(int index=0;index<numbers.length;index++){
			int sum = 0;
		for(int count= 0;count<numbers.length;count++){
			if(numbers[index] != number[count]);
				sum = sum +number[count];	 
		}
	
	}sumOfArray[sumOfArrayCounter] = sum;
		sumOfArrayCounter++;


}
	
	int numberMax = -20000;
	int numberMin = 20000;
for(int index= 0;index<number.length;index++){
	if(sumOfArray[index] > numberMax){
		numberMax = sumOfArray;
	}
		if(sumOfArray[count] < numberMin){
			numberMin = sumOfArray[count];
		}
	
	int[] minMax = {numberMax,numberMin}; 
	return minMax;

}




}

