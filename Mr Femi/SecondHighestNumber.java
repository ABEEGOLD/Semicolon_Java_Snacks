import java.util.Arrays;
public class SecondHighestNumber{
	public static void main(String[]args){
		int[] number = {9,6,8,11,12};


		System.out.println("The second highest number is:" + Arrays.toString(highestSecondNumber(number)));






	}



public static int[] highestSecondNumber(int[] number){
	int largest = number [0];
	int secondLargest = number [0];


	for(int count=0;count<number.length;count++){
			if(number[count] > largest){
				secondLargest = largest;
				largest = number[count];
											
			}
	

	}return new int[] {secondLargest};





}






}