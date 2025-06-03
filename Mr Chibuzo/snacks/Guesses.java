import java.util.Scanner;
public class Guesses {
public static void main(String[] args){
Scanner input = new Scanner(System.in);


int computNum =   (int)(Math.random() * 10) + 1;

int counter = 0;

while(true){
System.out.print("Enter numbers from 10 + 1");
int multipleNumber = input.nextInt();


if(multipleNumber < computNum){
System.out.print("invalid number, number is too high");

}
else if(multipleNumber > computNum){
System.out.print("invalid number, number is too low");

} 
else{
	System.out.print("congratulations, guesses correctly");
	break;
		
}

counter = counter + 1;

System.out.println("for every  3 guesses mystery number has change: " + counter);




}


	System.out.println("Total number of guesses: " + counter);


}
}