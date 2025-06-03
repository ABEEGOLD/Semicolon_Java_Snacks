	
import java.util.Arrays;
	public class Maximum{

		public static void main(String[] args){
			int [] number = {3,2,7,6,5}; 
			
			System.out.println("The largest element is: " + maximumIn(number));
			System.out.println("The smallest element is: " + minimumIn(number));
			System.out.println("The sum of is: " + sumOf(number));
			System.out.println("The sum of even number is: "+ sumOfEvenNumbers(number));
			System.out.println("The sum of odd number is: " + sumOfOddNumber(number));
			System.out.println("The minimum and maximum numbers are: " + Arrays.toString(maximumAndMinimum(number)));

		}	

		
		public static int maximumIn(int[] number){
				int count;
				int largestNumber = 0;
			for(count = 0; count < number.length; count++){
				if(number[count] > largestNumber){
					largestNumber = number[count];
				}
			} 
			return largestNumber;

		}

		
		public static int minimumIn(int [] number){
				int count;
				int smallestElement = 0;
			for(count = 0; count < number.length; count++){
				smallestElement = number[0];
				if(number[count] < smallestElement){
					smallestElement = number[count]; 	
				}
			
			}return smallestElement;

		}
			


		public static int sumOf(int [] number){
			int sum = 0;
			for(int count=0; count < number.length;count++){
				sum += number[count];
			}return sum;
		}
	
		public static int sumOfEvenNumbers(int [] number){
			int sumEven =0;
			for(int counter = 0; counter < number.length; counter++){
				if(number[counter] % 2 == 0){
					sumEven += number[counter];
		       		}
			}
			return sumEven;
                }
	
	    	public static int sumOfOddNumber(int [] number){
			int sumOddNumber = 0;
		
			for(int index = 0; index < number.length; index++){
				if(number[index] % 2 != 0){
					sumOddNumber += number[index];
				}
			}
			return sumOddNumber;
	   	}

	  	public static int[] maximumAndMinimum(int[] number){
	  	    int maximum = 0;
	  	    int minimum = 0;
		    int[] newArray = new int[2];
	  		    for(int count = 0; count < number.length; count++){
                		  if(number[count] > maximum){
					maximum = number[count];
				      	newArray[1] = maximum;

				   }
				   minimum = number[0];
				  if(number[count] < minimum){
				  	minimum = number[count];
					newArray[0] = minimum;

				  }
			   }
	      		return newArray;
	 	}
}			