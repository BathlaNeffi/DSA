package FullTest1;

import java.util.*;
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
	public void setRight(BinaryTreeNode<T> root)
	{
		right=root;

	}
	public void setLeft(BinaryTreeNode<T> root)
	{
		left=root;

	}
}

public class MergeTwoBSTs {

	public static void print(BinaryTreeNode<Integer> root) {
		if (root==null) return;
		print(root.left);
		System.out.print(root.data + " ");
		print(root.right);
	}

	public static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		BinaryTreeNode<Integer> merged = mergeBST(root1, root2);
		print(merged);
	}

	// Function to store the inorder traversal of tree in a list.
	public static void storeInOrder(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
		if (root != null) {
			storeInOrder(root.left, arr);
			arr.add(root.data);
			storeInOrder(root.right, arr);
		}
	}

	// Method that merges two ArrayLists into one.
	public static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

		int m = arr1.size();
		int n = arr2.size();
		// Arr3 will contain the merge of arr1 and arr2.
		ArrayList<Integer> arr = new ArrayList<>();
		int i = 0;
		int j = 0;

		// Traversing through both ArrayLists.
		while (i < m && j < n) {
			// Smaller one goes into arr3.
			if (arr1.get(i) < arr2.get(j)) {
				arr.add(arr1.get(i));
				i++;
			} else {
				arr.add(arr2.get(j));
				j++;
			}
		}

		// Adds the remaining elements of arr1 into arr3.
		while (i < m) {
			arr.add(arr1.get(i));
			i++;
		}

		// Adds the remaining elements of arr2 into arr3.
		while (j < n) {
			arr.add(arr2.get(j));
			j++;
		}
		return arr;
	}

	// Method that converts a sorted ArrayList to a BST.
	public static BinaryTreeNode<Integer> constructBSTFromSortedArray(ArrayList<Integer> arr, int start, int end) {
		// Base case.
		if (start > end) {
			return null;
		}

		// Get the middle element and make it root.
		int mid = (start + end) / 2;
		BinaryTreeNode<Integer> node = new BinaryTreeNode(arr.get(mid));

		// Recursively construct the left subtree and make it left child of root.
		node.left = constructBSTFromSortedArray(arr, start, mid - 1);

		// Recursively construct the right subtree and make it right child of root.
		node.right = constructBSTFromSortedArray(arr, mid + 1, end);

		return node;
	}

	// Method that merges two trees into a single one.
	public static BinaryTreeNode<Integer> mergeBST(BinaryTreeNode<Integer> node1, BinaryTreeNode<Integer> node2) {
		// Store the in-order traversal of tree1 in an array.
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		storeInOrder(node1, temp1);

		// Store the in-order traversal of tree2 in an array.
		ArrayList<Integer> temp2 = new ArrayList<Integer>();
		storeInOrder(node2, temp2);

		// Merge the two sorted arrays.
		ArrayList<Integer> temp3 = mergeSortedArrays(temp1, temp2);

		// Construct the balanced BST from this sorted array.
		BinaryTreeNode<Integer> node = constructBSTFromSortedArray(temp3, 0, temp3.size() - 1);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		

	}

}
