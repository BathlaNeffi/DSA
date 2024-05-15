package queues;

import LinkList.Node;

public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
//	 public QueueUsingLL(){
//		front=null;
//		rear=null;
//		size=0;
//	}
	
	public int size() {
		return size;
		
	}
	public boolean isEmpty() {
		
		return size==0;
	}
	
	
	public void enqueue(T elem) {
		Node<T> temp=new Node<>(elem);
		size++;
		if(front==null) {
		front=temp;
		rear=temp;
		
		}
		else {
		rear.next=temp;
		rear=temp;
		}
		
	}
	
	
	public  T front() {
		if(front==null) {return null;}
		
		return front.num;
		
	}
	public T dequeue() {
		if(front==null) {return null;}
		else {
			T j= front.num;
			front=front.next;
			if(front==null) {rear=null;}
			size--;
			return j;
			
		}
		
		
	}
	
	
	
	

}
