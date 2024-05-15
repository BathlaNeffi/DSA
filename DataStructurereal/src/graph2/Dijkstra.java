package graph2;

import java.util.Scanner;

public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int [][]adjMatrix=new int[n][n];

		for(int i=e;i>0;i--) {
			int sc=s.nextInt();
			int dt=s.nextInt();
			int cost=s.nextInt();
			adjMatrix[sc][dt]=cost;
			adjMatrix[dt][sc]=cost;
		}


		boolean visited[]=new boolean [n];
		int []distance=new int[n];
		for(int i=1;i<n;i++) {
			distance[i]=Integer.MAX_VALUE;}


		for(int i=0;i<n;i++) {
			int minVertex=findMinVerted(visited, distance);
			visited[minVertex]=true;
			for(int j=0;j<n;j++) {
				if(adjMatrix[j][minVertex]>0 && !visited[j]) {
					int dist=distance[minVertex]+ adjMatrix[j][minVertex];
					if(dist<distance[j]) {
						distance[j]=dist;
					}
				}
			}
		}

		for(int i=0;i<n;i++)
			System.out.println(i+" "+distance[i]);

	}



	private static int findMinVerted(boolean[] visited, int[] weight) {

		// TODO Auto-generated method stub	

		int minVertex=-1;

		for(int i=0;i<visited.length;i++) {
			if(!visited[i] &&  (minVertex==-1|| weight[minVertex]>weight[i])) {
				minVertex=i;
			}
		}
		return minVertex;
	}

}
