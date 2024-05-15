package array2d;

import java.util.Scanner;

public class SinWave {
	
	public static void waveForm(int [][] arr) {
		int n=arr.length;
		if(n==0) {return;}
		int m=arr[0].length;
		for(int j=0;j<m;j++) {
			if(j%2==0) {
				for(int i=0;i<n;i++) {
					System.out.print(arr[i][j]+" ");
				}}
				else {for(int i=n-1;i>=0;i--) {
					System.out.print(arr[i][j]+" ");
				}
				}
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] new2d=takeinput();

		waveForm(new2d);



	}

}
