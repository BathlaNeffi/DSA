package arrays;

public class PrimitiveAndNonprimitive {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
		}
	}
	public static void increment(int [] arri) {
		arri=new int[7];
		System.out.println(arri);
		for(int i=0;i<arri.length ;i++) 
			arri[i]=arri[i]+1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		System.out.println(arr);
		increment(arr);
		printArray(arr);


	}

}
