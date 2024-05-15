package Stacks;

public class StackUsingArray {
	
	private int[] data;
	private int topIndex;
	
	public StackUsingArray() {
		data=new int[10];
		topIndex=-1;
	}
	public StackUsingArray(int size) {
		data=new int[size];
		topIndex=-1;
	}
	
	public int size() {
		return topIndex+1;
		
	}
	
	public boolean isEmpty() {
//		if(topIndex==-1 ) { return true;}
//		else {return false;}
		return topIndex == -1;
		
	}
	public void push(int j) throws StackFullException {
		//if stack is full
		if(topIndex==data.length -1) {
//			StackFullException e=new StackFullException();
//			throw e;
			
//			throw new StackFullException();
			
			doubleCapacity();
		}

//		topIndex++;
		data[++topIndex]=j;
		
		
	}
	
	private void doubleCapacity() {
		int temp []=data;
		data=new int[temp.length*2]; //data point to  the new array
		
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i]; 
		}
	}
	
	public int top() throws StackEmptyException {
		if(topIndex==-1) {
			// Throw Stack Empty Exception
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	public int pop() throws StackEmptyException {
		if(topIndex==-1) {
			// Throw Stack Empty Exception
			throw new StackEmptyException();
		}
		int j=data[topIndex];
		topIndex--;
		return j;
	}
	
	

}
