package LinkList;

import java.util.Scanner;

public class SortLinkedList {
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


	public static void  split(Node<Integer>  Ahead, Node<Integer>  h2, Node <Integer>  head)
    {
        Node<Integer> ascn = Ahead;
        Node<Integer>  dscn = h2;
        Node<Integer> curr = head;
  
        // Link alternate nodes
  
        while (curr != null) {
            // Link alternate nodes in ascending order
            ascn.next = curr;
            ascn = ascn.next;
            curr = curr.next;
  
            if (curr != null) {
                dscn.next = curr;
                dscn = dscn.next;
                curr = curr.next;
            }
        }
  
        ascn.next = null;
        dscn.next = null;
       
    }
	public static Node<Integer> mergeList(Node<Integer> head1, Node<Integer> head2)
    {
        // Base cases
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
  
        Node<Integer> dummyHead = new Node<Integer>(0);
        Node<Integer> temp = dummyHead;
        while(head1 != null && head2 != null) {
            if (head1.num <= head2.num) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
          
        temp.next = (head1 != null) ? head1 : head2;
          
        return dummyHead.next;
    }


	public static Node<Integer> sort(Node<Integer> head) {
		//Your code goes here
		Node<Integer> h1=new Node<>(0); 
		Node<Integer> h2=new Node<>(0);
		
		split(h1,h2,head);
		h1=h1.next;
		h2=h2.next;
		
		h2=reverseit(h2);
		
		
		
		head=mergeList(h1, h2);
		return head;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=takeInput();
		head=sort(head);
		print(head);

	}

}
