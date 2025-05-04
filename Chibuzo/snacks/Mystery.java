import java.util.Scanner;
public class Mystery {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


int computNum =   (int)(Math.random() * 10) + 1;

int counter = 0;

int wrongNumGuess = 0;

while(true){
System.out.println("Enter numbers from: ");
int multipleNumber = input.nextInt();
wrongNumGuess = wrongNumGuess + 1;

if(multipleNumber < computNum){
System.out.println("invalid number, number is too high");

}
else if(multipleNumber > computNum){
System.out.println("invalid number, number is too low");
} 
else{

		System.out.println("congratulations, guesses correctly:");
break;
	        

}


 

counter = counter + 1;

if(wrongNumGuess % 3 == 0){
computNum = (int)(Math.random() * 10) + 1;
System.out.println("wrong guesses,number change");

}



	System.out.println("Total number of guesses: " + counter);


}


	

}
}