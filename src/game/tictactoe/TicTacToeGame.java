package game.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	//created method createboard
	public static void  createBoard() {
		char [] board = new char[10];
		
		for(int i = 0 ;i < board.length ; i++)
		{
			board[i] = ' ';
		}
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
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		createBoard();
		chooselater();
	}
}
