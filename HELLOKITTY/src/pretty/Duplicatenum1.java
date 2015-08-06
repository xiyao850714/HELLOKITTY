package pretty;

public class Duplicatenum1 {
	public static Node<Integer> deleteDup(Node<Integer> n) throws Myexception{
		if(n == null){
			throw new Myexception("n should not be null");
		}
		if(n.next == null){
			return n;
		}
		Node<Integer> current = n;
		Node<Integer> head = new Node<Integer>(0,current);
		head.next = n;
	    Node<Integer> temp = n;
	    while(n != null && n.next != null){
	    	temp = n.next;
	    	if(n.data == n.next.data){
	    		while(n.data == temp.data && temp.next != null){
	    		temp = temp.next;
	    	    }
	    	    n = temp;
	        }else{
	        	current.next = n;
	        	n = n.next;
	        	current = current.next;
	        }
	    
	    }
	    current.next = n;
	    head = head.next;
	    while(head != null){
	    	System.out.println(head.data);
	    	head = head.next;
	    }
	    return head.next;
	}
	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(9, null);
		Node<Integer> micheal2 = new Node<Integer>(8, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(8, micheal2);
		Node<Integer> michael4 = new Node<Integer>(7, micheal3);
		Node<Integer> michael5 = new Node<Integer>(7, michael4);
		Node<Integer> michael6 = new Node<Integer>(6, michael5);
		Node<Integer> michael7 = new Node<Integer>(5, michael6);
		Node<Integer> michael8 = new Node<Integer>(5, michael7);
		Node<Integer> michael9 = new Node<Integer>(5, michael8);
		Node<Integer> michael10 = new Node<Integer>(4, michael9);
		Node<Integer> michael11 = new Node<Integer>(3, michael10);
		Node<Integer> michael12 = new Node<Integer>(3, michael11);
		Node<Integer> michael13 = new Node<Integer>(2, michael12);
		Node<Integer> michael14 = new Node<Integer>(1, michael13);
		Node<Integer> michael15 = new Node<Integer>(1, michael14);
		Node<Integer> michael16 = new Node<Integer>(1, michael15);
		try {
			Duplicatenum1.deleteDup(michael16);
			Duplicatenum1.deleteDup(null);
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}

	}

}
