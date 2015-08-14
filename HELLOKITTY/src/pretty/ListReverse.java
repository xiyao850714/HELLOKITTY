package pretty;

public class ListReverse {
	public static Treenode<Integer> reverseList(Treenode<Integer> tn){
		if(tn == null | tn.left == null && tn.right == null){
			return null;
		}
		Treenode<Integer> root = tn;
		if(tn.left != null || tn.right != null){			
			Treenode<Integer> temp = tn.left;
			tn.left = tn.right;
			tn.right = temp;
			reverseList(tn.left);
			reverseList(tn.right);
			
		}
		return root;

	}
 
	public static void main(String[] args) {
		Treenode<Integer> linda15 = new Treenode<Integer>(15,null,null);
		Treenode<Integer> linda14 = new Treenode<Integer>(13,null,null);
		Treenode<Integer> linda13 = new Treenode<Integer>(11,null,null);
		Treenode<Integer> linda12 = new Treenode<Integer>(9,null,null);
		Treenode<Integer> linda11 = new Treenode<Integer>(7,null,null);
		Treenode<Integer> linda10 = new Treenode<Integer>(5,null,null);
		Treenode<Integer> linda9 = new Treenode<Integer>(3,null,null);
		Treenode<Integer> linda8 = new Treenode<Integer>(1,null,null);
		Treenode<Integer> linda7 = new Treenode<Integer>(14,linda14,linda15);
		Treenode<Integer> linda6 = new Treenode<Integer>(10,linda12,linda13);
		Treenode<Integer> linda5 = new Treenode<Integer>(6,linda10,linda11);
		Treenode<Integer> linda4 = new Treenode<Integer>(2,linda8,linda9);
		Treenode<Integer> linda3 = new Treenode<Integer>(12,linda6,linda7);
		Treenode<Integer> linda2 = new Treenode<Integer>(4,linda4,linda5);
		Treenode<Integer> linda1 = new Treenode<Integer>(8,linda2,linda3);
        ListReverse.reverseList(linda1);
	}

}
