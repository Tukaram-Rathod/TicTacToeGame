package game.tictactoe;

public class TicTacToeGame {
	
	public static void  board() {
		char [] board = new char[10];
		System.out.println("Welcome to the TicTacToe Game");
		for(int i = 0 ;i < board.length ; i++)
		{
			board[i] = ' ';
		}
	}
	public static void main(String[] args) {
			board();
	}
}
