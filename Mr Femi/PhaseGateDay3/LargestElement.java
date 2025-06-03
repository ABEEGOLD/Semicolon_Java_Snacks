public class LargestElement{
	public static int[] smallestIndexOfLargest(int[] numbers)
{
		int[] array = {1,5,3,4,5,5};

	int largest = array[0];
	int[] index = 0;

	for(int count = 0; count<numbers.length;count++){
		if(largest == numbers[count]){
			index[count] = array[count];
		}	
	}return index;

	


	}




}