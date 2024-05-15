package graph;
import java.util.Scanner;

public class isConnected {
	
	public static boolean [] dftransversalHelper2(int [][] adjMatrix,int currVertex,boolean[] visited) {

		visited[currVertex]=true;
//		System.out.print(currVertex+" ");

		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currVertex][i]==1&& !visited[i]) {

				//i is nebhiour of the currVertex
				dftransversalHelper2(adjMatrix, i,visited);
			}
		}
		return visited;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int v=s.nextInt();

		int [][] adjMatrix=new int[n][n];
		for(int i=0;i<v;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			adjMatrix[v1][v2]=1;
			adjMatrix[v2][v1]=1;
		}
		
		
		if(n!=0) {
		boolean visited[]=new boolean[n];
				
				
			boolean check[]=	dftransversalHelper2(adjMatrix, 0,visited);
			boolean temp=true;;
			for(boolean i:check) {
				if(i==false) {
					temp=false;
				}
			}
			
			System.out.println(temp);
		}
		else{
			System.out.println(true);
		}
		
		
		

	}

}
