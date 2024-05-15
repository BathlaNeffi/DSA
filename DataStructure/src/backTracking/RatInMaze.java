package backTracking;

public class RatInMaze {



	static void ratInAMaze2(int maze[][], int n) {
		/* 
		 * Your class should be named Solution.
		 * Write your code here
		 */

		int path[][]=new int[maze.length][maze.length];


		printAllPaths(maze,path, 0, 0);
	}






	public static void printAllPaths(int maze[][] ,int path[][],int x,int y ) {
		int n=maze.length;
		if(x<0|| x>=n|| y<0|| y>=n||maze[x][y]==0|| path[x][y]==1) {
			return;
		}

		path[x][y]=1;

		if(x==n-1&&y==n-1) {
			for( int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(path[i][j]+" ");
				}
				
			}
			System.out.println();
		

			path[x][y]=0;
			return;
		} 	

		//top

		printAllPaths(maze, path, x-1, y);

		// down
		printAllPaths(maze, path, x+1, y);
		// left
		printAllPaths(maze,path,x,y-1);
		//right
		printAllPaths(maze,path,x,y+1);

		path[x][y]=0;



	}










	public static boolean helper(int maze[][] ,int path[][],int x,int y ) {
		int n=maze.length;
		if(x<0|| x>=n|| y<0|| y>=n||maze[x][y]==0|| path[x][y]==1) {
			return false;
		}

		path[x][y]=1;

		if(x==n-1&&y==n-1) {
			for( int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}


			return true;
		} 	

		//top

		if(helper(maze, path, x-1, y)) {
			return true;
		}
		//right
		if(helper(maze,path,x,y+1)) {
			return true;
		}

		// down
		if(helper(maze, path, x+1, y)) {
			return true;
		}

		// left
		if(helper(maze, path, x, y-1)) {
			return true;
		}

		return false;



	}



	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		 *Don't write main().
		 *Don't take input, it is passed as function argument.
		 *Don't print output.
		 *Taking input and printing output is handled automatically.
		 */ 

		int path[][]=new int[maze.length][maze[0].length];
		return helper(maze, path, 0, 0);







	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maze[][]= {{1,1,0},{1,1,0},{1,1,1}};
//		boolean check=ratInAMaze(maze);
//		System.out.println(check);
		
		ratInAMaze2(maze,maze.length);
		
		


	}

}
