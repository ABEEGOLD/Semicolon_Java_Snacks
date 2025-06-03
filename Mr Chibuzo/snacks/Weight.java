import java.util.Scanner;
public class Weight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


System.out.print("Enter the weight of the package");
int packageWeight = input.nextInt();
System.out.print("enter shipping cost:");
int shippingCost = input.nextInt();

int cost = packageWeight * shippingCost;


if(packageWeight > 0 && packageWeight <= 1){
System.out.printf("packageWeight greater than:0,1");
}

if(packageWeight > 1 && packageWeight <= 3){
System.out.printf("packageWeight greater than: 1,3");
}

if(packageWeight > 3 && packageWeight <= 10){
System.out.printf("packageWeight is greater than: 3,10");
}

if(packageWeight > 10 && packageWeight <= 20){
System.out.printf("packageWeight greater than:10,20");
}

 

if(shippingCost < 20){
shippingCost = 20;
System.out.printf("shippingCost greater than %n:20");
}
if(packageWeight < 50){
packageWeight = 50;
System.out.printf("packageWeight greater than %n: 20");

System.out.println("the package cannot be shipped");



}

}

}