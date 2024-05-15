package FullTest2;

class Node{
	int num;
	Node next;
	
}

public class Kreverse {


	public static Node reverseList(Node head, Node newHead){

		if (head==null) return newHead;
		Node temp = head.next;
		head.next = newHead;
		newHead = head;
		return reverseList(temp,newHead);
	}

	public static Node reverse(Node head, int k)
	{
		//Your code here
		//Make change in the linked list only
		//Return the head of the new Linked list
		if (head==null) return null;
		Node temp = head;
		for (int i =0;i<k-1;i++){

			if (temp == null){

				return reverseList(head,null);
			}
			temp = temp.next;
		}
		if (temp == null){

			return reverseList(head,null);
		}
		Node node = null;
		node = reverse(temp.next,k);
		temp.next = null;
		reverseList(head,null);
		head.next = node;
		return temp;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
