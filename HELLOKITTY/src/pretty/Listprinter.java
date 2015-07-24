package pretty;

import java.util.Stack;

public class Listprinter {
	public static void printRList(Node<Integer> n){
		Stack<Integer> st = new Stack<Integer>();
		while (n != null){
			st.push(n.data);
//			System.out.print(st.peek());
			n = n.next;
		}
		while(st.peek() != null){
			System.out.print(st.peek());
			st.pop();			
		}
	}

	public static void main(String[] args) {
	    Node<Integer> nm1 = new Node<Integer>(4,null);
	    Node<Integer> nm2 = new Node<Integer>(1,nm1);
	    Node<Integer> nm3 = new Node<Integer>(7,nm2);
	    Listprinter.printRList(nm3);
	}

}
