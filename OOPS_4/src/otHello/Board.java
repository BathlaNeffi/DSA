package otHello;

public class Board {
	private  static char board[][];
	private  static final int BOARDSIZE=8;
	final static char player1Symbol = 'B';
	final static char player2Symbol = 'W';
	final static char EMPTY=' ';
	public Board() {
		board = new char[BOARDSIZE][BOARDSIZE];
		for(int i=0;i<BOARDSIZE;i++) {
			for(int j=0;j<BOARDSIZE;j++) {
				board[i][j]=EMPTY;
			}
		}
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;

	}

	public void print() {
		System.out.println("---------------------------------");
		System.out.print("[ X ] ");
		for(int i = 0; i < 8; i++) {
			System.out.print("[ "+i+" ] ");
		}

		System.out.println();
		for(int i = 0; i < 8;i++) {
			System.out.print("[ "+i +" ] ");
			for(int j = 0; j < 8; j++) {

				System.out.print("| "+ board[i][j]+" | ");
			}
			System.out.println();



		}
		System.out.println();
		System.out.println("---------------------------------");
	}

	public static  boolean move(char symbol, int x, int y) {
		if(x<0|| y<0|| x>=BOARDSIZE||y>=BOARDSIZE||board[x][y]!=EMPTY) {
			return false;
		}
		int [] x_Dir= {-1,-1,0,+1,+1,+1,0,-1};
		int [] y_Dir= {0,+1,+1,+1,0,-1,-1,-1};
		int c=0;

		for(int i=0;i<x_Dir.length;i++) {
			int X=x+x_Dir[i];
			int Y=y+y_Dir[i];
			int count=0;
			boolean valid=true;
			while(X>=0 && Y>=0 && X<BOARDSIZE && Y<BOARDSIZE && board[X][Y]!=EMPTY && board[X][Y]!=symbol ) {
				count++;
				X += x_Dir[i];
				Y += y_Dir[i];
			}
			if(count==0) {
				valid=false;
			}
			if(valid && board[X][Y]==symbol) {
				board[x][y]=symbol;

				X = x + x_Dir[i];
				Y = y + y_Dir[i];
				while(X>=0 && Y>=0 && X<8 && Y<8 &&  board[X][Y]!=EMPTY &&  board[X][Y]!=symbol) {
					board[X][Y] = symbol;
					X += x_Dir[i];
					Y += y_Dir[i];

				}
				c++;
			}

		}
		if(c==0) {
			return false;
		}
		return true;
	}
}
