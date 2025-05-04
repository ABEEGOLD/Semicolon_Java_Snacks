import java.util.Scanner;
public class Currency{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the exchange rate: ");
double currency = input.nextDouble();
System.out.print("Enter to convert to dollars to rmb:");
double convertDollars = input.nextDouble();
System.out.print("Enter the dollar amount:");
double dollarAmount = input.nextDouble();


 
double exchangeRate = 0;
double converttDollars = 1;
double chineseRmb = 681.0;
double dollarrAmount = 100;  
exchangeRate = converttDollars * chineseRmb * dollarrAmount;
double converttdollars = 681.0 * 100 * 1;


if(exchangeRate < 0){
System.out.printf("exchangeRate is %d%n",0);
}

if(converttDollars > 1){
System.out.printf("convert 681.0 * 100 * 1");
}
 




}
}