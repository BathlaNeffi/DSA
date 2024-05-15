package binaryTree;

public class LargestBST {
	
	
	
	public static LargestBSTReturn helper(BinaryTreeNode<Integer> root) {
		if(root==null) {
			LargestBSTReturn ans=new LargestBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
			return ans;
		}
		
		LargestBSTReturn leftSubtree=helper(root.left);
		LargestBSTReturn rightSubtree=helper(root.right);
		int min=Math.min(root.data, Math.min(leftSubtree.min, rightSubtree.min));
		int max=Math.max(root.data, Math.max(leftSubtree.max, rightSubtree.max));
		
		boolean isBST=true;
		if(root.data<leftSubtree.max) {isBST=false;}
		if(root.data>rightSubtree.min) {isBST=false;}
		if(!leftSubtree.isBST|| !rightSubtree.isBST) {isBST=false;}
		int height=0;
		if(!isBST) {
			height=Math.max(leftSubtree.height, rightSubtree.height);
		}
		else {
			height=Math.max(leftSubtree.height, rightSubtree.height) +1;
		}
		
		LargestBSTReturn ans=new LargestBSTReturn(min,max,isBST,height);
		return ans;
		
		
		
		
		
		
	}
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
		LargestBSTReturn ans=helper(root);
		return ans.height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
