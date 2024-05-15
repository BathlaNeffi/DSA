package otHello;

import java.util.Scanner;

public class othHello {
	private Player player1,player2;
	private Board board;
	private static int numCount;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		othHello o=new othHello();
		o.startGame();

	}
	
	private void startGame() {
		Scanner s=new Scanner(System.in);
		//take player input
		player1=takeplayerInput(++numCount);
		player2=takeplayerInput(++numCount);
		// create board
		board=new Board();
		// start the game or trigger the game
		boolean  player1Turn=true;
		boolean status=true;
		
		int n=s.nextInt();
		while(n>0) {
			if(player1Turn) {
				System.out.println("Player 1 - "+ player1.getName()+"'s Turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				status=Board.move(Board.player1Symbol,x,y);
				if(!status) {
					continue;
				}
				
				
			}
			else {
				System.out.println("Player 2 - "+ player2.getName()+"'s Turn");
				System.out.println("Enter x: ");
				int x=s.nextInt();
				System.out.println("Enter y: ");
				int y=s.nextInt();
				status=Board.move(Board.player2Symbol,x,y);
				if(!status) {
					continue;
				}
				
			}
			
			player1Turn=!player1Turn;
			board.print();
			
		}
		
		
		
		
		
	}

	private Player takeplayerInput(int num) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Player "+ num+" name : ");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		Player p=new Player(name);
		
		
		return p;
	}

}