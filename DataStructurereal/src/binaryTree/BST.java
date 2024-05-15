package binaryTree;






public class BST  {
	private BinaryTreeNode<Integer> root;
	int size;

	private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x) {
		if(node==null) {return false;}

		if(node.data==x) {return true;}
		if(node.data>x) {
			// search in left side

			return isPresentHelper(node.left, x);
		}
		else {
			return isPresentHelper(node.right, x);
		}
	}

	public boolean isPresent (int x) {
		return isPresentHelper(root,x);
	}

	public void insert(int x) {
		root=insertHelper(root,x);
		size++;
	}

	public boolean deleteData(int x) {
		BSTDeleteReturn output=deleteDataHelper(root, x);
		root=output.node;
		if(output.deleted) {
			size--;
		}
		return output.deleted;
	}

	public int size() {
		return size;
	}
	public void printTree() {
		printTreehelper(root);

	}
	private static void printTreehelper(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data + ": ");
		if(node.left!=null) {
			System.out.print("L"+node.left.data+",");
		}
		if(node.right!=null) {
			System.out.print("R"+ node.right.data);
		}
		System.out.println();

		printTreehelper(node.left);
		printTreehelper(node.right);
	}

	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node,int x) {

		if(node==null) {
			BinaryTreeNode<Integer> ans=new BinaryTreeNode<Integer>(x);
			return ans;
		}


		if(x<=node.data) {
			node.left=insertHelper(node.left, x);

		}
		else{
			node.right=insertHelper(node.right, x);
		}
		return node;
	}




	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> node,int x) {
		if(node==null) {

			return new BSTDeleteReturn(null,false);
		}
		if(node.data>x) {
			BSTDeleteReturn leftPart=deleteDataHelper(node.left, x);
			node.left=leftPart.node;
			leftPart.node=node;
			return leftPart;

		}
		if(node.data<x) {
			BSTDeleteReturn rightPart=deleteDataHelper(node.right, x);
			node.right=rightPart.node;
			rightPart.node=node;
			return rightPart;

		}

		if(node.left==null && node.right==null) {
			return new BSTDeleteReturn(null, true);
		}

		if(node.left==null&& node.right!=null) {
			return new BSTDeleteReturn(node.right, true);

		}

		if(node.right==null&& node.left!=null) {
			return new BSTDeleteReturn(node.left, true);
		}

		int rightMin=minimum(node.right);
		node.data=rightMin;
		BSTDeleteReturn rightOutput=deleteDataHelper(node.right, rightMin);
		node.right=rightOutput.node;
		rightOutput.node=node;
		return rightOutput;




	}

	private static int minimum(BinaryTreeNode<Integer> node) {
		if(node==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin=minimum(node.left);
		int rightMin=minimum(node.right);
		return Math.min(node.data,Math.min(leftMin, rightMin));

	}



}
