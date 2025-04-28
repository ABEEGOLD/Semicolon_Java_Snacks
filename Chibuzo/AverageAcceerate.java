		import java.util.Scanner;
		public class AverageAcceerate{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter starting velocity in meters/second:");
		double startingVel = input.nextDouble();

		System.out.print("Enter ending velocity in meters/second:");
		double endingVel = input.nextDouble();
		
		System.out.print("Enter time span t in seconds:");
		Double timeSpan = input.nextDouble();


		double average = (endingVel - startingVel) /timeSpan;
		System.out.printf("Average is %f%n", average);
		

			 	









		}




}