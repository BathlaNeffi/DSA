package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPath_DFS {

	public static ArrayList<Integer> getPathDfsHelper(int [][]adjMatrix, boolean [] visited, int s , int e){
		
		if(s==e) {
			ArrayList<Integer> path=new ArrayList<>();
			path.add(s);
			return path;
		}
		
	
		
		
		visited[s]=true;
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[s][i]==1&& !visited[i]) {
				ArrayList<Integer> smallPath;
				smallPath=getPathDfsHelper(adjMatrix, visited, i, e);
				
				if(smallPath!=null) {
						
					smallPath.add(s);
					return smallPath;
				}
			}
		}
		
		
		
		return null;
		
	}

	public static ArrayList<Integer> getPathDfs(int [][]adjMatrix,int s, int e){
		
		boolean [] visited =new boolean[adjMatrix.length];
		
		return getPathDfsHelper(adjMatrix, visited, s, e);

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
		
		int st=s.nextInt();
		int e=s.nextInt();
		
		
		ArrayList<Integer> path=getPathDfs(adjMatrix, st, e);
		
		if(path!=null) {
			for(int i:path) {
				System.out.print(i+" ");
			}
		}
		
		



	}

}
