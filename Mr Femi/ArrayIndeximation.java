import java.util.Arrays;
public class ArrayIndeximation{
	public static void main(String[] args){
		int[] numbers = {8,0,1,4,9,2};


		System.out.println("The number iterate is" + Arrays.toString(iterateThroughNumber(numbers)));


	}


public static int[] iterateThroughNumber(int[] numbers){
	int[] sumArray = new int[numbers.length];
	
	int sumArrayCounter = 0;


	for(int k=0;k<numbers.length;k++){
		int sum = 0;
		for(int count=0;count<numbers.length;count++){

			if(numbers[k] != numbers[count]){

				sum = sum + numbers[count];
			
				
			}
	
		}sumArray[sumArrayCounter] = sum;
			sumArrayCounter++;


	}

	int minimumNumber = 200000;
	int numberMaximum = -200000;
	for(int j=0;j<sumArray.length;j++){
		if(sumArray[j] > numberMaximum){
			numberMaximum = sumArray[j];
		}
		if(sumArray[j] < minimumNumber){
			minimumNumber = sumArray[j];
		}
	
	}


int[] maxMin = {minimumNumber,numberMaximum };


return maxMin;

}








}