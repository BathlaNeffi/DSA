package Test7;

import java.util.Scanner;

public class Strangeisland {


	public static void strangeIsland(char[][]map) {

		int m=map.length;
		int n=map[0].length;





		for(int i=0;i<m;i++) {


			for(int j=0;j<n;j++) {

				if(map[i][j]=='X') {
					int ans=0;

					int x,y;
					x=i-1;
					y=j;
					if(x<0||x>=m||y<0||y>=n) {
						ans+=1;
					}
					else {
						if(map[x][y]=='.') {
							ans+=1;
						}
					}
					x=i;
					y=j+1;
					if(x<0||x>=m||y<0||y>=n) {
						ans+=1;
					}
					else {
						if(map[x][y]=='.') {
							ans+=1;
						}
					}

					x=i+1;
					y=j;
					if(x<0||x>=m||y<0||y>=n) {
						ans+=1;
					}
					else {
						if(map[x][y]=='.') {
							ans+=1;
						}
					}

					x=i;
					y=j-1;
					if(x<0||x>=m||y<0||y>=n) {
						ans+=1;
					}
					else {
						if(map[x][y]=='.') {
							ans+=1;
						}
					}

					if(ans>=3) {
						map[i][j]='?';
					}

				}

			}

		}

		





		int sx=0,ex=0,sy=0,ey=0;
		for(int i=0;i<m;i++) {
			for( int j=0;j<n;j++) {
				if(map[i][j]=='X') {
					if(sx==0&&sy==0) {
						sx=i;
						sy=j;
					}

					if(j<sy) {
						sy=j;
					}
					if(ex<i) {
						ex=i;
					}
					if(ey<j) {
						ey=j;
					}


				}
			}

		}
		
		
		int wonder=0;
		
		
		
		for(int i=sx;i<=ex;i++) {
			for(int j=sy;j<=ey;j++) {
				if(map[i][j]=='X') {
					wonder+=1;
					
				}
				
				
				

			}
			

		}
		
		if(wonder==0) {
			return;
		}
		
		
		
		for(int i=sx;i<=ex;i++) {
			for(int j=sy;j<=ey;j++) {
				if(map[i][j]=='?') {
					map[i][j]='.';
					
				}
				
				System.out.print(map[i][j]);
				

			}
			System.out.println();

		}

		




	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		int m=s.nextInt();
		int n=s.nextInt();

		char map[][]=new char [m][n];

		for(int i=0;i<m;i++) {
			String row=s.next();
			for(int j=0;j<n;j++) {

				map[i][j]=row.charAt(j);

			}
		}

		strangeIsland(map);





	}

}
