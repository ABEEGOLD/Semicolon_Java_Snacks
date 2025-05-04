    import java.util.Scanner;
     public class CountPositive{
      public static void main(String[] args){

        Scanner input = new Scanner(System.in);
         
         

           System.out.print("Enter an integer:");
           int number = input.nextInt();
           
           System.out.print("The positive number:");
           int positive = input.nextInt();

           System.out.print("The number of negative:");
           int negative = input.nextInt();


            int total = negative + positive;
            double average = negative % positive;  
           

         while(negative < positive){
         if(positive > negative){
          }
          break;
           
          
          if(total + positive <= negative){
            number = positive + negative;
            System.out.print("The total is " + total);
           }break;


           if(average % positive >= negative){
            number = negative / positive;
            System.out.print("The average is " + average);
            }else if(positive != negative % 0){
            }    System.out.print(0);
         

          
         }
    }

}