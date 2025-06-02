import java.util.Scanner;
public class SubtractionRandomNumber{

public static int randomNumbers(numbers){
	int firstNumber = Math.floor(Math.random() * 100);
	int secondNumber = Math.floor(Math.random() * 100);
	
	int subtractionOperator = 0;

		
	if(firstNumber > secondNumber){
		subtractionOperator = firstNumber - secondNumber;
		System.out.println(subtractionOperator)
				
			}else if(firstNumber < secondNumber){
				int scorelow = secondNumber;
				subtractionOperator = secondNumber - scorelow;
				}
					System.out.println(secondNumber+ "-" +scorelow);
		        			
		
		return subtractionOperator;

}

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int count = 0;

for(let ans = 1; ans <= 10; ans++){
	System.out.println("question"+ ans);

	int Attempt = randomNumbers();
	int userAnswer = System.out.print("What is your answer?")

	if(userAnswer == randomNumbers){
		count++		
	}
	
	else if(userAnswer != randomNumbers){
		System.out.print("second try");
		System.out.print("What is your answer?")
	}			


}
	
System.out.println("The score is  "+ count + "/10")
}
	
}




	
	
	




