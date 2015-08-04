package pretty;

public class Duplicatenum {
	public static void removeDup(Node<Integer> n) throws Myexception{
		if(n == null){
			throw new Myexception("n should not be null");
		}
		Node<Integer> head = null;			
		while(n.data == n.next.data){
				n = n.next;
			}
		head = n;
		while(n.next != null && n.next.next != null){

			if(n.data == n.next.data){
				n = n.next.next;
			}else{
				n = n.next;
			}
		}
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(10, null);
		Node<Integer> micheal2 = new Node<Integer>(8, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(7, micheal2);
		Node<Integer> michael4 = new Node<Integer>(1, micheal3);
		Node<Integer> michael5 = new Node<Integer>(1, michael4);
		Node<Integer> michael6 = new Node<Integer>(1, michael5);
		Node<Integer> michael7 = new Node<Integer>(1, michael6);
		Node<Integer> michael8 = new Node<Integer>(1, michael7);
		try {
			Duplicatenum.removeDup(michael8);
		} catch (Myexception e) {
            System.out.println(e.getMessage());
		}
	}

}
