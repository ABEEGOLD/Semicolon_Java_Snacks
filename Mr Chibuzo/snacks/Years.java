import java.util.Scanner;
public class Years{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter minutes: ");
int minutes = input.nextInt();

int minutesPerYear = 365 * 24 * 60;
int minutesPerDay = 24 * 60;

int year = (minutes / minutesPerYear); 
int days = (minutes % minutesPerYear)/ minutesPerDay;

System.out.printf("1000000000 minutes is approximately %d years and %d days ", year, days);  






}


}