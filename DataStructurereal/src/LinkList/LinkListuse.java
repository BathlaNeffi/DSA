package LinkList;

import java.util.Scanner;

class DoubleNode{

	Node <Integer> head;
	Node<Integer> tail;

	DoubleNode(){}

	DoubleNode(Node <Integer> head,Node <Integer> tail){
		this.head=head;
		this.tail=tail;
	}
}

public class LinkListuse {

	public static Node<Integer> createLinklist()
	{
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		//		n4.next=null;
		return n1;

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

	public static int length(Node <Integer> head) {
		Node <Integer> temp=head;
		int i=0;
		while(temp!=null) {
			i++;
			temp=temp.next;
		}
		return i;

	}


	public static void printIthNode(Node <Integer> head,int i) {

		Node <Integer> temp=head;
		int j=0;
		while(temp!=null && j<i) {
			j++;
			temp=temp.next;
		}
		if(temp!=null)System.out.println(temp.num);
	}



	public static void increment(Node<Integer> head) {
		Node <Integer> temp=head;
		while(temp!=null) {
			temp.num++;
			temp=temp.next;
		}
	}

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




	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		Node<Integer> currentNode=new Node(data);
		Node<Integer> temp=head;
		int i=0;

		while(temp!=null && i<pos-1) {

			temp=temp.next;
			i++;
		}
		if(temp==head) {currentNode.next= head;
		head=currentNode; }
		else if(temp!=null){
			//			upcoming=temp.next;
			currentNode.next=temp.next;
			temp.next=currentNode;}



		return head;
	}

	public static Node<Integer> insertR(Node<Integer> head, int pos, int data){

		if(head==null && pos>0) {return head;}

		if(pos==0) {
			Node<Integer> currentNode=new Node<>(data);
			currentNode.next=head;
			return currentNode;

		}



		head.next=insertR(head.next, pos-1, data);

		return head;

	}

	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

		Node<Integer> temp=head;
		if(head==null) {return head;}
		if(pos==0) {
			head=head.next;
		}
		else {
			int i=0;

			while(temp.next!=null && i<pos-1) {

				temp=temp.next;
				i++;
			}
			if(temp.next!=null){temp.next=temp.next.next;
			}	
		}

