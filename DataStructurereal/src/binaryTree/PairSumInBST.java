package binaryTree;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PairSumInBST {
	
	
	public static void printNodesSumToShelper(ArrayList<Integer> arr,int s) {
		if(arr.size()==0) {return;}
		
		int i=0;
		int j=arr.size()-1;
		while(j>i) {
			int x=arr.get(i)+arr.get(j);
			if(x>s) {j--;}
			else if(x<s) {i++;}
			else {System.out.println(arr.get(i)+" "+ arr.get(j)); i++ ;j--;}
			
		}
	}
	
	
	
	
	
	public static ArrayList<Integer> createArray(BinaryTreeNode<Integer> root){
		if(root==null) {return null;}
		ArrayList<Integer> ans=new ArrayList<>();
		ArrayList<Integer> leftOutput=createArray(root.left);
		if(leftOutput!=null) {
			for(int i=0;i<leftOutput.size();i++) {
				ans.add(leftOutput.get(i));
			}
		
			
			}
			ans.add(root.data);
			
		ArrayList<Integer>rightOutput=createArray(root.right);
		
		if(rightOutput!=null) {
		for(int i=0;i<rightOutput.size();i++) {
			ans.add(rightOutput.get(i));
		}
		}
		return ans;
		
		
	}
	
	public static void printArray(ArrayList<Integer> arrlist) {
		if(arrlist.size()==0) {System.out.println("is empty"); return;}
		for (int str : arrlist)
	      { 		      
	           System.out.print(str +" "); 		
	      }
	}
	
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here
	}
	
	
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the root Data:");
		int rootData=s.nextInt();

		if(rootData==-1) {
			return null;
		}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren=new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);

		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer>front=pendingChildren.poll();
//			System.out.println("Enter left Child of:"+ front.data);
			int leftData=s.nextInt();
			if(leftData!=-1) {
				BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(leftData);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}



//			System.out.println("Enter right Child of:"+ front.data);
			int rightData=s.nextInt();
			if(rightData!=-1) {
				BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(rightData);
				front.right=rightChild;
				pendingChildren.add(rightChild);
			}




		}
		return root;


	}
	
	
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here


		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);
		

		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.print(front.data + ":");
			if (front.left != null) {
				System.out.print("L:" + front.left.data + ",");
				pendingChildren.add(front.left);
			}
			


			if (front.right != null) {
				System.out.print("R:" + front.right.data);
				pendingChildren.add(front.right);
			}
			//			if (front.right=!= null){System.out.print("R:" );}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
		ArrayList<Integer> ans=createArray(root);
		if(ans==null) {ans=new ArrayList<>();}
//		ArrayList<Integer> check=new ArrayList<Integer>();
		
//		ArrayList<Integer> ans=new ArrayList<>();
//		ans.add(1);
//		ans.add(2);
		printArray(ans);
		printNodesSumToShelper(ans, 25);

	}

}
