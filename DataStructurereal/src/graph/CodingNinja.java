package graph;

import java.util.Scanner;

public class CodingNinja {

	public static boolean solveHelper(char[][] graph2, int N, int M, int i, int j,boolean [][] visited, String strToCheck) {

		boolean result;
		

		if(strToCheck.length()==0) {
			visited[i][j]=true;
			return true;
		}
		visited[i][j]=true;
		char nextChar=strToCheck.charAt(0);
		//		1
		int a=i-1;
		int b=j;



		if(a>=0 && b<M &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}
		}
		//		2
		a=i-1;
		b=j+1;
		if(a>=0 && b<M &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}

		}
		//		 3
		a=i;
		b=j+1;
		if(a<N&& b<M &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}
		}
		//		 4

		a=i+1;
		b=j+1;
		if(a<N&& b<M &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result=solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}

		}
		//		 5
		a=i+1;
		b=j;

		if(a<N&& b<M &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}

		}
		//		 6
		a=i+1;
		b=j-1;
		if(a<N&& b>=0 &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}

		}
		//		 7
		a=i;
		b=j-1;
		if(a<N&& b>=0 &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result=solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}

		}
		//		 8
		a=i-1;
		b=j-1;
		if(a>=0 && b>=0 &&graph2[a][b]==nextChar && !visited[a][b]) {
			visited[a][b]=true;
			result= solveHelper(graph2, N, M, a, b, visited, strToCheck.substring(1));
			if(result) {
				return result;
			}
			else {
				visited[a][b]=false;
			}
			

		}
		
		
		return false;


	}

	public static int solve2(String[] Graph , int N, int M)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		String strTochek="ODINGNINJA";
		boolean result=false;
		boolean [] []visited=new boolean[N][M];


		char graph2[][]=new char[N][M];
		for(int i=0;i<N;i++) {
			String str=Graph[i];
			for(int j=0;j<M;j++) {
				graph2[i][j]=str.charAt(j);
			}
		}


		for(int i=0;i<N;i++) {
			String str=Graph[i];
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='C') {
					
					result=solveHelper(graph2, N, M, i, j, visited,strTochek);
					if(result) {
						break;
					}
					
					
					
				}
			}
		}

		if(result) {
			return 1;
		}
		else {
			return 0;
		}


	}
	
	
	
	
	 public static int solve(String[] Graph , int N, int M)
		{
			String searchingString = "CODINGNINJA";
			boolean[][] visited = new boolean[Graph.length][];
			for(int i=0;i<Graph.length;i++) {
				visited[i] = new boolean[Graph[i].length()];
			}

			for(int i=0;i<Graph.length;i++) {

				for(int j=0;j<Graph[i].length();j++) {
					if(Graph[i].charAt(j) == 'C' ) {
						
						boolean ans =  dfs( Graph,visited,searchingString.substring(1),i,j);
						if(ans) {
							return 1;
						}
	                   

					}
				}

			}
			return 0;

		}

		public static boolean dfs(String[] graph, boolean[][] visited, String searchString,int i,int j) {

			if(searchString.length() == 0) {
				visited[i][j] = true;
				return true;
			}

			visited[i][j] = true;
			// To traverse in 8 different directions
			int[] X_Dir = {-1,1,0,0,1,-1,1,-1 };
			int[] Y_Dir = {0,0,-1,1,1,-1,-1,1 };

			for(int k=0;k<X_Dir.length;k++) {

				int x = i+ X_Dir[k];
				int y = j+ Y_Dir[k];

				if( x>=0 && y>=0 && x< graph.length &&
						y < graph[x].length() && 
						graph[x].charAt(y) ==searchString.charAt(0) && !visited[x][y]  ) {

					boolean smallAns = dfs(graph, visited, searchString.substring(1), x, y);
					if(smallAns) {
						return smallAns;
					}
					
				}


			}
			
			visited[i][j] = false;
			return false;


		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Graph[]= {"CANI", "OOJN","DDIG","JNIN"};
		int result=solve2(Graph, 4, 4);
		System.out.println(result);




	}

}
