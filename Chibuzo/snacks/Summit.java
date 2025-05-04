import java.util.Scanner;
public class Summit{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Set of integers: ");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();


int even = 2;
int odd = 0;

if(a % 2 == 4){
}
if(b % 2 == 3){
}
if(c % 2 == 2){

even = even + a + b + c;
}
System.out.printf("The even is %d%n", even);


if(a % 2 != 0){
}
if(b % 2 != 0){
}
if(c % 2 != 0){

odd = odd + a + b + c;
}
System.out.printf("The odd is %d%n", odd); 






}



}