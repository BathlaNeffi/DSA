package FullTest2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeathGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		
		System.out.println(safePos(n,k));

	}

	private static int safePos(int n, int k) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			al.add(i);
		}
		
		int result=solve(al,k-1,0);
		
		
		return result;
	}

	private static int solve(ArrayList<Integer> al, int k, int index) {
		// TODO Auto-generated method stub
		
		if(al.size()==1) {
			return al.get(0);
		}
		index = (index + k) % al.size();

		al.remove(index);
		return solve(al, k, index);
		
		

	}

}
