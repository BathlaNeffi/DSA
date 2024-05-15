package arrays;
import java.util.Scanner;

public class InputFromUser {
	public static void printArray(int[] arry) {
		int n=arry.length;
		for(int i=0;i<n;i++) {
			System.out.print(arry[i]+" ");
			}
		
	}
	
	public static int [] inputArray() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int  arr[]=new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("Enter the element"+(i+1)+"th position");
			arr[i]=s.nextInt();
			}
		return arr;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] apple=inputArray();
		printArray(apple);
		char [] chq=new char[2];
		chq[0]='a';
		chq[1]='b';
		System.out.println(apple);
		System.out.println(chq);
		
		

	}

}
