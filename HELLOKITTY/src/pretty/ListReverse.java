package pretty;

public class ListReverse {
	public static TreeNode<Integer> reverseList(TreeNode<Integer> tn){
		if(tn == null | tn.left == null && tn.right == null){
			return null;
		}
		TreeNode<Integer> root = tn;
		if(tn.left != null || tn.right != null){			
			TreeNode<Integer> temp = tn.left;
			tn.left = tn.right;
			tn.right = temp;
			reverseList(tn.left);
			reverseList(tn.right);
			
		}
		return root;

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
        ListReverse.reverseList(linda1);
	}

}
