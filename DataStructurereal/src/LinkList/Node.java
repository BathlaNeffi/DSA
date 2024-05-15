package LinkList;

public class Node<T> {
	
	public T num;
	public Node next;
	
	public Node(T num){
	this.num=num;
	next=null;
	}
	
	public Node(){
		this.num=null;
		next=null;
		}

}
