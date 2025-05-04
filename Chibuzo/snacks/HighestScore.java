import java.util.Scanner;
public class HighestScore{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter name of student:");
String studentName = input.next();

System.out.print("Enter student score:");
int studentNum = input.nextInt();

String name = studentName;
int studentScore = 0;
int highestScore = 0;


while(studentNum != -1 && studentName != "a"){

if(studentNum > highestScore){
highestScore = studentNum;
name = studentName;
}

System.out.print("Enter name of student:");
studentName = input.next();

System.out.print("Enter student score:");
studentNum = input.nextInt();

}
System.out.printf("%s has the highest score: %d%n",name, highestScore);


}
}