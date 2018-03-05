package com.mktsui.playground.java;

//class TreeNode {
//	int val;
//	TreeNode left;
//	TreeNode right;
//	
//	TreeNode (int num) {
//		val = num;
//	}
//}

public class SortedArray2BST {
	public TreeNode sortedArrayToBST (int[] nums) {
		TreeNode root = insertBST(nums, 0, nums.length-1);
		preorderRec(root);
		return root;
    }
	
	public TreeNode insertBST(int[] nums, int start, int end) {
		// Base case
		if (start > end)
			return null;
		
		int middle = (start+end) / 2;
		TreeNode node = new TreeNode(nums[middle]);
		
		// insert left
		node.left = insertBST(nums, start, middle-1);
		
		// insert right
		node.right = insertBST(nums,middle+1, end);
		
		return node;		
	}
	
	public void preorderRec(TreeNode node){
		if (node != null) {
			System.out.println(node.val);
			preorderRec(node.left);
			preorderRec(node.right);
		}
	}
	
}
