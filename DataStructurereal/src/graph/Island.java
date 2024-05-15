package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Island {
	
	

	public static void bftransversal2(int [][] adjMatrix, int currVertex,boolean [] visited) {
		
		
		Queue<Integer> pendingVertices=new LinkedList<>();

		pendingVertices.add(currVertex);
		visited[currVertex]=true;
		while(!pendingVertices.isEmpty()) {
			currVertex=pendingVertices.poll();
//			System.out.print(currVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i]==1 && visited[i]==false ) {
					pendingVertices.add(i);
					visited[i]=true;

				}
			}
			
		}
	
	}
	
	
	public static int  bftransversal(int [][] adjMatrix) {
		int result=0;
		
		boolean visited[]=new boolean[adjMatrix.length];
		for(int i=0;i<adjMatrix.length;i++) {
			while(!visited[i]) {
				bftransversal2(adjMatrix,i,visited);
				result++;
			}
		}
		return result;
		
	}
	
	
	public static int numConnected(int[][] edges, int n) {
		return bftransversal(edges);
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
		
		System.out.println(numConnected(adjMatrix, n));
		
		

	}

}
