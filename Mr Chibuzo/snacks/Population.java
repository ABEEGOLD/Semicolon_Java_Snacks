import java.util.Scanner;
public class Population{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Estimated world population: ");
double worldPopulation = input.nextDouble();
System.out.print("annual growth rate");
double annualGrowthRate = input.nextDouble();

double r = 0.09;
double sss = (1 + r) * worldPopulation;
double oneYear = 0;
double secondYear = 0;
double thirdYear = 0;
double fourthYear = 0;
double fifthYear = 0;

worldPopulation = annualGrowthRate + 1;
oneYear = (1 + r);
secondYear = oneYear * (1 + r) + (1 + r);
thirdYear = secondYear * (1 + r) + (1 + r) + (1 + r);
fourthYear = thirdYear * (1 + r) + (1 + r) + (1 + r) + (1 + r);
fifthYear = fourthYear * (1 + r) + (1 + r) + (1 + r) + (1 + r) + (1 + r);




System.out.printf("Estimated world population for oneYear is %f%n", worldPopulation);
System.out.printf("Estimated world population for secondYear is %f%n", worldPopulation);
System.out.printf("Estimated world population for thirdYear is %f%n", worldPopulation);
System.out.printf("Estimated world population for fourthYear is %f%n", worldPopulation);
System.out.printf("Estimated world population for fifthYear is %f%n", worldPopulation);









}


}