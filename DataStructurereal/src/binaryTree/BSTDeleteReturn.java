package binaryTree;

public class BSTDeleteReturn {
	BinaryTreeNode<Integer> node;
	boolean deleted;
	
	public BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted) 
	{
		this.deleted=deleted;
		this.node=root;
	}

}
