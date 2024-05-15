package arrays;

public class QuickSortalgo {
	
	public static int partition(int arr[],int low , int high) {
		int pivot=arr[high];
		int i=low -1;
		
		
		for(int k=low; k<high;k++) {
			if(arr[k]<pivot) { i++; int temp= arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
			}
			
			
	}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		return i;
	}
	
	
	public static void quicSort(int arr[],int low , int high) {
		if(low <high) {
			
			int pivx=partition(arr, low, high);
			
			quicSort(arr, low, pivx-1);
			quicSort(arr, pivx+1, high);
			
			
		}	
		}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,80,70,40,50,90};
		int n=arr.length;
		
		quicSort(arr, 0, n-1);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		

	}

}
