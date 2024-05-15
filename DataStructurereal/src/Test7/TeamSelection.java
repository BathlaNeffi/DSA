package Test7;

import java.util.Scanner;

public class TeamSelection {
	
	
	
	public static void teamSelection2(int arr[], int data[], int start,int end, int index, int r) {
		
		if(index==r) {
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}
		
		
		for(int i=start;i<=end&& index<r;i++) {
			arr[index]=data[i];
			teamSelection(arr, data, start+1, end, index+1, r);
		}
		
		
	}



	public static void teamSelection(int arr[], int data[], int start,int end, int index, int r) {
		
		if (index == r)
		{
			for (int j=0; j<r; j++)
				System.out.print(data[j]+" ");
			System.out.println("");
			return;
		}

		for (int i=start; i<=end && end-i+1 >= r-index; i++)
		{
			data[index] = arr[i];
			teamSelection(arr, data, i+1, end, index+1, r);
		}
	}
	
	
	public static void printCombination(int arr[], int n, int r)
    {
      
        int data[]=new int[r];
 
      
        teamSelection(arr, data, 0, n-1, 0, r);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		int[] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		printCombination(arr, n, 12);


	}

}
