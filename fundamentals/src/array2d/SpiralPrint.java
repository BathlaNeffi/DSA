package array2d;

import java.util.Scanner;

public class SpiralPrint {
	
	public static void spiral(int arr[][]) {
		int n=arr.length;
		if(n==0) {return;}
		int m=arr[0].length;
		int k=0,rs=0,re=n-1,cs=0,ce=m-1;
		while(k<m*n) {
			for(int i=cs;k<m*n && i<=ce&&k<m*n;i++) {
				
				System.out.print(arr[rs][i]+" ");
				k++;
				
				
			}
//			System.out.println();
//			System.out.println(k);
			rs+=1;
			for(int i=rs;k<m*n &&i<=re&&k<m*n;i++) {
				System.out.print(arr[i][ce]+" ");
				k++;
		}
//			System.out.println();
//			System.out.println(k);
			ce-=1;
			for(int i=ce;i>=cs&&k<m*n;i--) {
				System.out.print(arr[re][i] +" ");
				k++;
			}
//			System.out.println();
//			System.out.println(k);
			re-=1;
			for(int i=re;i>=rs&&k<m*n;i--) {
				System.out.print(arr[i][cs]+" ");
				k++;
			}
//			System.out.println();
//			System.out.println(k);
			
			cs+=1;
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
		spiral(new2d);

	}

}
