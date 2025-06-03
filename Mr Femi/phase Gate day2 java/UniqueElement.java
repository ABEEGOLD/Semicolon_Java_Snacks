public class UniqueElement{
	public static int[] numberElementAppear(int array){
		int[] array = {1,2,3,2};
	int total = 0;	
	int counter = 0;

	for(int i = 0;i<array.length;i++){
		int count = 0;
		}

		for(int index = 0; index<array.length;index++){
			if(array[count] == array[index]){
				count++;
			}
		}
			if(counter == 1){
				total = total + array[i];
			}
			return total;



	}


}