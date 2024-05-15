package graph;

import java.util.Scanner;

public class ThreeCycle {
	
	public static int solve(boolean[][] graph, int n) {
		/*
		 * Your class should be named Solution 
		 * You may write your code here
		 */
		int count=0;
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(graph[i][j]) {
					for(int k=0;k<n;k++) {
						if(k!=i && graph[k][j] && graph[i][k]) {
							count++;
						}
					}
				}
			}
		}
		
		
		return count/6;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int v=s.nextInt();

		boolean [][] adjMatrix=new boolean[n][n];
		for(int i=0;i<v;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			adjMatrix[v1][v2]=true;
			adjMatrix[v2][v1]=true;
		}
		
		int value=solve(adjMatrix, n);
		
		System.out.println(value);

	}

}
