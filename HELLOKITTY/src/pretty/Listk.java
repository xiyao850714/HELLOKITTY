package pretty;

public class Listk {
	public static int getListk(Node<Integer> n,int k) {
		if(k < 0) return 0; 
		Node<Integer> slow = n;
		Node<Integer> fast = n;
		for(int i = 1; i < k; i++){
			if(fast.next != null)  fast = fast.next;
		}
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		int tmp = (int)slow.data;
		System.out.println(tmp);
		return (int)slow.data;
	}

	public static void main(String[] args) {
	    Node<Integer> nm1 = new Node<Integer>(4,null);
	    Node<Integer> nm2 = new Node<Integer>(1,nm1);
	    Node<Integer> nm3 = new Node<Integer>(7,nm2);
	    Node<Integer> nm4 = new Node<Integer>(11,nm3);
		Listk.getListk(nm4, 4);
		Listk.getListk(nm4, 5);

	}

}
