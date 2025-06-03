import java.util.Arrays;
public class ArrayAscendingNumber{
	public static void main(String[] args){
		int[] numbers = {9,7,1,5,2};

		System.out.print("original numbers:");

		for(int count=0;count<numbers.length;count++){
			System.out.print(numbers[count]+ " ");
		}	
		
			int accending = 0;
		for(int index=0;index<numbers.length;index++){
		   	for(int counter=0;counter<numbers.length;counter++){
				if(numbers[counter] > numbers[index]){
					accending = numbers[index];
					numbers[index] = numbers[counter];
					numbers[counter] = accending;
				}
			}
		}
			
		System.out.print("\nascending numbers:");
		for(int count=0;count<numbers.length;count++){
			System.out.print(numbers[count]+ " ");
		}	


      }

}