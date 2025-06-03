import java.util.Scanner;

	public class TicTacToe{
		static String[] board = {" "," "," "," "," "," "," "," "," "};


		public static void displayBoard(String[] board){
			for (int i = 0; i < board.length; i++){
				System.out.print(board[i] + " | ");
				if(i == 2){
					System.out.println("\n------------");
				}else if (i == 5){

					System.out.println("\n------------");
				}
			}
		}

public static Boolean hasWon(String[] board, String token){
	Boolean won = false;
	if(board[0].equals(token) && board[1].equals(token) && board[2].equals(token)){
		won = true;
	}
	return won;

}


public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	displayBoard(board);
	int limit = 0;
	int choice;


	while (limit< board.length){
		  if(limit % 2 == 0){
			System.out.println("\nplayer Abee turn");
			System.out.println("enter position to play (1-9)");
			choice = input.nextInt();
			if(choice >= 0 && choice < 9 && board[choice -1] == " "){
				board[choice -1] = "X";
				displayBoard(board);
				if(hasWon(board,"tokenX")){
					System.out.println("\nplayer Abee has won");
					break;
				}
			}
			else{
				System.out.println("invalid input, play again master");
			}

		  }   else {
			System.out.println("\nplayer madre turn");
			System.out.println("enter position to play (1 - 9)");
			choice = input.nextInt();
			if (choice >= 0 && choice < 9 && board[choice - 1] == " "){
				board[choice - 1] = "0";
				displayBoard(board);
				if(hasWon(board,"token0")){
					System.out.println("\nplayer madre has won");
					break;
				}
			}
			else {
				System.out.println("invalid input commando");
			}

		} 
		limit++;
	  }
     }
}