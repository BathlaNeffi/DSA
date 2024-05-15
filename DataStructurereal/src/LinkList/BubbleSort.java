package LinkList;

import java.util.Scanner;

public class BubbleSort {
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





	public static Node<Integer> bubbleSort(Node<Integer> head) {
		    if(head==null || head.next==null)
			{return head;}
		    
		    int n=lengthLL(head);
		    for(int i=0; i<n-1;i++) {
		    	Node<Integer> curr=head;
		    	Node<Integer> prev=null;
		    	Node<Integer> next=curr.next;
		    	
		    		for(int j=0;j<(n-i-1);j++) {
		    			if(curr.num<=next.num) {
		    				prev=curr;
		    				curr=curr.next;
		    				
		    			}
		    			else {
		    				if(prev==null) {
		    					Node<Integer> fwd=curr.next;
		    					head=head.next;
		    					curr.next=fwd.next;
		    					fwd.next=curr;
		    					prev=fwd;
		    				}
		    				else {
		    					Node<Integer> fwd=curr.next;
		    					prev.next=fwd;
		    					curr.next=fwd.next;
		    					fwd.next=curr;
		    					prev=fwd;
		    					
		    				}
		    			}
		    			
		    			
		    		}
		    	
		    	
		    	
		    }
		    
		    return head;
	}
		
		
		

		private static int lengthLL(Node<Integer> head){
			int count = 0;
			while(head != null){
				head = head.next;
				count++;
			}
			System.out.println(count);
			return count;







		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Node<Integer> head=takeInput();
			head=bubbleSort(head);
			print(head);


		}

	}
