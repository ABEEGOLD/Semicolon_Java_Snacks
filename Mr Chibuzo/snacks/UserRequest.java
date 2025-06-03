	import java.util.Scanner;
	public class UserRequest{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	while(true){
	
	String Calculation = """

	Making calculator
	1: Add
	2: subtraction
	3: multiplication
	4: division

""";
	System.out.print(Calculation);
	int userApplied = input.nextInt();


switch(userApplied){

	case 1:
		System.out.print("Enter two numbers:");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int Add = firstNumber + secondNumber;
		System.out.println("The sum of two number: " +Add);break;
		

	case 2:
		System.out.print("Enter two numbers:");
		int Number1 = input.nextInt();
		int Number2 = input.nextInt();
		int subtraction = Number1 - Number2;
		System.out.println("The sum of two number: " +subtraction);break;




       case 3: 
		System.out.print("Enter two numbers:");
		int firstAp = input.nextInt();
		int secondAp = input.nextInt();
		int multiplication = firstAp * secondAp;
		System.out.println("The sum of two number: " +multiplication);break;



 
	case 4: 
		System.out.print("Enter two numbers:");
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int division = firstNum % secondNum;
		System.out.println("The sum of two number: " +division);break;






}






}
	









	








   }
}
