

package binaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;





public class BinaryTreeUse {


	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isroot,int parentdata , boolean isleft){

		Scanner s =new Scanner(System.in);
		if(isroot) {
			System.out.println("Enter root data");

		}
		else if(isleft) {
			System.out.println("Enter left child of " + parentdata);
		}
		else 
		{
			System.out.println("Enter right child of "+ parentdata);
		}

		int rootdata=s.nextInt();
		if(rootdata==-1) {return null;}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		BinaryTreeNode<Integer> leftChild=takeTreeInputBetter(false,rootdata,true);
		BinaryTreeNode<Integer> rightChild=takeTreeInputBetter(false, rootdata,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;


	}


	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}

		int leftNodesCount=numNodes(root.left);
		int rightNodesCount=numNodes(root.right);
		return 1+rightNodesCount+leftNodesCount;
	}



	public static BinaryTreeNode<Integer> takeTreeInput(){
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Root Data:");
		int rootdata=s.nextInt();
		if(rootdata==-1) {return null;}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		//		BinaryTreeNode<Integer> leftChild=takeTreeInput();
		//		BinaryTreeNode<Integer> rightChild=takeTreeInput();
		root.left=takeTreeInput();
		root.right=takeTreeInput();
		return root;


	}


	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data + ": ");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+ root.right.data);
		}
		System.out.println();

		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
		if(root==null){
			return 0;
		}

		int leftSum=getSum(root.left);
		int rightSum=getSum(root.right);

		return leftSum + rightSum+root.data;
	}



	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);


		//		if(root.left!=null) {
		//		printTree(root.left);
		//		}
		//		if(root.right!=null) {
		//		printTree(root.right);
		//		}
	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {return;}
		System.out.print(root.data +" ");
		preOrder(root.left);
		preOrder(root.right);
		return;

	}

	public static void postOrder(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if(root==null) {return;}

		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.data +" ");
		return;

	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}

		int largestLeft=largest(root.left);
		int largestRight=largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}


	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return 0;
		}


		int leftCount=countNodesGreaterThanX(root.left, x);
		int rightCount=countNodesGreaterThanX(root.right, x);
		int count=(root.data>x) ? 1:0;

		return leftCount+rightCount+count;


	}





	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root==null) {return 0;}
		if(root.left==null && root.right==null) {return 1;}
		return numLeaves(root.left)+ numLeaves(root.right);
	}





	public static void changeToDepthTreeValue(BinaryTreeNode<Integer>root,int k){
		if(root==null) {return;}

		root.data=k;
		changeToDepthTreeValue(root.left,++k);
		changeToDepthTreeValue(root.right,k++);

	}


	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		//Your code goes here
		changeToDepthTreeValue(root, 0);



	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
		if (root == null) {
			return false;
		}
		boolean ispresent1=false;
		boolean ispresent2 = false;

		if (root.data == x) {
			return true;
		}
		ispresent1=isNodePresent(root.left, x);
		ispresent2=isNodePresent(root.right, x);
		return (ispresent1 || ispresent2);
	}

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root==null) {return;}
		if(root.right==null && root.left!=null) {System.out.print(root.left.data+" ");}
		else if(root.left==null&& root.right!=null) { System.out.print(root.right.data+" ");}

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}


	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
		if(root==null) {return null;}


		if(root.left==null && root.right==null) {
			return null;
		}

		root.left=removeLeaves(root.left);
		root.right=removeLeaves(root.right);
		return root;
	}


	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return ;
		}

		if (root.left == null && root.right == null) {
			return;
		}
		BinaryTreeNode<Integer> temp = null;
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);	//Your code goes here
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		return 1+ Math.max(leftHeight, rightHeight);
	}

	public static boolean isBalance(BinaryTreeNode<Integer> root) {
		if(root==null) {return true;}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		if(Math.abs(rightHeight-leftHeight)>1) {return false;}

		boolean leftBalance=isBalance(root.left);
		boolean rightbalance=isBalance(root.right);

		return  leftBalance && rightbalance;


	}
	public static BalancedTreeReturn isBalanceBetter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int ht=0;
			boolean isBal=true;
			BalancedTreeReturn ans =new BalancedTreeReturn();
			ans.height=ht;
			ans.isbalanced=isBal;
			return ans;}

		BalancedTreeReturn leftOutput= isBalanceBetter(root.left);
		BalancedTreeReturn rightOutput=isBalanceBetter(root.right);
		boolean isBal=true;
		int high=1+ Math.max(leftOutput.height,rightOutput.height);
		if(Math.abs(leftOutput.height-rightOutput.height)>1) {
			isBal=false;
		}
		if(!leftOutput.isbalanced || !rightOutput.isbalanced) {
			isBal=false;
		}


		BalancedTreeReturn ans =new BalancedTreeReturn();
		ans.height=high;
		ans.isbalanced=isBal;
		return ans;


	}

	public static pair diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root==null) {
			pair ans=new pair(0,0);
			return ans;
		}
		int height=0;
		int dia=0;
		pair leftOutput=diameterOfBinaryTreeBetter(root.left);
		pair rightOutput=diameterOfBinaryTreeBetter(root.right);
		int dist=leftOutput.height + rightOutput.height+1;
		dia=Math.max(dist,Math.max(leftOutput.diameter, rightOutput.diameter));
		height=1+Math.max(leftOutput.height, rightOutput.height);

		pair ans=new pair(height,dia);
		return ans;



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
			System.out.println("Enter left Child of:"+ front.data);
			int leftData=s.nextInt();
			if(leftData!=-1) {
				BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(leftData);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}



			System.out.println("Enter right Child of:"+ front.data);
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


	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here


		return diameterOfBinaryTreeBetter(root).diameter;

		//		if(root == null) {return 0;}
		//		
		//		int leftHeight=height(root.left);
		//		int rightHeight=height(root.right);
		//		int leftDiameter=diameterOfBinaryTree(root.left);
		//		int rightDiamerter=diameterOfBinaryTree(root.right);
		//		
		//		return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter, rightDiamerter));
		//		







	}


	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		if(preOrder.length==0) {return null;}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preOrder[0]);
		int leftLength=0;
		int i=0;
		for(; i<inOrder.length;i++) {
			if(inOrder[i]==root.data) {
				break;
			}
		}
		leftLength=i;
		int rightLength=inOrder.length-(i+1);

		int leftInArr[]=new int [leftLength];
		int rightInArr[]=new int[rightLength];
		int j=0;
		for(; j<leftLength;j++) {
			leftInArr[j]=inOrder[j];

		}

		j+=1;
		for(int k=0; k<rightInArr.length ;j++,k++) {
			rightInArr[k]=inOrder[j];

		}
		int leftPreArr[]=new int [leftLength];
		int rightPreArr[]=new int[rightLength];
		int w=1;
		for(int a=0;a<leftPreArr.length;w++,a++) {
			leftPreArr[a]=preOrder[w];
		}

		for(int a=0;a<rightPreArr.length;w++,a++) {
			rightPreArr[a]=preOrder[w];
		}

		BinaryTreeNode<Integer> leftChild=buildTree(leftPreArr, leftInArr);
		BinaryTreeNode<Integer> rightChild=buildTree(rightPreArr, rightInArr);
		root.left=leftChild;
		root.right=rightChild;

		return root;	
	}

	public static BinaryTreeNode<Integer> buildTreeFronPreInHelper(int pre[], int in [], int siPre, int eiPre, int siIn , int eiIn){
		if(siPre>eiPre || siIn>eiIn) {return null;}

		int rootData=pre[siPre];

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);

		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(in[i]==rootData) {
				rootIndex=i;
				break;
			}
		}


		int siPreLeft=1+siPre;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int leftSubtree=eiInLeft-siInLeft+1;
		int eiPreLeft=siPreLeft+ leftSubtree-1;

		BinaryTreeNode<Integer> leftChild=buildTreeFronPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		int siPreRight=eiPreLeft+1;
		int eiPreRight=eiPre;
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;
		BinaryTreeNode<Integer> rightChild=buildTreeFronPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);

		root.left=leftChild;
		root.right=rightChild;
		return root;





	}





	public static BinaryTreeNode<Integer> buildTreeFronPreIn(int pre[], int in[]){

		BinaryTreeNode<Integer> root=buildTreeFronPreInHelper(pre, in, 0, pre.length-1, 0, in.length-1);

		return root;
	}




	public static BinaryTreeNode<Integer> buildTreeFronPostInHelper(int[]post,int[] in, int siPost,int  eiPost,int  siIn,int eiIn){
		if(siPost>eiPost || siIn>eiIn) {return null;}

		int rootData=post[eiPost];

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);

		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(in[i]==rootData) {
				rootIndex=i;
				break;
			}
		}


		int siPostLeft=siPost;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int leftSubtree=eiInLeft-siInLeft+1;
		int eiPostLeft=siPostLeft+ leftSubtree-1;

		BinaryTreeNode<Integer> leftChild=buildTreeFronPostInHelper(post, in, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
		int siPostRight=eiPostLeft+1;
		int eiPostRight=eiPost-1;
		int siInRight=rootIndex+1;
		int eiInRight=eiIn;
		BinaryTreeNode<Integer> rightChild=buildTreeFronPostInHelper(post, in, siPostRight, eiPostRight, siInRight, eiInRight);

		root.left=leftChild;
		root.right=rightChild;
		return root;



	}

	public static BinaryTreeNode<Integer> buildTreePost(int[] postOrder, int[] inOrder) {
		//Your code goes here
		BinaryTreeNode<Integer> root=buildTreeFronPostInHelper(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length-1);
		return root;
	}







	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root==null) {return;}
		BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(root.data);
		root.left=leftChild;
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);


	}






	public static void insertDuplicateNode2(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(root.data);
		leftChild.left=root.left;
		root.left = leftChild;
		insertDuplicateNode2(leftChild.left);
		insertDuplicateNode2(root.right);
	}


	public static Pair2<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root==null) {
			int min=2;
			int max=0;
			Pair2<Integer,Integer> ans =new Pair2<>(min,max);
			return ans;
		}

		Pair2<Integer, Integer> leftPair=getMinAndMax(root.left);
		Pair2<Integer, Integer> rightPair=getMinAndMax(root.right);


		int min=Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
		int max=Math.max(root.data, Math.max(leftPair.maximum,rightPair.maximum));

		Pair2<Integer,Integer> ans=new Pair2<>(min,max);
		return ans;




	}


	public static void printLevelWise2(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
		pendingChildren.add(root);
		pendingChildren.add(null);

		while (!pendingChildren.isEmpty()) {
			if(pendingChildren.peek()==null && pendingChildren.size()>1) {
				System.out.println();
				pendingChildren.poll();
				pendingChildren.add(null);

			}
			else if(pendingChildren.peek()==null && pendingChildren.size()<=1) {
				return;
			}
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.print(front.data);
			if (front.left != null) {
				System.out.print("L:" + front.left.data + ",");
				pendingChildren.add(front.left);
			} else {

			}

			if (front.right != null) {
				System.out.print("R:" + front.right.data);
				pendingChildren.add(front.right);
			}
			// if (front.right=!= null){System.out.print("R:" );}


		}


	}

	public static void printRootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String str) {
		if(root==null) {return;}



		if(k==root.data && (root.left==null && root.right==null)) {
			System.out.println(str+ root.data+" ");
		}

		printRootToLeafPathsSumToK(root.left, k-root.data, str+ root.data+" ");
		printRootToLeafPathsSumToK(root.right, k-root.data, str+ root.data+" ");
	}



	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		String str="";
		printRootToLeafPathsSumToK(root, k, str);
	}


	public static void printAtDepthK(BinaryTreeNode<Integer> root , int k) {
		if(root==null) {return;}
		if(k==0) {System.out.print(root.data+" ");return;}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}




	public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int node, int k) {
		if(root==null){return 0;}
		if(root.data==node) {
			printAtDepthK(root, k);
			return 0;

		}
		int ld=nodesAtDistanceKHelper(root.left,node,k);
		int rd;
		if(ld==-1) {
			rd=nodesAtDistanceKHelper(root.right,node,k);
			if(rd==-1) {return -1;}
			else if(rd+1==k) {System.out.println(root.data);}
			else{printAtDepthK(root, k-rd-2);}


		}
		else if(ld+1==k) {System.out.print(root.data);}
		else {
			printAtDepthK(root, k-ld-2);
		}








		return -1;

	}



	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {

		//Your code goes here

		if(root==null){
			return;
		}
		nodesAtDistanceKHelper(root,node,k);



	}


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null) {return false;}

		if(root.data==k) {return true;}
		else if(root.data<k) {return searchInBST(root.right, k);}
		else {return searchInBST(root.left,k);}


	}

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

		if (root==null) {return;}


		if(root.data<k1) {elementsInRangeK1K2(root.right, k1, k2);}
		else if(root.data>k2) {elementsInRangeK1K2(root.left, k1, k2);}
		else {
			elementsInRangeK1K2(root.left, k1, k2);
			System.out.print(root.data+" ");
			elementsInRangeK1K2(root.right, k1, k2);
			}



	}
	
	
	public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int n,int si,int ei){
		if(si>ei) {return null;}
		int mid= si+(ei-si)/2;
		
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(arr[mid]);
		int leftsi=si;
		int leftei=mid-1;
		int rytsi=mid+1;
		int  rytei=ei;
		
		BinaryTreeNode<Integer> leftChild=SortedArrayToBSTHelper(arr, n, leftsi, leftei);
		BinaryTreeNode<Integer> rytChild=SortedArrayToBSTHelper(arr, n, rytsi, rytei);
		
		root.left=leftChild;
		root.right=rytChild;
		return root;
		
		
		
		
		
	}
	
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		
		return SortedArrayToBSTHelper(arr, n,0, n-1);
		
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin=minimum(root.left);
		int RightMin=minimum(root.right);
		
		return  Math.min(root.data,Math.min(leftMin, RightMin)) ;    
	}
	
	
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if(root==null) {return true;}
		
		int leftMax=largest(root.left);
		if(root.data<=leftMax) {return false;}
		int rightMin=minimum(root.right);
		if(root.data>rightMin) {return false;}
		
		boolean isLeftBST=isBST(root.left);
		boolean isRightBST=isBST(root.right);
		return isLeftBST && isRightBST;
		
		
		
	
	}
	
	public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		if(root==null) {
			IsBSTReturn ans=new IsBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE, true);
			return ans;
		}
		 IsBSTReturn leftAns=isBST2(root.left);
		 IsBSTReturn rightAns=isBST2(root.right);
		 
		 int min=Math.min(root.data,Math.min(leftAns.min, rightAns.min));
		 int max=Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		 
		 boolean isBST=true;
		 if(leftAns.max>=root.data) {isBST=false;}
		 if(rightAns.min<root.data) {isBST=false;}
		 if(!leftAns.isBST || !rightAns.isBST) {isBST=false;}
		  IsBSTReturn ans=new IsBSTReturn(min, max, isBST);
		  return ans;
		
		
	}
	
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange,int maxRange ) {
		if(root==null) {return true;}
		
		if(root.data<minRange || root.data>=maxRange) {return false;}
		
		 boolean isLeftWithInRange=isBST3(root.left, minRange, root.data-1);
		 boolean isRightWithInRange=isBST3(root.right, root.data, maxRange);
		 
		 return isLeftWithInRange && isRightWithInRange;
	
	}
	
	
	
	public ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
		if(root==null) {
			return null;
		}
		
		if(root.data==x) {
			ArrayList<Integer> output=new ArrayList<>(root.data);
			return output;
			
		}
		ArrayList<Integer> leftOutput=nodeToRootPath(root.left, x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
			
		}
		ArrayList<Integer> rightOutput =nodeToRootPath(root.right, x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		
		return null;
		
		
	}
	
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
		
		if(root==null) {
			return null;
		}
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if(root.data>data) {
			ArrayList<Integer> leftOutput=getPath(root.left, data);
			if(leftOutput!=null) {
				leftOutput.add(root.data);
				return leftOutput;
			}
			else return null;
		}
		else {
			ArrayList<Integer> rightOutput=getPath(root.right, data);
			if(rightOutput!=null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
			else return null;
		}
		
	}
	
	
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
		
	if(root==null) {return null;}
	Queue <BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
	pendingNodes.add(root);
	int currentLevelRemaining=1;
	int nextLevelCount=0;
	LinkedListNode<Integer> currentLevelHead=null;
	LinkedListNode<Integer> currentLevelTail=null;
	ArrayList<LinkedListNode<Integer>> output=new ArrayList<>();
	while(!pendingNodes.isEmpty()) {
		BinaryTreeNode<Integer> currentNode=pendingNodes.remove();
		LinkedListNode<Integer> newNode=new LinkedListNode<>(currentNode.data);
		if(currentLevelHead==null) {
			currentLevelHead=newNode;
			currentLevelTail=newNode;
		}
		else {
			currentLevelTail.next=newNode;
			currentLevelTail=currentLevelTail.next;
		}
		
		if(currentNode.left!=null) {
			pendingNodes.add(currentNode.left);
			nextLevelCount++;
		}
		if(currentNode.right!=null) {
			pendingNodes.add(currentNode.right);
			nextLevelCount++;
		}
		
		currentLevelRemaining--;
		if(currentLevelRemaining==0) {
			output.add(currentLevelHead);
			currentLevelHead=null;
			currentLevelTail=null;
			currentLevelRemaining=nextLevelCount;
			nextLevelCount=0;
		}
		
		
	}
        
   
    return output;
    
	
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		//		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		//		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
		//
		//		root.left=rootleft;
		//		root.right=rootright;
		//
		//		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
		//		BinaryTreeNode<Integer> threeleft =new BinaryTreeNode<Integer>(5);
		//		rootleft.right=tworight;
		//		rootright.left=threeleft;
		//		BinaryTreeNode<Integer>root=takeTreeInputBetter(true, 0, false);
		//		
		//		//takeTreeInput();
		//		
		//		BinaryTreeNode<Integer> root=takeInputLevelWise();
		//		printLevelWise(root);
		//
		//
		//		changeToDepthTree(root);
		////		printTreeDetailed(root);
		//		System.out.println("Num of nodes: "+numNodes(root));
		//		System.out.println(largest(root));


		int in []= {1,2,3,4,5,6,7};
		int pre[]= {4,2,1,3,6,5,7};

		BinaryTreeNode<Integer> root=buildTreeFronPreIn(pre, in);
		System.out.println(isBST(root));
		printTreeDetailed(root);
		IsBSTReturn ans=isBST2(root);
		
		
		System.out.println(ans.min + " " + ans.max +" "+  ans.isBST);


	}

}
