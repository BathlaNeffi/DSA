package array2d;

import java.util.Scanner;

public class SumOfBoundariesAndDiagonals {
	public static void print2Darray(int  [] [] arr2d ) {
		int row=arr2d.length;
		int col=arr2d[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int [] [] takeinput() {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter no. of rows: ");
		int row=s.nextInt();
		System.out.println("Enter no. of columns: ");
		int col=s.nextInt();
		int [] [] arr2d=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				//				System.out.println("Enter the element at "+i+"th row "+j+"th column");
				arr2d[i][j]=s.nextInt();
			}
		}
		return arr2d;
	}
	public static void sumofBoundaries(int [][] arr) {
		int n=arr.length;
		int sum=0;
		//boundaries in the first and last row.
		for(int i=0;i<n;i++) {
			sum+=arr[0][i];
			sum+=arr[n-1][i];
		}
		System.out.println(sum);
		//boundaries in the first and last column
		
		for(int i=1;i<n-1;i++) {
			sum+=arr[i][0];
			sum+=arr[i][n-1];
		}
		System.out.println(sum);
		//now left and right diagonals
		for(int i=1;i<n-1;i++) {
			sum+=arr[i][i];
			sum+=arr[i][n-i-1];
		}
		System.out.println(sum);
		if(n%2!=0) {
			sum-=arr[(n-1)/2][(n-1)/2];
		}
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] new2d=takeinput();


//		print2Darray(new2d);
		sumofBoundaries(new2d);
		


	}

}
