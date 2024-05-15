package LinkList;

import java.util.Scanner;

public class MergeTwoSotedLL {
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
	
	
	public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1,Node<Integer> head2){
		Node<Integer> t1=head1,t2=head2,head,tail;
		if(t1==null) {return t2; }
		else if(t2==null) {return t1;}
		if(t1.num<=t2.num ) {head=t1;tail=t1;t1=t1.next;}
		else {head=t2;tail=t2;t2=t2.next;}
		
		while(t1!=null && t2!=null) {
			if(t1.num<=t2.num) {tail.next=t1;tail=tail.next;t1=t1.next;}
			else {tail.next=t2;tail=tail.next;t2=t2.next;}
		}
		
		if(t2!=null) {
			tail.next=t2;
		}
		
		if(t1!=null) {
			tail.next=t1;
		}
		
		return head;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1=takeInput();
		Node<Integer> head2=takeInput();
		Node<Integer> head;
		head=mergeTwoSortedLinkedLists(head1, head2);
//		print(head1);
//		print(head2);
		print(head);
		
		

	}

}
