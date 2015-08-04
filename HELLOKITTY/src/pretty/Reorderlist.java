package pretty;

import java.util.Stack;

public class Reorderlist {
	public static Node<Integer> reorderList(Node<Integer> n) throws Myexception{
		if(n == null){
			throw new Myexception("list should not be null");
		}
		Node<Integer> show = n;
		Stack<Node<Integer>> st = new Stack<Node<Integer>>();
		Node<Integer> start = Reorderlist.getMiddle(n);
		while(start != null){
			st.push(start);
			start = start.next;
		}
		Node<Integer> temp = null;
		while(! st.isEmpty() && n.next != null){
			temp = n.next;
			n.next = st.pop();
			n.next.next = temp;
			n = n.next.next;
		}
		n.next = null;
		while(show != null){
	    	System.out.println(show.data);
	    	show = show.next;
		}
		return n;
	}
    public static Node<Integer> getMiddle(Node<Integer> head){
    	Node<Integer> slow = head;
    	Node<Integer> fast = head;
    	while(fast.next != null && fast.next.next != null){
    		slow = slow.next;
    		fast = fast.next.next;
    	}
    	Node<Integer> result = slow.next;
    	return result;
    }
	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(4, null);
		Node<Integer> micheal2 = new Node<Integer>(1, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(7, micheal2);
		Node<Integer> michael4 = new Node<Integer>(11, micheal3);
		Node<Integer> michael5 = new Node<Integer>(2, michael4);
		Node<Integer> michael6 = new Node<Integer>(9, michael5);
		Node<Integer> michael7 = new Node<Integer>(3, michael6);
		Node<Integer> michael8 = new Node<Integer>(6, michael7);
		try {
			Reorderlist.reorderList(michael7);
//	        Reorderlist.reorderList(michael8);
		} catch (Myexception e) {
			System.out.print(e.getMessage());
		}

	}

}
