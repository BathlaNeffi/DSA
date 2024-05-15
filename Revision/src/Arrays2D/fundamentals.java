package Arrays2D;

import java.util.Scanner;

public class fundamentals {


	public static int [][] takeInput(){
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the no. of rows");

		int row=s.nextInt();
		System.out.println("Enter the no. of colums");
		int col=s.nextInt();

		int arr[][]=new int[row][col];
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				System.out.print("Enter the value for"+i+"th row"+j+"th column");
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		return arr;

	}
	
	public static void printArray(int arr[][]) {
		
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0; i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		int arr[][]= new int [4][5];
		//		System.out.println(arr);
		//		System.out.println(arr.length);
		//		System.out.println(arr[0].length);



//		int arr[][]=takeInput();
		
		int arr[][]= new int[5][];
		for( int i=0; i<arr.length;i++) {
			arr[i]=new int[i+1];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=1;
			}
		}
		
		printArray(arr); 
		






	}

}
