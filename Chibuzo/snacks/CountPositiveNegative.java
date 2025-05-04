      import java.util.Scanner;
		public class CountPositiveNegative {
                public static void main(String[] args){
                Scanner input = new Scanner(System.in);



	int counter = 1;
	int total = 0;
	double average = 0;
	int Countpositive = 0;
	int negative = 0;
			

	while(counter != 0){
	System.out.print("Enter unspecified number: ");
	int number = input.nextInt();
	if(number == 0){
	break;
	}
	total += number;
	
	if(number > 0){
	Countpositive++;
	}

	if(number < 0){
	negative++;
	}

	average = (double) total / counter;
	counter++;

}
	
      System.out.printf("The total number is %d%n:", total);
      System.out.printf("The positive number is %d%n:", Countpositive);
      System.out.printf("The negative number is %d%n:", negative);
      System.out.println("The average number is :" + average);



    

    }


 }