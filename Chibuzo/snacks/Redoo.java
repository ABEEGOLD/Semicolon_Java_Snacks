import java.util.Scanner;
public class Redoo {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int computerNum = (int)(Math.random() * 20) + 1;

int counter = 0;
int wrongGuess = 0;


while(counter < 20){
System.out.print("enter number:");
int numberRedo = input.nextInt();
wrongGuess = wrongGuess + 1;

if(numberRedo > computerNum){
System.out.println("invalid number,too high:");

} 
else if(numberRedo < computerNum){
System.out.println("invalid number,too low:");

}
else{
	System.out.println("game over,wrong guess:");
break;
}


counter = counter + 1;


if(wrongGuess % 20 == 0){
computerNum = (int)(Math.random() * 10) + 1;
System.out.println("wrongGuess, number change:");
}






System.out.println("total number of guess: " + counter);




}






}




} 