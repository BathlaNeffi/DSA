package binaryTree;

class Pair3{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	public Pair3() {
		// TODO Auto-generated constructor stub
	}

}

class LinkedListNode<T>{
	T data;
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	public LinkedListNode() {}


}

public class BST2LL {

	public static Pair3 helper(BinaryTreeNode<Integer> root){
		if(root==null)
		{
			Pair3 output=new Pair3();
			output.head=null;
			output.tail=null;
			return output;
		}
		Pair3 lefttree=helper(root.left);
		LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
		Pair3 righttree=helper(root.right);
		Pair3 output=new Pair3();
		if(lefttree.head!=null)
		{
			output.head=lefttree.head;
			lefttree.tail.next=newNode;

		}
		else {
			output.head=newNode;
		}
		newNode.next=righttree.head;
		if(righttree.head==null)
		{
			output.tail=newNode;

		}
		else{
			output.tail=righttree.tail;
		}
		return output;



	}



	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {


		Pair3 ans=helper(root);
		return ans.head;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
