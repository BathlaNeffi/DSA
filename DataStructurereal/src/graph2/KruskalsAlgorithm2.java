package graph2;

import java.util.Arrays;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2>{
	int v1;
	int v2;
	int weight;
	
	Edge2(int v1,int v2, int weight){
		this.v1=v1;
		this.v2=v2;
		this.weight=weight;
	}

	@Override
	public int compareTo(Edge2 o) {
		// TODO Auto-generated method stub
		return this.weight-o.weight;
	}
}

public class KruskalsAlgorithm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int e=s.nextInt();
		int n=s.nextInt();
		
		Edge2 input[]=new Edge2[e];
		for(int i=0;i<e;i++) {
			int v1=s.nextInt();
			int v2=s.nextInt();
			int weight=s.nextInt();
			Edge2 edge=new Edge2(v1,v2,weight);
			input[i]=edge;
		}
		
		Arrays.sort(input);
		
		kruskalAlgroithm(input,n);
		

	}

	private static void kruskalAlgroithm(Edge2[] input, int n) {
		// TODO Auto-generated method stub
		
		Edge2[]MST=new Edge2[n-1];
		int parent[]=new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		
		int count =0,i=0;
		while(count<n-1) {
			Edge2 edge=input[i++];
			int parentv1=findParent(edge.v1,parent);
			int parentv2=findParent(edge.v2, parent);
			if(parentv1!=parentv2) {
				parent[parentv1]=parentv2;
				MST[count]=edge;
				count++;
			}
			
			
			
		}
		
		for(Edge2 edge:MST) {
			if(edge.v1<edge.v2) {
				System.out.println(edge.v1+" "+ edge.v2+" "+ edge.weight);
				
			}
			else {
				
				System.out.println(edge.v2+" "+ edge.v1+" "+ edge.weight);
			}
		}
		
		
		
	}

	private static int findParent(int v1, int[] parent) {
		// TODO Auto-generated method stub
		
		if(v1==parent[v1]) {
			return v1;
		}
		return findParent(parent[v1], parent);
		
		
	}

}
