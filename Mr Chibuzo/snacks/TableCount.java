import java.util.Scanner;
public class TableCount{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

System.out.print("Enter length of table:" );
int numTable = input.nextInt();
System.out.println("a" + "           b" );

for(int count = 1; count <= numTable; count++){
int pow = 1;

	for( int counter = 0; counter <=count; counter++){
	 pow = pow * count;
}
System.out.println(count + "           " + (count + 1) + "  " + pow);






}
 









  }
}