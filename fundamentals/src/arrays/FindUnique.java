package arrays;
import java.util.Scanner;


public class FindUnique {
	public static int [] findUnique(int[] arr) {
		int n=arr.length;
		int arro[]=new int [n];
    for(int i=0; i<n;i++){
    	int track=0;
    	for(int j=0;j<n;j++) {
    		
    		
    		if(arr[i]==arr[j]) {track++;}
    	}
    	if(track==3){arro[i]=arr[i];}
	}
    return arro;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int [] arr=new int [n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int apple[]=findUnique(arr);
		for(int k=0;k<n;k++) {
		System.out.print(apple[k]+" ");
		}

	}

}
