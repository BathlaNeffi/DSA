package priorityQueue;

public class CheckIfMaxHeap {
	

	
	
	public static boolean checkMaxHeap(int arr[]) {
		if(arr.length ==0 ||arr.length ==1) {
			return true;
		}
		
		for(int i=0; i<arr.length;i++) {
			int parentIndex=i;
			int leftChildIndex=2*parentIndex +1;
			int rightChilIndex=leftChildIndex+1;
			if(leftChildIndex<arr.length && (arr[leftChildIndex]>arr[parentIndex])) {
				return false;
			}
			if(rightChilIndex<arr.length&& (arr[rightChilIndex]>arr[parentIndex])) {
				return false;
			}
	
			
			
		}
		
		return true;
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {};

	}

}
