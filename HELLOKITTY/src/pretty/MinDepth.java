package pretty;
/*
 * Author: linda.yin
 * Minimum Depth of Binary Tree: The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Use idea of print tree by level.  
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class MinDepth {
	//Return the minimum depth of the tree. Input: the root node of the tree.
	public static int minDepth(TreeNode<Integer> root) {
		//Boundary condition.
		if(root == null) {return 0;}
		
		int depth = 1;
		int curLevel = 1;
		Deque<TreeNode<Integer>> dq = new ArrayDeque<TreeNode<Integer>>();
		dq.add(root);
		
		while (!dq.isEmpty()) {
			root = dq.pop();
			curLevel--;
			
			//When a node has both no left son and right son, will return the depth.
			if (root.left == null && root.right == null) {
				System.out.println(depth);
				return depth;
			}
		
	   		if(root.left != null){
    			dq.push(root.left);
    		}
    		if(root.right != null){
    			dq.push(root.right);
    		}
    		if(curLevel == 0){
    			depth ++;
    			curLevel = dq.size();
    		}
		}
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
		minDepth(linda1);
	}

}
