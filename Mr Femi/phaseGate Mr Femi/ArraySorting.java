import java.util.Arrays;
public class ArraySorting{
	public static void main(String[] args){
		int[] numbers = {7,2,9,3,0};
	

		System.out.println("\nascending numbers:" + Arrays.toString(AscendingArray(numbers))); 
	}



	public static int[] AscendingArray(int[] numbers){
		int[] number = {7,2,9,3,0};
			
			

		for(int index =0;index<numbers.length;index++){
				int ascending = 0;
			for(int count = 0;count<numbers.length;count++){
				if(numbers[index] < numbers[count]){
					ascending = numbers[index];
					numbers[index] = numbers[count];
					numbers[count] = ascending;	
			
		
				}			}			
		
		} return numbers;

	}

}
