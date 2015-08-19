package pretty;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Author:linda.yin
 * Maximum Depth of Binary Tree: The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaxDepth {
	
	//Return the max depth of the tree.
    public static int maxDepth(TreeNode<Integer> root) {
    	if(root == null) {return 0;}
    	Deque<TreeNode<Integer>> dq = new ArrayDeque<TreeNode<Integer>>();
		int depth = 1;
		int curLevel = 1;
		int nexLevel = 0;
		dq.add(root);
		
		//Compare with MinDepth, the end condition of the while is not the same.
		while (!dq.isEmpty()) {
			root = dq.pop();
			curLevel--;
			
			//Add all node of one level, and mark the number of node.
			if (root.left != null) {
				dq.add(root.left);
				nexLevel++;
			}
			if (root.right != null) {
				dq.add(root.right);
				nexLevel++;
			}
			
			//Every time update the level num.
			if (curLevel == 0) {
				if (nexLevel != 0) {
					depth++;
				}
				curLevel = nexLevel;
				nexLevel = 0;
			}
		}
//    	System.out.println(depth);
		return depth;       
    }
	public static void main(String[] args) {
		TreeNode<Integer> linda15 = new TreeNode<Integer>(15, null, null);
		TreeNode<Integer> linda14 = new TreeNode<Integer>(13, null, null);
		TreeNode<Integer> linda13 = new TreeNode<Integer>(11, null, null);
		TreeNode<Integer> linda12 = new TreeNode<Integer>(9, null, null);
		TreeNode<Integer> linda11 = new TreeNode<Integer>(7, null, null);
		TreeNode<Integer> linda10 = new TreeNode<Integer>(5, null, null);
		TreeNode<Integer> linda9 = new TreeNode<Integer>(3, null, null);
		TreeNode<Integer> linda8 = new TreeNode<Integer>(1, null, null);
		TreeNode<Integer> linda7 = new TreeNode<Integer>(14, linda14, linda15);
		TreeNode<Integer> linda6 = new TreeNode<Integer>(10, null, null);
		TreeNode<Integer> linda5 = new TreeNode<Integer>(6, linda10, linda11);
		TreeNode<Integer> linda4 = new TreeNode<Integer>(2, linda8, linda9);
		TreeNode<Integer> linda3 = new TreeNode<Integer>(12, linda6, linda7);
		TreeNode<Integer> linda2 = new TreeNode<Integer>(4, linda4, linda5);
		TreeNode<Integer> linda1 = new TreeNode<Integer>(8, linda2, linda3);
		maxDepth(linda1);
	}

}
