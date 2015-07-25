package pretty;

public class Listk {
	public static Integer getListk(Node<Integer> n, int k) throws Myexception {
		if (k < 1) {throw new Myexception("k should be positive.");}
		Node<Integer> slow = n;
		Node<Integer> fast = n;
		for (int i = 1; i < k; i++) {
			if (fast.next == null) {throw new Myexception("k should be le length of List.");}
			if (fast.next != null) {
				fast = fast.next;
			}
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		int tmp = slow.data;
		System.out.println(tmp);
		return slow.data;
	}

	public static void main(String[] args) {
		Node<Integer> nm1 = new Node<Integer>(4, null);
		Node<Integer> nm2 = new Node<Integer>(1, nm1);
		Node<Integer> nm3 = new Node<Integer>(7, nm2);
		Node<Integer> nm4 = new Node<Integer>(11, nm3);

		try {
			Listk.getListk(nm4, -1);
			Listk.getListk(nm4, 0);
			Listk.getListk(nm4, 1);
			Listk.getListk(nm4, 4);
			Listk.getListk(nm4, 5);
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}

	}

}
