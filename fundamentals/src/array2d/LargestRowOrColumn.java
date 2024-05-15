package array2d;

import java.util.Scanner;

public class LargestRowOrColumn {
	
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
	
	public static void larRowCol(int [] [] arr) {
		int n=arr.length;
		int index=-1;
		boolean isrow=true;
		int lar = Integer.MIN_VALUE;
		if(n==0){
			System.out.println("row " +"n "+ lar);
			return ;
		}
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			if(sum>lar) {
				lar=sum;
				index=i;}
		}
		for(int i=0;i<arr[0].length;i++ ) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[j][i];
			}
			if(sum>lar) {
				lar=sum;
				index=i;
				isrow=false;}
		}
		
		if(isrow){System.out.println("row "+index+" "+lar);}
		else{System.out.println("column "+index+" "+lar);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] new2d=takeinput();
		

		print2Darray(new2d);
		larRowCol(new2d);


	}

}
	
	

