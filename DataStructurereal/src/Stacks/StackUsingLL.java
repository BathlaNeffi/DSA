package Stacks;

import LinkList.Node;

public class StackUsingLL<T> {

	private Node<T> head;
	private int size;

	public StackUsingLL() {
		head=null;
		size=0;
	}

	public int sizel() {
		return size;
	}

	public boolean isEmpty() {

		return size==0;
	}

	public void push(T elem) {

		Node<T> newNode=new Node<T>(elem);
		newNode.next=head;
		head=newNode;
		size++;



	}

	public T top() throws StackEmptyException { 
		if(head==null) {

			throw new StackEmptyException();

		}

		return head.num;

	}

	public T pop() throws StackEmptyException {
		if(head==null) {

			throw new StackEmptyException();
			}	

		T j=head.num;
		head=head.next;
		size--;
		return j;
	}



}
