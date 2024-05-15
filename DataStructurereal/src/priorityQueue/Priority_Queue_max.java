package priorityQueue;

import java.util.ArrayList;

public class Priority_Queue_max {

	ArrayList<Integer> heap;

	public Priority_Queue_max() {
		heap=new ArrayList<>();
	}

	public int getSize() {
		// Implement the getSize() function here
		return heap.size();
	}
	boolean isEmpty() {
		// Implement the isEmpty() function here
		return heap.isEmpty();
	}

	public int getMax() throws PriorityQueueException {
		// Implement the getMax() function here

		if(heap.isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	public void insert(int element) {
		// Implement the insert() function here
		heap.add(element);


		int childIndex=heap.size() -1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) {


			if(heap.get(parentIndex)<heap.get(childIndex)) {
				int temp=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;

			}
			else {
				return;
			}
		}
	}
	
	
	public int removeMax() throws PriorityQueueException {
		// Implement the removeMax() function here
		if(heap.isEmpty()) {
//			throw new PriorityQueueException();
			 return Integer.MIN_VALUE;
		}
		
		int ans=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex=0;
		int leftChildIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		int maxIndex=parentIndex;
		
		while(leftChildIndex<heap.size()) {
			
			if(heap.get(leftChildIndex)>heap.get(maxIndex)) {
				maxIndex=leftChildIndex;		
			}
			
			if( rightChildIndex<heap.size() &&(heap.get(rightChildIndex)>heap.get(maxIndex))) {
				maxIndex=rightChildIndex;
			}
			if(maxIndex==parentIndex) {
				break;
			}
			else{int temp=heap.get(parentIndex);
			heap.set(parentIndex, heap.get(maxIndex));
			heap.set(maxIndex,temp);
			parentIndex=maxIndex;
			leftChildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
			}
			
			
		}
		
		return ans;	
	}
	
	int removeMax2(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        int lchildindex=1;
        int rchildindex=2;
        int parentindex=0;
        int maxindex=parentindex;
        int temp=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        while(lchildindex<heap.size()){
        if(heap.get(lchildindex)>heap.get(parentindex))
            maxindex=lchildindex;
        if(rchildindex<heap.size() && heap.get(rchildindex)>heap.get(maxindex))
            maxindex=rchildindex;
        if(maxindex==parentindex)
            break;
        else{
            int temp1=heap.get(parentindex);
            heap.set(parentindex,heap.get(maxindex));
            heap.set(maxindex,temp1);
            parentindex=maxindex;
            lchildindex=2*parentindex +1;
            rchildindex=2*parentindex +2;

        }
        }
         return temp; 
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
