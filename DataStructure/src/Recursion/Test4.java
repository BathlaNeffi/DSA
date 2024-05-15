package Recursion;

import java.util.Scanner;

public class Test4 {
	
	
	public static void print2Darray(int  [] [] arr2d ) {
		int row=arr2d.length;
		int col=arr2d[0].length;
		
		for(int i=0; i<row;i++) {
			int k=row-i;
		for(;k>0;k--) {
			
			for(int j=0;j<col;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
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
		print2Darray(new2d);
		
		

	}

}
