package game.tictactoe;

public class TicTacToeGame {
	
	public void  board() {
		char [] board = new char[10];
		for(int i = 0 ;i < board.length ; i++)
		{
			board[i] = ' ';
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		TicTacToeGame tc = new TicTacToeGame();
		tc.board();
	}

}
