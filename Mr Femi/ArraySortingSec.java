import java.util.Arrays;
public class ArraySortingSec{
	public static void main(String[] args){
		int[] numbers = {7,2,9,3,0};
	

		System.out.println("\nascending numbers:" + Arrays.toString(AscendingArrayAscend(numbers)));
		System.out.println("\square numbers:" + Arrays.toString(SquareArray(numbers))); 
	}



	public static int[] AscendingArrayAscend(int[] numbers){
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
	public static int[] SquareArray(int[] numbers){
		int[] resultSquare = new int[numbers.length];
			int squareNumbers = 0;
		for(int i = 0; i<numbers.length;i++){
			if(resultSquare[i] < squareNumbers){
				 squareNumbers = resultSquare[i] * resultSquare[i];
			} 
			
		}return squareNumbers; 




	}
}
