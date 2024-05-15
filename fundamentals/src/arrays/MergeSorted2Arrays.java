package arrays;

import java.util.Scanner;

public class MergeSorted2Arrays {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
		}
		System.out.println();
	}
	
	

	public static void mergedstorted(int [] arr1, int [] arr2) {
		int c=arr1.length +arr2.length;
		int [] arry=new int [c];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length &&  j<arr2.length) {
			if(arr1[i]<arr2[j]) {arry[k]=arr1[i];k++; i++;}
			else {arry[k]=arr2[j];k++;j++;}
		}
//		if(i==arr1.length){
			while(j<arr2.length) {
				arry[k]=arr2[j];k++;j++;
			}
//		}
//		else {
		while(i<arr1.length) {
			arry[k]=arr1[i];k++;i++;
		}
			
//		}
		printArray(arry);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int [] arr1=new int [n];
		for(int i=0;i<n;i++){
			arr1[i]=s.nextInt();
		}
		int m=s.nextInt();

		int [] arr2=new int [m];
		for(int i=0;i<m;i++){
			arr2[i]=s.nextInt();
		}
		mergedstorted(arr1, arr2);



	}

}
