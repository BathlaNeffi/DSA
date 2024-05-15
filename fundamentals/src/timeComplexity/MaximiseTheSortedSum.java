package timeComplexity;

import java.util.Scanner;

public class MaximiseTheSortedSum {

	public static long maximumSumPath(int[] input1, int[] input2) {
		long finalSum=0;
		
		int i=0,j=0;
		long s1=0;
		long s2=0;
		while(i<input1.length && j<input2.length) {
			
			if(input1[i]<input2[j]) { s1+=input1[i]; i++;}
			else if(input1[i]>input2[j]) {s2+=input2[j];j++;}
			else {s1+=input1[i] ; s2+=input2[j]; 
			if(s1>=s2) {finalSum+=s1;}
			else{finalSum+=s2;}
			s1=0;s2=0;i++ ;j++;
			}
			}
		while(i<input1.length) {
			s1+=input1[i];
			i++;
		}
		while(j<input2.length) {
			s2+=input2[j];
			j++;
			
		}
		
		finalSum +=Math.max(s1,s2);
		
		
		return finalSum;
		
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


		System.out.println(maximumSumPath(arr1, arr2));


	}

}
