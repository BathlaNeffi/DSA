package LinkList;

import java.util.Scanner;

public class NextNumberaADD1 {
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
	

	
	public static Node<Integer> nextLargeNumber(Node<Integer> head) {
		   if(head==null||head.next==null) {
			   if(head==null) {return head;}
			   else{head.num += 1; return head;}
			   
			   
			   
		   }
		   Node<Integer> temp=head;
		   
		  while(temp.next!=null) {
			  temp=temp.next;
		  }
		  if(temp.num==9) {
			  temp=head;
			  temp=reverseit(temp);
			  Node<Integer> temp1=temp;
			  while(temp!=null&& temp.num==9) {
				  temp.num=0;
				  temp=temp.next;
			  }
			  if(temp!=null) {
			  temp.num+=1;
			  temp=temp1;
			  temp=reverseit(temp);
			  }
			  else {
				  Node<Integer> result=new Node<>(1);
				  temp=temp1;
				  temp=reverseit(temp);
				 
				  result.next=head;
				  head=result;
				  temp=head.next;
				  
				  while(temp!=null) {
					  temp.num=0;
					  temp=temp.next;
				  }
			  }
		  }
		  
		  else{temp.num+=1;}
		  
		  return head;
		   
		   
		   
	}
	
	public static Node<Integer> reverseit(Node<Integer> head){
		
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		Node<Integer> fwd=null;
		while(curr!=null) {
			fwd=curr.next;
			curr.next=prev;
			prev=curr;
			curr=fwd;
		}
		
		return prev;
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=takeInput();
		head=nextLargeNumber(head);
//		head=reverseit(head);
		print(head);

	}

}
