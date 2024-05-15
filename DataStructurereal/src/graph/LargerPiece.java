package graph;

public class LargerPiece {
	
	
	public static int largerPiece(String edge[],int i, int j, boolean [][] visited) {
		visited[i][j]=true;
		
		int[] X_Dir = {-1,1,0,0 };
		int[] Y_Dir = {0,0,-1,1 };
		int sum=0;
		
		for(int k=0;k<X_Dir.length;k++) {
			int x=i+X_Dir[k];
			int y=j+Y_Dir[k];
			if( x>=0 && y>=0 && x< edge.length && y < edge[x].length() && edge[x].charAt(y) =='1' && !visited[x][y]  ) {
				int smallSum=largerPiece(edge, x, y, visited);
				sum=sum+smallSum;
			}
		
		}
		return sum+1;
		
	}
	
	
	public static int dfs(String[] edge, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		
		boolean visited[][]=new boolean[n][];
		int max=0;
		for(int i=0;i<edge.length;i++) {
			visited[i]=new boolean[edge[i].length()];
		}
		for(int i=0;i<edge.length;i++) {
			for(int j=0;j<edge[i].length();j++) {
				if(edge[i].charAt(j)=='1'&& !visited[i][j]) {
					
					int value=largerPiece(edge, i, j, visited);
					if(value>max) {
						max=value;
					}
				}
				
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] edge= {"1101","0110","1100"};
		System.out.println(dfs(edge, 3));

	}

}
