package queues;

public class QueuesUsingArrays {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueuesUsingArrays(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
	}
	
	public QueuesUsingArrays() {
		data=new int[5];
		front=-1;
		rear=-1;
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	public void enqueue(int elem) throws QueueFullException {
//		if(size==data.length) {
//			throw new QueueFullException();
//		}
//		rear++;
//		if(rear==data.length) {
//			rear=0;
//		}
		
		if(size==data.length) {
			doubleCapacity();	
		}
		
		rear=(rear+1) % data.length;
		data[rear]=elem;
		size++;
		
		if(front<0) {
			front++;
		}
	}
	
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		
		int temp[]=data;
		data=new int[2*temp.length];
		int index=0;
		
		for(int i=front;i<temp.length;i++) {
			
			data[index++]=temp[i];
		}
		
		for(int i=0;i<front-1;i++) {
			data[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
		
	}

	public int front() throws QueueEmptyException {
		
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int j=data[front];
		size--;
//		front++;
//		if(front==data.length) {
//			front=0;
//		}
		
		front=(front + 1) % data.length;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return j;
		
		
	}
	
	
	

}
