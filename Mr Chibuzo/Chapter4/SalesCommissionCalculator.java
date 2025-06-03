import java.util.Scanner;
public class SalesCommissionCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
			
		
		System.out.println("Enter -1 to exit or a right value to continue: ");

		int wages = 200;
		double actualPercentageCommission = 0.09; 
		double totalAmount = 0.00;
		
		double price = 0;
		int counter = 0;	
		
	while(price != -1){
		
		System.out.print("Enter price of item: ");
		price = input.nextInt();
			totalAmount +=price;
			counter+=1; 
			
}



			double totalCommission = wages + (totalAmount * 0.09); 
				System.out.print(totalCommission + " for " + counter + " items");











	}
}



/*



switch (priceOfItem){
				
				case 1: {
					amount = wages + price * 0.09; 
					System.out.print(amount); break;
					}


				case 2: amount = wages + price * 0.09; 
					break;
 
				case 3: amount = wages + 99.95 * 0.09; 
					break;

				case 4: amount = wages + 350.89 * 0.09; 
					break;
				default: amount = numberOfItem * (priceOfItem * 0.09) ;


			totalAmount = wages + amount;
			
			System.out.print("Total amount = " + totalAmount);

*/


			
		
	