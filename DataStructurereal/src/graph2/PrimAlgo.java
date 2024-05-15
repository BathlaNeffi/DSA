package graph2;
import java.util.Scanner;

public class PrimAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		Edge[] input=new Edge[E];

		for(int i=0;i<E;i++) {
			int sc=s.nextInt();
			int dt=s.nextInt();
			int wt=s.nextInt();
			Edge edge=new Edge(sc,dt,wt);
			input[i]=edge;
		}

		primS(input,V);



	}

	public  static void primS(Edge[] input, int v) {
		// TODO Auto-generated method stub
		boolean []visited=new boolean[v];
		int parent[]=new int[v];
		parent[0]=-1;
		

		int weight[]=new int[v];
		
		for(int i=1;i<v;i++) {
			weight[i]=Integer.MAX_VALUE;
		}
		weight[0]=0;

		for(int i=1;i<v;i++) {
			int minVertex=findMinVerted(visited,weight);
			visited[minVertex]=true;

			for(int x=0;x<input.length;x++) {
				Edge edge=input[x];
				if(edge.source==minVertex && !visited[edge.dest]) {
					if(edge.weight<weight[edge.dest]) {
						weight[edge.dest]=edge.weight;
						parent[edge.dest]=minVertex;
					}
				}
				else if(edge.dest==minVertex&& !visited[edge.source]) {
					if(edge.weight<weight[edge.source]) {
						weight[edge.source]=edge.weight;
						parent[edge.source]=minVertex;
					}
				}

			}
		}


		Edge output[]=new Edge[v-1];
		for(int i=1;i<v;i++) {
			int sc=parent[i];
			int dt=i;
			int wt=weight[i];
			Edge edge=new Edge(sc,dt,wt);
			output[i-1]=edge;
		}
		
		for(Edge edge : output) {
			if(edge.source < edge.dest)
				System.out.println( edge.source +" "+ edge.dest+" "+ edge.weight);
			else {
				System.out.println(edge.dest+" "+ edge.source+" " + edge.weight);
			}
		}


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
