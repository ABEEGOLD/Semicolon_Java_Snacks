import java.util.Scanner;
public class ValidScore{
public static void main(String[] args){


Scanner input = new Scanner(System.in);

int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countF = 0;
int invalid =0;

for(int count = 1; count != 10;){
System.out.print("Enter student valid score from 0 and 100:");
int studentScore = input.nextInt();

if(studentScore < 0 || studentScore > 100){
 System.out.print("invalid input");
invalid++;
continue;
}
int userInput;

userInput = studentScore / 10;

switch(userInput){

     case 10: 
     case 9:
     case 8: {
              System.out.println("A");
	      countA++;
              break; }

	case 7: {
		System.out.println("B");
        	countB++;
        	break;
		}
        case 6: {
		System.out.println("C");
               	countC++;
               	break;
        	}
        case 5: {
		System.out.println("D");
              	countD++;
              	break;
		}

        default:{ 
		System.out.println("F");
             	countF++;
             	break;
  		}
}
count++;
}

System.out.println("The Number Of students that scored A:   " + countA);
System.out.println("The Number Of students that scored B:   " + countB);
System.out.println("The Number Of students that scored C:   " + countC);
System.out.println("The Number Of students that scored D:   " + countD);
System.out.println("The Number Of students that scored F:   " + countF);

System.out.printf("The invalid number is %d%n",invalid);









   }


}