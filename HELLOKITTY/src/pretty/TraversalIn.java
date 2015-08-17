package pretty;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TraversalIn {
	public static List<Integer> inorderTraversal(TreeNode<Integer> root){
		List<Integer> order = new ArrayList<Integer>();
		Stack<TreeNode<Integer>> st = new Stack<TreeNode<Integer>>();
		if(root == null) return order;
		TreeNode<Integer> tn = root;
        while(!st.isEmpty()||tn!=null){
            if(tn!=null){
                st.push(tn); 
                tn=tn.left;
            }else{
                tn=st.pop();
                order.add(tn.data);
                tn=tn.right;
            }
        }
		for(int item:order){
		   System.out.println(item);
	    }
		return order;
    }

	public static void main(String[] args) {
		TreeNode<Integer> linda15 = new TreeNode<Integer>(15,null,null);
		TreeNode<Integer> linda14 = new TreeNode<Integer>(13,null,null);
		TreeNode<Integer> linda13 = new TreeNode<Integer>(11,null,null);
		TreeNode<Integer> linda12 = new TreeNode<Integer>(9,null,null);
		TreeNode<Integer> linda11 = new TreeNode<Integer>(7,null,null);
		TreeNode<Integer> linda10 = new TreeNode<Integer>(5,null,null);
		TreeNode<Integer> linda9 = new TreeNode<Integer>(3,null,null);
		TreeNode<Integer> linda8 = new TreeNode<Integer>(1,null,null);
		TreeNode<Integer> linda7 = new TreeNode<Integer>(14,linda14,linda15);
		TreeNode<Integer> linda6 = new TreeNode<Integer>(10,linda12,linda13);
		TreeNode<Integer> linda5 = new TreeNode<Integer>(6,linda10,linda11);
		TreeNode<Integer> linda4 = new TreeNode<Integer>(2,linda8,linda9);
		TreeNode<Integer> linda3 = new TreeNode<Integer>(12,linda6,linda7);
		TreeNode<Integer> linda2 = new TreeNode<Integer>(4,linda4,linda5);
		TreeNode<Integer> linda1 = new TreeNode<Integer>(8,linda2,linda3);
		TraversalIn.inorderTraversal(linda1);
	}

}
