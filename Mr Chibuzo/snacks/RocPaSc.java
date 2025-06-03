import java.util.Scanner;
public class RocPaSc{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int computerRandomNumber = (int)(Math.random() * 3) + 0;

System.out.print("Enter a number between 0 and 2:");
int numberCalls =input.nextInt();

int scissors = 0;
int rock = 1;
int paper = 2;
 
if(computerRandomNumber == scissors && numberCalls == scissors){
System.out.printf("computer and user is draw,computerRandomNumber is %d numberCalls is %d:",scissors); 
}

if(computerRandomNumber == rock && numberCalls == paper){
System.out.printf("user won,computerRandomNumber is %d numberCalls is %d:",rock,paper);
}

if(computerRandomNumber == paper && numberCalls == rock){
System.out.printf("computer lose,computerRandomNumber is %d numberCalls is %d:",paper,rock);
}

if(computerRandomNumber == scissors && numberCalls == paper){
System.out.printf("computer won,computerRandomNumber is %d numberCalls is %d:",scissors,paper);
}

if(computerRandomNumber == paper && numberCalls == scissors){
System.out.printf("user lose,computerRandomNumber is %d numberCalls is %d:",paper,scissors);
}

if(computerRandomNumber == rock && numberCalls == scissors){
System.out.printf("computer won,computerRandomNumbe is %d numberCalls is %d:",rock,scissors);
}
if(computerRandomNumber == scissors && numberCalls == rock){
System.out.printf("computer lose,computerRandomNumbe is %d numberCalls is %d:", scissors,rock);
}


}

}