import java.util.Arrays;
public class Matrix{
	public static int rotateImage(int nums){

		int[][] numbers = new int[2][3];
			
				
		for(int rows = 0; rows<numbers.length;rows++){
				int elementRotate = 0;

			for(int colums = 0;colums<numbers[rows].length;colums++){
				if(numbers[rows] == numbers[colums]){
					elementRotate = numbers[colums];
						numbers[colums] = numbers[rows];
							elementRotate = numbers[rows];
				}
			 }return elementRotate;


		}
	


	}
	
			//public static void main(String[] args){
	
			//System.out.print("The rows in index is:",Array.deepToString(rotateImage(numbers));




}