package priorityQueue;

public class HeapSortInplace {



	public static void inplaceHeapSort(int arr[]) {

		//build the Heap

		int n=arr.length;

		for(int i=n/2-1;i>=0;i--) {
			downHeapfy(arr,i,n);

		}


		// remove elements starting from index 0 and swap it with the next of the last elemet of the heap.

		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			downHeapfy(arr,0,i);


		}



	}

	public static void downHeapfy(int[] arr, int i, int n) {
		// TODO Auto-generated method stub

		int parentindex=i;
		int leftChildIndex=2*parentindex +1;
		int rightChildIndex=2*parentindex +2;

		while(leftChildIndex<n) {
			int minIndex=parentindex;
			if(arr[leftChildIndex]<arr[minIndex]) {
				minIndex=leftChildIndex;
			}
			if(rightChildIndex<n  &&(arr[rightChildIndex]<arr[minIndex])) {
				minIndex=rightChildIndex;
			}


			if(minIndex==parentindex) {
				break;
			}
			int temp2=arr[parentindex];
			arr[parentindex]=arr[minIndex];
			arr[minIndex]=temp2;
			parentindex=minIndex;
			leftChildIndex=2*parentindex +1;
			rightChildIndex=2*parentindex +2;







		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,2,1,4,19,20};
		inplaceHeapSort(arr);

		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
