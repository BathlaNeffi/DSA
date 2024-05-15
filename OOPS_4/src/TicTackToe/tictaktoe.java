package TicTackToe;

import java.util.Scanner;

public class tictaktoe {

	private Player player1, player2;

	private Board board;
	private  static int numPlayers;
	public static void main(String [] args) {

		tictaktoe t=new  tictaktoe();
		t.startGame();

	}


	public void startGame() {
		// take player input
		Scanner s=new Scanner (System.in);

		player1=takePlayerInput(++numPlayers);
		player2=takePlayerInput(++numPlayers);
		while(player1.getSymbol()==player2.getSymbol()) {
			System.out.println("Symbol already taken kinly enter the symbol again ");
			player2.setSymbol(s.next().charAt(0));
		}
		// make the board
		board=new Board(player1.getSymbol(), player2.getSymbol());
		
		// start the game or trigger the game
		
		boolean  player1Turn=true;
		int status=Board.INCOMPLETE;
		while(status==Board.INCOMPLETE|| status==Board.INVALIDMOVE) {
			
			if(player1Turn) {
				
				System.out.println("Player 1 - "+ player1.getName()+"'s Turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				status=board.move(player1.getSymbol(),x,y);
				if(status==Board.INVALIDMOVE) {
					System.out.println("Invalid move  !! Please  try Again !! ");
					continue;
				}
				
				
				
			}
			else {
				System.out.println("Player 2 - "+ player2.getName()+"'s Turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				status=board.move(player2.getSymbol(),x,y);
				if(status==Board.INVALIDMOVE) {
					System.out.println("Invalid move  !! Please  try Again !! ");
					continue;
				}
				
				
			}
			player1Turn=!player1Turn;
			Board.printBoard();
			
		}
		
		if(status==Board.PLAYER1WINS) {
			System.out.println("Player 1 - "+ player1.getName()+" Wins !!");
		}
		else if(status==Board.PLAYER2WINS) {
			System.out.println("Player 2 - "+ player2.getName()+" Wins !!");
		}
		else {
			System.out.println("Its a DRAW :)  and lets have another game tgo decide who is the best!!");
		}




	}


	private   Player takePlayerInput(int num) {

		Scanner s=new Scanner (System.in);
		System.out.println("Enter Player "+ num+" name : ");
		String player=s.next();
		System.out.println("Enter Player "+ num+" symbol : ");
		char symbol=s.next().charAt(0);
		Player p=new Player(player, symbol);
		return p;

	}


}
