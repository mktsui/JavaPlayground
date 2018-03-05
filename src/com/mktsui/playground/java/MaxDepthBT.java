package com.mktsui.playground.java;

class TreeNode {
	int val;
	TreeNode left = null;
	TreeNode right = null;
	
	TreeNode (int num) {
		val = num;
	}
}


public class MaxDepthBT {
	public static int maxDepth(TreeNode root) {
		// base case
		if (root == null)
			return 0;
		
		int leftHeight = maxDepth(root.left) + 1;
		int rightHeight = maxDepth(root.right) + 1;
		
		if (leftHeight > rightHeight)
			return leftHeight;
		else
			return rightHeight;
	}
	
}
