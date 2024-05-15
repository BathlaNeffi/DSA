package graph;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class HasPath {
	
	public static boolean hasPath2(int [][] adjMatrix, int a, int b) {
		boolean hasPath=false;
		boolean [] visited=new boolean[adjMatrix.length];
		Queue<Integer> pendingVertices=new LinkedList<>();
		visited[a]=true;
		pendingVertices.add(a);
		
		while(!pendingVertices.isEmpty()) {
			int currVertex=pendingVertices.poll();
			if(currVertex==b) {
				hasPath=true;
				return true;
			
			}
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i]==1&& !visited[i]) {
					pendingVertices.add(i);
					visited[i]=true;
				}
				
				
			}
		}
		
		
		return hasPath;
		
	}
	
	public static boolean hasPath(int [][] adjMatrix, int currVertex, boolean [] visited, int b) {
		if(b>=adjMatrix.length) {
			return false;
		}
		
		boolean result=false;
		visited[currVertex]=true;
		
		if(adjMatrix[currVertex][b]==1) {
			return true;
		}
		
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currVertex][i]==1 && visited[i]==false) {
				 boolean  res=hasPath(adjMatrix, i, visited, b);
				
				 if(res && !result) {
					 result=res;
				 }
			}
		}
		return result;
		
		
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
		
		boolean visited[]=new boolean[n];
		int a=s.nextInt();
		int b=s.nextInt();
		
		
//		boolean check=hasPath(adjMatrix, a, visited, b);
		
		boolean check=hasPath2(adjMatrix, a, b);
		
		System.out.println(check);
		

	}

}
