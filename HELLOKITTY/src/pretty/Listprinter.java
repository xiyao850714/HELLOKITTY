package pretty;

import java.util.Stack;

public class Listprinter {
	public static void printRList(Node n){
		Stack st = new Stack();
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
	    Node nm1 = new Node(4,null);
	    Node nm2 = new Node(1,nm1);
	    Node nm3 = new Node(7,nm2);
	    Listprinter.printRList(nm3);
	}

}
