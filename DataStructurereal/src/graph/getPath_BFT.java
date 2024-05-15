package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class getPath_BFT {
	
	
	
	




	public static ArrayList<Integer> getPathBft(int adjMatrix[][], int sc, int e){
		ArrayList<Integer> result=new ArrayList<>();
		Queue<Integer> pendingVertices=new LinkedList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		boolean [] visited=new boolean [adjMatrix.length];
		visited[sc]=true;
		pendingVertices.add(sc);
		map.put(sc, -1);
		while(!pendingVertices.isEmpty()) {
			int currVertex=pendingVertices.poll();
			//			System.out.print(currVertex+" ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currVertex][i]==1 && visited[i]==false ) {
					map.put(i, currVertex);
					pendingVertices.add(i);
					visited[i]=true;


				}
				if(i==e) {

					break;
				}
			}
		}


//		result.add(e);
		while(map.get(e)!=null  &&map.get(e)!=-1){
			
			result.add(e);
			int nextParent=map.get(e);
			e=nextParent;
		}
		
		if(!result.isEmpty()) {
		result.add(e);
		return result;
		}
		return null;


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

		ArrayList<Integer> path=getPathBft(adjMatrix, st, e);

		if(path!=null) {
			for(int i:path) {
				System.out.print(i+" ");
			}
		}


	}

}
