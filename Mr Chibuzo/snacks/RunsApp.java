import java.util.Scanner;
public class RunsApps{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int computerCho = 1;
computerCho = computerCho + (int)(Math.random() * 10);

System.out.print("Guess number generated:");
int reStart = input.nextInt();

if(reStart < 1){
System.out.printf("Wrong input");
}
if(reStart > 10){
System.out.printf("invalid);
}
if(reStart == computerCho){
System.out.printf("That's right");
}

if(reStart != computerCho){
System.out.printf("Wrong stunt");
if(reStart > computerCho){
System.out.printf("too high");
}
if(reStart < computerCho){
System.out.printf("too low");
}
}

System.out.print("try again");
try = input.nextInt();


if(reStart != computerCho){
System.out.printf("Wrong stunt");
if(reStart > computerCho){
System.out.printf("too high");
}
if(reStart < computerCho){
System.out.printf("too low");
}
}


System.out.print("final try");
final = input.nextInt();



if(reStart != computerCho){
System.out.printf("Wrong stunt");
if(reStart > computerCho){
System.out.printf("too high");
}
if(reStart < computerCho){
System.out.printf("too low");
}
}



















  
}
}