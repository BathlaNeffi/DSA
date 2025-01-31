package graph;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {




	public static void bftransversal2(int [][] adjMatrix, int currVertex,boolean [] visited) {
		
		
		Queue<Integer> pendingVertices=new LinkedList<>();

		pendingVertices.add(currVertex);
		visited[currVertex]=true;
		while(!pendingVertices.isEmpty()) {
			currVertex=pendingVertices.poll();
			System.out.print(currVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i]==1 && visited[i]==false ) {
					pendingVertices.add(i);
					visited[i]=true;

				}
			}
			
		}
	
	}
	
	
	public static void  bftransversal(int [][] adjMatrix) {
		
		
		boolean visited[]=new boolean[adjMatrix.length];
		for(int i=0;i<adjMatrix.length;i++) {
			while(!visited[i]) {
				bftransversal2(adjMatrix,i,visited);
			}
		}
		
	}


	public static void dftransversalHelper2(int [][] adjMatrix,int currVertex,boolean[] visited) {

		visited[currVertex]=true;
		System.out.print(currVertex+" ");

		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currVertex][i]==1&& !visited[i]) {

				//i is nebhiour of the currVertex
				dftransversalHelper2(adjMatrix, i,visited);
			}
		}

	}


	public static void dftransversalHelper(int [][] adjMatrix,int currVertex) {

		System.out.print(currVertex+" ");

		for(int i=currVertex;i<adjMatrix.length;i++) {
			if(adjMatrix[currVertex][i]==1) {

				//i is nebhiour of the currVertex
				dftransversalHelper(adjMatrix, i);
			}
		}

	}


	public static void dftransversal(int [][] adjMatrix) {

		boolean visited[]=new boolean[adjMatrix.length];
		for(int i=0;i<adjMatrix.length;i++) {
		if(!visited[i]) {
		dftransversalHelper2(adjMatrix, i,visited);
		System.out.println();
		}
		
		}
	}




	public static void main(String[] args) {
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

//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(adjMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}


				dftransversal(adjMatrix);
		//		
		//		
//				bftransversal(adjMatrix);

	}


}
