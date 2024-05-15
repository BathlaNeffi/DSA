package LinkList;

import java.util.Scanner;

public class MoveToLast {


	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> currentNode=new Node<>(data);
			if(head==null) {
				head=currentNode;
				tail=currentNode;
			}
			else {
				//				Node<Integer> tail=head;
				//				while(tail.next!=null) {
				//					tail=tail.next;
				//				}
				tail.next=currentNode;
				tail=currentNode;
			}
			data=s.nextInt();	
		}
		return head;	
	}


	public static void print(Node <Integer> head) {
		//		System.out.println(head);
		//		System.out.println(head.num);
		//		System.out.println(head.next.num);

		Node <Integer> temp=head;


		while(temp!=null) {

			System.out.print(temp.num +" ");
			temp=temp.next;


		}
		System.out.println();


	}


	public static Node<Integer> func(Node<Integer> head,int n) {
		Node<Integer> temp=head;



		while(temp.next!=null) {
			temp=temp.next;
		}
		Node<Integer> tail=temp;
		Node<Integer> tempTail=tail;
		temp=head;
		Node<Integer> prev=null;

		if(temp.num==n) {

			while(temp.num==n) {
				tempTail.next=temp;
				temp=temp.next;
				tempTail.next.next=null;
				tempTail=tempTail.next;
				
				
				
			}
			head=temp;
		}
		

		while(temp!=tail) {

			if(temp.num==n) {

				
					tempTail.next=temp;
					prev.next=temp.next;
					temp.next=null;
					tempTail=temp;
					temp=prev.next;
				



			}
			else {
				prev=temp;
				temp=temp.next;
			}
		}

		return head;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();

		head=func(head, 3);

		print(head);


	}

}
