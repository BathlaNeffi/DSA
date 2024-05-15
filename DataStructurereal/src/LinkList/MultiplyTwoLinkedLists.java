package LinkList;

import java.util.Scanner;

public class MultiplyTwoLinkedLists {
	
	
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
	
	
	public static   Node<Integer> reverseIt(Node<Integer> head)
	{   if(head==null || head.next==null)
		return head;
	Node<Integer> tail=head.next;
	Node<Integer> ans=reverseIt(head.next);
	tail.next=head;
	head.next=null;
	return ans;


	}
	
	public static int length(Node <Integer> head) {
		Node <Integer> temp=head;
		int i=0;
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		return i;

	}
	
	
	
	 public static void multiply(Node<Integer> head1,Node<Integer> head2) {
	        //Your code goes here
		 head1=reverseIt(head1);
		 head2=reverseIt(head2);
		 int m=length(head1);
		 int n=length(head2);
		 Node<Integer> ans=new Node<>();
		 
		 if(m>=n) {
			 
		 
		 while(head1!=null) {
			int v1= head1.num*head2.num;
			
			
			 
			 
			 
		 }
		 
		 
		 }
		 
		 
	 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 long i=0,j=0;
//		 long N = 1000000007;
//		 long x=10;
//		while(!(head1==null)) {
//			i=head1.num+(i*x);
//			
//			head1=head1.next;
//		}
//		
//		
//		while(!(head2==null)) {
//			j=head2.num+(j*x);
//			
//			head2=head2.next;
//		}
//		
//		long sol=i*j;
//		int len=0;
//		while(sol!=0) {
//			sol=sol/10;
//			len++;
//		}
//		
//		sol=i*j;
//		int arr[]=new int[len];
//		
//		for(int a=0;a<len;a++) {
//			arr[a]= (int) (sol%10);
//			sol=sol/10;
//			
//			
//		}
//		
//		for(int a=arr.length-1;a>=0;a--) {
//			System.out.print(arr[a]+" ");
//		}

		 
		 
		  
	    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head1=takeInput();
		Node<Integer> head2=takeInput();
		multiply(head1, head2);
		

	}

}
