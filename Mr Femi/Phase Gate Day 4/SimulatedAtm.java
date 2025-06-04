import java.util.Scanner;

public class SimulatedAtm{
	public static float balanceAmount(float balance){
		if(balance < 100){
		
		}return balance;

		

	}
public static int withdrawalAmount(int balance,int moneyWithdraw){
	balance = balance - moneyWithdraw - 100;
		if(moneyWithdraw > balance){
			
			}return balance;



}


public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome To ABEE Bank!!!!!!");
		String BankApp = """

		1.Balance
		2.Account log
		3.exit

""";

	System.out.print(BankApp);

	
	System.out.print("Enter the balance:");
	float balance = input.nextFloat();

	System.out.print("Enter withdrawal amount must be multiples of $500 or $1000 only:");
		float moneyWithdraw = input.nextFloat();

		float reduction = balance - 100 - moneyWithdraw;  
		System.out.println("Withdrawal balance is:"+reduction);		

			if(moneyWithdraw % 500 == 0 && moneyWithdraw % 1000 == 0){
				System.out.println("Withdrawal fee is:"+100); 

				} 

			if(moneyWithdraw != 20000){
				System.out.println("You can't withdraw that amount");	
			}

			if(balance < 100){
				System.out.println("Insufficient account balance");
			}
			
			
	



}


}