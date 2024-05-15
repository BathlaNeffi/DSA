package classes;

public class DynamicArray {
	
	private int data[];
	private int nextElementIndex;
	
	public  DynamicArray(){
		data=new int[5];
		nextElementIndex=0;
	}
	
	public void add(int j) {
		if(nextElementIndex==data.length) {
			doubleCapacity();
		}
		data[nextElementIndex]=j;
		nextElementIndex++;
	}
	
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0; i<nextElementIndex;i++) 
		{
			data[i]=temp[i];
		}
		
	}

	public void set(int i, int j) {
		if(i>=nextElementIndex) {return;}
		data[i]=j;
	}

	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		
		return nextElementIndex==0;
	}
	public int get(int i) {
		if(i>=nextElementIndex) {
			//throw error
			return -1;
		}
		return data[i];
	}
	
	public int  removeLast() {
		int temp=data[nextElementIndex-1];
		data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
	}
	
	public void add(int i, int elem) {
		if(nextElementIndex==data.length) {
			doubleCapacity();
		}
		
		int temp[]=new int[data.length];
		for(int j=i; j<nextElementIndex;j++) {
		temp[j]=data[j];
		
		}
		data[i]=elem;
		for(int j=i; j<nextElementIndex;j++) {
			data[j+1]=temp[j];
			
			}
		
		
		
	}
	
	
	
	
	

}
