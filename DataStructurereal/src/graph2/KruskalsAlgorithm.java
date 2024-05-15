package graph2;

import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	
	Edge(int source, int dest, int weight){
		this.source=source;
		this.dest=dest;
		this.weight=weight;
	}

	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}

	

}


public class KruskalsAlgorithm {


	public static void kruskals(Edge[] input, int n) {

		Edge output[]=new Edge[n-1];
		int parent[]=new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}

		int count =0;
		int i=0;

		while(count<n-1&& i<input.length) {

			int parentSource=parent(parent,input[i].source);
			int parentDest=parent(parent,input[i].dest);

			if(parentDest == parentSource) {
				i++;
				continue;
			}
			output[count] = input[i];
			parent[parentSource] = parentDest; 
			count++;
			i++;


		}

		for(Edge edge : output) {
			if(edge.source < edge.dest)
				System.out.println( edge.source +" "+ edge.dest+" "+ edge.weight);
			else {
				System.out.println(edge.dest+" "+ edge.source+" " + edge.weight);
			}
		}


	}

	public static int parent(int[]parent,int i) {
		if(parent[i]==i) {
			return i;
		}
		return parent(parent, parent[i]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();

		Edge[] input=new Edge[e];

		for(int i=0;i<e;i++) {
			int sv = s.nextInt();
			int ev = s.nextInt();
			int weight = s.nextInt();
			Edge edge=new Edge(sv, ev,weight);
			input[i]=edge;
		}


		Arrays.sort(input);

		kruskals(input, n);








	}
}
