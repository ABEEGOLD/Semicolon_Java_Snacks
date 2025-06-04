 
import java.util.Scanner;

public class SemicolonEmployeePayRoll{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	


	System.out.println("Welcome to Semicolon Employees Payroll");
	System.out.println("===================================");

	System.out.println("1.Add employee payroll");
	System.out.println("2.View employee payroll");
	System.out.println("3.Update employee payroll");
	System.out.println("4.Exit with -1");
	

			String name = " ";
		
	System.out.print("Enter 1-4:");
	//while(){
		
		int lists = input.nextInt();
		switch(lists){

			case 1:	System.out.println("1.Add employee payroll");
				System.out.println("Employee name:");
				name = input.nextLine();

				System.out.println("Numbers of hour worked in a week:");
				int daysWorked = input.nextInt();

				System.out.println("Hourly pay rate:");
				double payRate = input.nextDouble();

				System.out.println("federal tax withholding rate:");
				int fedTax = input.nextInt();

				System.out.println("State tax withholding rate:");
				int stateTax = input.nextInt();	
				
				
			case 2: System.out.println("View Employee payRoll:");



//}





}

}

}
