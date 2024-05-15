package LinkList;

import java.util.Scanner;


public class kReverse {
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

	public static DoubleNode reverseNodeRecBetter(Node<Integer>head){
		DoubleNode ans;
		if(head==null||head.next==null ) {
			ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode  smallHead=reverseNodeRecBetter(head.next);
		smallHead.tail.next=head;
		head.next=null;
		ans=new DoubleNode(smallHead.head,head);
		return ans;




	}
	
	
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		//Your code goes here
		if(head==null) {return head;}
		Node<Integer> h1=head,t1=head,h2,hr;
		int count=1;
		while(count<k && t1.next!=null) {
			
			t1=t1.next;
			count++;
			
		}
		h2=t1.next;
		if(t1.next!=null) {t1.next=null;}
		DoubleNode ans=reverseNodeRecBetter(h1);
		h1=ans.head;
		t1=ans.tail;
		if(h2==null) {return h1;}
		hr=kReverse(h2, k);
		t1.next=hr;
		
		
		return h1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head=takeInput();
		head=kReverse(head, 4);
		print(head);

	}

}
