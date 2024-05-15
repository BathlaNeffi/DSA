package arrays;

public class MergedSortAlgo {
	
	public static void conqure(int []arr, int si, int mid, int ei) {
		
		int [] merged =new int [ei-si+1];
		
		int inx1=si;
		int inx2=mid+1;
		int x=0;
		while(inx1<=mid && inx2<=ei) {
			if(arr[inx1]>=arr[inx2]) { merged[x++]=arr[inx2++];}
			else {merged[x++]=arr[inx1++];}
		}
		
		while(inx1<=mid) {merged[x++]=arr[inx1++];}
		while(inx2<=ei) {merged[x++]=arr[inx2++];}
		
		
		for(int i=0,j=si;i<merged.length;i++ ,j++) {
			
			arr[j]=merged[i];
			
		}
		
		
	}
	
	public static void divide(int []arr,int si,int ei) {
		if(ei>si) {
			int mid=si +(ei-si)/2;
			divide(arr,si,mid);
			divide(arr,mid+1,ei);
			conqure(arr,si,mid,ei);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,3,9,2,8};
		int n=arr.length;
		divide(arr,0,n-1);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
		

	}

}
