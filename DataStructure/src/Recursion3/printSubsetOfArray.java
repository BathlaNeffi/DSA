package Recursion3;

public class printSubsetOfArray {

	public static void printsubsets(int [] input, int si, int [] output) {
		if(si==input.length) {
			for(int i:output) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		

		int	newoutput[]=new int[output.length+1];
		int j=0;
		for(; j<output.length;j++) {
			newoutput[j]=output[j];
		}
		newoutput[j]=input[si];
		printsubsets(input,si+1,output);
		printsubsets(input,si+1,newoutput);
	}


	public static void printSubsets(int input[]) {
		// Write your code here
		int output[]=new int[0];
		printsubsets(input,0,output);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3};
		printSubsets(arr);
		

	}

}
