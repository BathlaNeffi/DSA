package LinkList;

import java.util.Scanner;

public class palindromeLinkedList {
	
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


	
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here

		if (head == null || head.next == null) {
			return true;
		}
		Node<Integer> temp=head,mid,h2;
        mid=midPoint(temp);
        h2=mid.next ;
        mid.next=null;
        
        h2=reverseIt(h2);
        Node<Integer> h2nr=h2;
       
        boolean flag=false;
        while(temp!=null && h2!=null)
        {   flag=false;
         if(temp.num==h2.num)
              flag=true;
             temp=temp.next;
             h2=h2.next;

        }
        temp=head;
        
        h2nr=reverseIt(h2nr);
        while(temp.next!=null) {
        	temp=temp.next;
        }
        
        temp.next=h2nr;
        
        
        
        print(head);
        
        return flag;
		
		
	}
	
	
	
	private static Node<Integer> reverseIt(Node<Integer> head)
	{   if(head==null || head.next==null)
		return head;
	Node<Integer> tail=head.next;
	Node<Integer> ans=reverseIt(head.next);
	tail.next=head;
	head.next=null;
	return ans;
	


	}
	
	
	public static Node<Integer> midPoint(Node<Integer>head) {
		if(head==null) {return head;}

		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {

			fast=fast.next.next;
			slow=slow.next;

		}

		return slow;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		System.out.println(isPalindrome(head));
		

	}

}
