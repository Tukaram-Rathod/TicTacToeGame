package game.tictactoe;

//import java.util.Random;
import java.util.Scanner;
public class TicTacToeGame {
	static char[] board = new char[10];
	static void  createBoard() {
		for(int i = 0 ;i < board.length ; i++)
		{
			board[i] = ' ';
		}
		showBoard();
	}
	//chooseplayer who isplaying 
	public static void chooselater()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter X or O");
		char input = scanner.next().charAt(0);
		if(input == 'X'	&& input == 'x')
			System.out.println("X");
		else
			System.out.println("O");
	}

	private static void showBoard()
	{
		System.out.println("|---|---|---|");
		System.out.println("| " + board[1] + " | "
				+ board[2] + " | " + board[3]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[4] + " | "
				+ board[5] + " | " + board[6]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[7] + " | "
				+ board[8] + " | " + board[9]
						+ " |");
		System.out.println("|---|---|---|");
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		createBoard();
		chooselater();

	}
}