		return head;
	}

	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp=head;
		int res=-1;
		int i=0;
		while(temp!=null) {
			if(temp.num==n) {return i;}
			else{temp=temp.next;
			i++;}
		}
		return res;
	}

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head==null || n==0) {return head;}
		int count=length(head);
		Node<Integer> temp=head,last=null;
		int i=0;

		while(temp!=null && i<count-1) {
			temp=temp.next;
			i++;
		}
		last=temp;
		temp=head;
		count=count-n;
		i=0;

		while(temp!=null && i<count-1) {
			temp=temp.next;
			i++;
		}
		last.next=head;
		head=temp.next;
		temp.next=null;

		return head;



	}

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head==null||head.next==null ) {return head;}
		else {

			Node<Integer> t1=head;
			Node<Integer> t2=head.next;
			while(t2!=null) {
				if(t1.num.equals(t2.num)) {t2=t2.next;}
				else { t1.next=t2;
				t1=t2;
				t2=t2.next;}
			}
			t1.next=null;





			return head;
		}
	}


	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		if(root==null) {return;}
		printReverse(root.next);
		System.out.print(root.num+ " ");


	}


	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here

		boolean flag=true;
		if(head==null||head.next==null ) {return flag;}
		Node<Integer> temp=head,mid,h2,h3;
		int mi;
		if(length(head)%2==0) {mi=length(head)/2 ;}
		else {mi=(length(head)/2)+1;}

		int i=0;
		while(temp!=null && i<mi) 
		{
			temp=temp.next;
			i++;

		}
		mid=temp;
		h3=temp.next;
		mid.next=null;
		h2=reverseIt(h3);
		temp=head;

		while(temp!=null && h2!=null) {
			if(temp.num!=h2.num) {flag=false;return flag;}
			else {
				temp=temp.next;
				h2=h2.next;

			}

		}
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


	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
		if(head==null) {
			return head;
		}

		if(pos==0) {
			return head.next;
		}


		head.next= deleteNodeRec(head.next, pos-1);
		return head;
	}


	public static Node<Integer> reverseNodeRec(Node<Integer> head){

		if(head==null||head.next==null ) {return head;}
		Node<Integer> tail=head.next;
		Node <Integer> prev=reverseNodeRec(head.next);
		tail.next=head;
		head.next=null;
		return prev;

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
	public static Node<Integer> reverseNodeRecBetter1(Node<Integer>head){
		DoubleNode ans=reverseNodeRecBetter(head);
		return ans.head;
	}

	public static void midPoint(Node<Integer>head) {
		if(head==null) {return;}

		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {

			fast=fast.next.next;
			slow=slow.next;

		}

		System.out.println(slow.num);

	}



	public static int findNodeRec(Node<Integer> head, int n) {
		//Your code goes here
		int index=findNode(head, n, 0);
		return index;

	}

	public static int findNode(Node<Integer> head, int n,int inx){
		if (head == null) {
			return -1;
		}
		if(head.num == n){return inx; 
		}


		return  findNode(head.next,n,inx+1);


	}


	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		//Your code goes here
		Node<Integer> oddH=null,oddT=null,evenH=null,evenT=null;
		if(head==null || head.next==null) {
			return head;
		}



		while(head!=null) {
			if(head.num %2==1) {
				if(oddH==null ) {
					oddH=head;oddT=head;
				}
				else{oddT.next=head;oddT=oddT.next;}


			}
			else {
				if(evenH==null) {
					evenH=head;evenT=head;	
				}
				else{evenT.next=head;evenT=evenT.next;}
			}
			head=head.next;

		}

		if(evenH==null) {
			oddT.next=null;
		}
		else if(oddH==null) {
			oddH=evenH;
			evenT.next=null;
		}
		else {
			oddT.next=evenH;
			evenT.next=null;

		}




		return oddH;


	}


	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		//Your code goes here

		if(M==0) {
			return null;
		}
		if(N==0) {
			return head;
		}
		if(head==null || head.next==null) {return head;}
		Node<Integer> T1=head,T2;


		while(T1!=null) {
			int i=1,j=1;
			while(i<M && T1!=null) {
				T1=T1.next;
				i++;
			}
			if(T1==null) {
				return head;
			}
			T2=T1.next;
			while(j<N &&  T2!=null ) {

				T2=T2.next;
				j++;
			}
			T1.next=T2;
			T1=T1.next;

		}


		return head;
	}


	public static Node<Integer> swapNodesPos(Node<Integer> head, int pos){
		Node<Integer> temp=head;
		int i=0;
		while(temp!=null && i<pos) {
			temp=temp.next;
			i++;
		}
		return temp;
	}





	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		Node<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null;
		int pos=0;
		while(temp!=null)
		{
			if(pos==i)
			{
				p1=prev;
				c1=temp;
			}
			else if(pos==j)
			{
				p2=prev;
				c2=temp;
			}
			prev=temp;
			temp=temp.next;
			pos++;
		}
		if(p1!=null)
		{
			p1.next=c2;
		}
		else{
			head=c2;
		}
		if(p2!=null){
			p2.next=c1;
		}
		else{
			head=c1;
		}
		Node<Integer> temp1=c2.next;
		c2.next=c1.next;
		c1.next=temp1;
		return head;
	}
















	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head=takeInput();//createLinklist();
		//		head=skipMdeleteN(head, 3, 0);

		//		head=evenAfterOdd(head);

		head=swapNodes(head, 0, 3);
		print(head);



		//		System.out.println(findNodeRec(head, 4));
		//		head=deleteNodeRec(head, 4);
		//		head=reverseNodeRecBetter1(head);
		//		midPoint(head);

		//		head=reverseNodeRec(head);
		//		head=insertR(head, 0, 20);
		//		increment(head);
		//		

		//		head =insert(head, 6, 100);

		//		head=deleteNode(head,1);


		//		head=appendLastNToFirst(head, 5);
		//				head=removeDuplicates(head);
		//		print(head);
		//				printReverse(head);

		//		System.out.println(isPalindrome(head));


		//		System.out.println(findNode(head, 9));
		//		System.out.println(length(head));
		//		printIthNode(head, 3);



		//		System.out.println(head.next.next.next.num);




		//		Node<Integer> n1=new Node<>(10);
		//		System.out.println(n1.num);
		//		System.out.println(n1.next);
		//		System.out.println(n1);



	}

}
