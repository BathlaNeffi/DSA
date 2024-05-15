package binaryTree;


public class LCAofBST {
	
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) {
			return -1;
		}
		
		if(root.data==a|| root.data==b) {
			return root.data;
			
		}
		int c=getLCA(root.left, a, b);
		int d=getLCA(root.right, a, b);
		if(c==-1&&d==-1) {
			return -1;
		}
		else if(c==-1&& d!=-1) {
			return d;
		}
		else if(c!=-1&& d==-1) {
			return c;
		}
		else return root.data;
		
		
		
		
		
		
		
	}
	
	public static int replace (BinaryTreeNode<Integer> root,int sum) {
		
		if(root==null) {return 0;}
		
		int right = replace(root.right ,sum);
        int oldrootdata = root.data;
        root.data = root.data + right + sum;
        int left = replace(root.left ,root.data);
        
        return oldrootdata + right + left;
		
	}
	
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		
		int z=replace(root, 0);
		
		


		

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
