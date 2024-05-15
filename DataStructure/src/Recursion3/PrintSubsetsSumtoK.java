package Recursion3;

public class PrintSubsetsSumtoK {


	public static void helper(int []input, int k, int[]output,int si) {
		if(input.length==si) {
			if(k==0) {
				for(int i: output) {
					System.out.print(i+" ");
				}
				System.out.println();
				return;
			}
			else return;
		}
		helper(input,k,output,si+1);

		int newOutput[]= new int[output.length+1];
		int j=0;
		for(;j<output.length;j++) {
			newOutput[j]=output[j];
		}
		newOutput[j]=input[si];
		k-=input[si];
		helper(input,k,newOutput,si+1);


	}




	public static void printSubsetsSumTok(int input[], int k) {

		int output[]=new int[0];
		helper(input,k,output,0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[]= {5,1,2,6,7,4,3};
		printSubsetsSumTok(input,9);




	}

}
