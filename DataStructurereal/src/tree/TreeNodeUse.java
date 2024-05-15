package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNodeUse {



	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here

		if(root==null) {return 0;}

		int count=0;
		if(root.children.size()==0) {count++;}
		for(int i=0;i<root.children.size();i++) {
			int childCount=countLeafNodes(root.children.get(i));
			count+=childCount;

		}

		return count;


	}

	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here	
		if(root==null) {return 0;}
		int count=0;
		if(root.data>x) {count++;}
		for(int i=0;i<root.children.size() ;i++) {
			int childCount=numNodeGreater(root.children.get(i),x);
			count+=childCount;
		}
		return count;

	}

	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		if(root==null) {return 0;}
		Queue<TreeNode<Integer>> pendingchildren=new LinkedList<>();
		pendingchildren.add(root);
		pendingchildren.add(null);
		int count=1;

		while(!pendingchildren.isEmpty()) {
			if(pendingchildren.peek()==null && pendingchildren.size()>1) {
				pendingchildren.poll();
				count++;
				//				System.out.println();
				pendingchildren.add(null);
			}
			if(pendingchildren.peek()==null && pendingchildren.size()<=1) {return ++count;}
			TreeNode<Integer> currentNode=pendingchildren.poll();

			//			System.out.print(currentNode.data +" ");


			for(int i=0;i<currentNode.children.size();i++) {
				TreeNode<Integer> childNode=currentNode.children.get(i);
				pendingchildren.add(childNode);
			}

		}
		return count;
	}


	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Root data:");
		int rootData=s.nextInt();
		if(rootData==-1) {return null;}
		TreeNode<Integer> root=new  TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingChildren= new LinkedList<>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			TreeNode<Integer> currentNode=pendingChildren.poll();
			System.out.println("Enter the num of childs for:" + currentNode.data);
			int numChildren=s.nextInt();
			for(int i=0; i<numChildren;i++) {
				System.out.println("Enter the " +i+"th childs data for:"+ currentNode.data);
				int data=s.nextInt();
				TreeNode<Integer> childNode=new TreeNode <>(data);
				currentNode.children.add(childNode);
				pendingChildren.add(childNode);
			}
		}


		return root;
	}



	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */

		if(root==null) {return;}
		Queue<TreeNode<Integer>> pendingchildren=new LinkedList<>();
		pendingchildren.add(root);
		pendingchildren.add(null);

		while(!pendingchildren.isEmpty()) {
			if(pendingchildren.peek()==null && pendingchildren.size()>1) {
				pendingchildren.poll();
				System.out.println();
				pendingchildren.add(null);
			}
			if(pendingchildren.peek()==null && pendingchildren.size()<=1) {return;}
			TreeNode<Integer> currentNode=pendingchildren.poll();

			System.out.print(currentNode.data +" ");


			for(int i=0;i<currentNode.children.size();i++) {
				TreeNode<Integer> childNode=currentNode.children.get(i);
				pendingchildren.add(childNode);
			}

		}





	}

	public static int numberOfNodes(TreeNode<Integer> root) {
		if(root==null) {return 0;}

		int count=1;
		for(int i=0; i<root.children.size();i++) {
			int childrensCount=numberOfNodes(root.children.get(i));
			count+=childrensCount;
		}
		return count;
	}

	public static int sumOfAllNode(TreeNode<Integer> root){
		if(root==null) {return 0;}

		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childrensSum=sumOfAllNode(root.children.get(i));
			sum+=childrensSum;
		}
		return sum;
	}

	public static void printPostOrder(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */

		if(root==null) {return ;}




		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> currentNode=root.children.get(i);
			printPostOrder(currentNode);
		}
		System.out.print(root.data+" ");

	}


	public static void printTree(TreeNode<Integer> root) {

		//this is not the base case but a special  when root is null  Note : null is diffurent then empty .
		if(root==null) {return ;}
		System.out.print(root.data+": ");
		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> currentNode=root.children.get(i);
			System.out.print(currentNode.data+ " ");
		}
		System.out.println();

		for(int i=0; i<root.children.size();i++) {
			TreeNode<Integer> currentNode=root.children.get(i);
			printTree(currentNode);
		}

	}

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here


		if(root.data==x) {return true;}


		boolean ans=false;
		for(int i=0;i<root.children.size();i++)
		{

			TreeNode<Integer> currentNode=root.children.get(i);
			boolean smallans= checkIfContainsX(currentNode,x);

			if(smallans!=ans && smallans==true)
				ans=smallans;
		}

		return ans;



	}

	public static MaxSumNodeReturn maxSumNodeHelper(TreeNode<Integer> root) {
		if(root==null) {
			MaxSumNodeReturn ans=new MaxSumNodeReturn(null, Integer.MIN_VALUE);
			return ans;
		}
		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			sum+=root.children.get(i).data;

		}
		MaxSumNodeReturn sol= new MaxSumNodeReturn(root, sum);

		for(int i=0;i<root.children.size();i++) {
			MaxSumNodeReturn childAns= maxSumNodeHelper(root.children.get(i));
			if(childAns.maxSum>sol.maxSum) {
				sol=childAns;
			}

		}
		return sol;

	}


	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root==null) {return null;}
		return maxSumNodeHelper(root).treeNode;
	}

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		boolean isIdentical=true;

		// Write your code here
		if(root1.data==root2.data) {isIdentical=true;}
		if(root1.children.size()!=root2.children.size()) {return false;}
		for(int i=0; i<Math.min(root1.children.size(), root2.children.size());i++) {
			boolean isIdentical2=checkIdentical(root1.children.get(i), root2.children.get(i));
			if(!isIdentical2) {
				isIdentical=isIdentical2;
			}
		}
		return isIdentical;
	}
	
	
	public static ArrayList<TreeNode<Integer>> findNextLargerNodehelper(TreeNode<Integer> root, int n){
		if(root==null) {return null;}
		
		ArrayList<TreeNode<Integer>> ans= new ArrayList<>();
		if(root.data>n) {ans.add(root);}
		
		for(int i=0; i<root.children.size();i++) {
			ArrayList<TreeNode<Integer>> childArr=findNextLargerNodehelper(root.children.get(i), n);
			for(int j=0;j<childArr.size();j++) {
				ans.add(childArr.get(j));
				
			}
		}
		
		return ans;
	
		
		
	}
	
	public static TreeNode<Integer> findNextLargerNode2(TreeNode<Integer> root, int n){
		if(root==null) {return null;}
		TreeNode<Integer> ans=null;
		if(root.data>n) {
			ans=root;
		}
		for(TreeNode<Integer> child: root.children) {
			TreeNode<Integer> childans=findNextLargerNode2(child,n);
			if(childans!=null) {
				if(ans==null || ans.data>childans.data) {
					ans=childans;
				}
			}
		}
		return ans;
		
	}



	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

		// Write your code here
		ArrayList<TreeNode<Integer>> arr=findNextLargerNodehelper(root, n);
		
		TreeNode<Integer> minNode= new TreeNode<Integer>(Integer.MAX_VALUE);
		for(int i=0; i<arr.size();i++) {
			
			if(arr.get(i).data<minNode.data) {
				minNode=arr.get(i);
			}
		}
		
		return minNode;
		
		
	}
	public static findSecondLargestReturn findSecondLargestHelper(TreeNode<Integer> root){
		if(root==null) {return null;}
		findSecondLargestReturn sol= new findSecondLargestReturn();
		sol.max=root;
		sol.secondMax=null;	
		
		for(TreeNode<Integer> child: root.children ) {
			
			findSecondLargestReturn childSol=findSecondLargestHelper(child);
			
			if(childSol.max.data>sol.max.data ) {
				TreeNode<Integer> temp=sol.max;
				sol.max=childSol.max;
				
				if(childSol.secondMax==null || childSol.secondMax.data<temp.data) {
					sol.secondMax=temp;
				}
				
				else {
					
					sol.secondMax=childSol.secondMax;
				}
			}
			
			else if(childSol.max.data.equals(sol.max.data) && childSol.secondMax!=null) {
				if(sol.secondMax==null || sol.secondMax.data<(childSol.secondMax.data)) {
					sol.secondMax=childSol.secondMax;
				}
			}
			
			else if(sol.max.data!=childSol.max.data &&( sol.secondMax==null|| childSol.max.data>sol.secondMax.data)) {
				sol.secondMax=childSol.max;
				
			}
			
			
			
		}
		return sol;


		// Write your code here

	}
	
	
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		
		return findSecondLargestHelper(root).secondMax;


		// Write your code here

	}
	
	
	
	public static TreeNode<Integer> findSecondLargest2(TreeNode<Integer> root){

        if(root.children.size() == 0){
            return null;
        }
      Queue<TreeNode<Integer>> queue = new LinkedList<>();
      TreeNode<Integer> fl=root,sl=null;
      int data = 0;
      queue.add(root);
      //queue.add(null);

      while(!queue.isEmpty())
      {
          TreeNode<Integer> frontNode = queue.poll();
               for(int i=0;i<frontNode.children.size();i++){
                  queue.add(frontNode.children.get(i));
              }
          
              if(frontNode.data >  data){
                  if(frontNode.data > fl.data){
                      sl = fl;
                      data = fl.data;
                      fl = frontNode;
                  }
                  else if (frontNode.data < fl.data){
                      sl = frontNode;
                      data = sl.data;
                  }
              }
              
              
          
          }
          
      
      return sl;
  

  }
	
	public static void replaceWithDepthValueHelper(TreeNode<Integer> root, int k){

		// Write your code here
		if(root==null) {
			return ;
		}
		
		root.data=k;
		k++;
		for(int i=0; i<root.children.size();i++) {
			
			replaceWithDepthValueHelper(root.children.get(i), k);
		}
		
	}
	
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		replaceWithDepthValueHelper(root,0);
		
		
	}
	

	public static void main(String[] args) {
		//		// TODO Auto-generated method stub
		//		TreeNode<Integer> root= new TreeNode<Integer>(4);
		//		TreeNode<Integer> node1=new TreeNode<Integer>(2);
		//		TreeNode<Integer> node2=new TreeNode<Integer>(3);
		//		TreeNode<Integer> node3=new TreeNode<Integer>(1);
		//		TreeNode<Integer> node4=new TreeNode<Integer>(5);
		//		TreeNode<Integer> node5=new TreeNode<Integer>(6);
		//		
		//		root.children.add(node1);
		//		root.children.add(node2);
		//		root.children.add(node3);
		//		node2.children.add(node4);
		//		node2.children.add(node5);
		TreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
//		System.out.println(numberOfNodes(root));
		TreeNode<Integer> new1=findNextLargerNode(root, 4);
		System.out.println(" This is new " + new1.data );

	}

}
