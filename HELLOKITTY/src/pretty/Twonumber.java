package pretty;

public class Twonumber {
	
	public static Node<Integer> addNumber(Node<Integer> n, Node<Integer> m){
		int temp = 0;
		int sum = 0;
		Node<Integer> head = null;
		Node<Integer> current = null;
		sum = n.data + m.data + temp;
		if(sum >= 10){
			temp = 1;
		}
		n = n.next;
		m = m.next;
		current = new Node<Integer>(sum%10,null);
		while(n.next != null && m.next != null){
			sum = n.data + m.data + temp;
			if(sum >= 10){
				temp = 1;
				head = new Node<Integer>(sum%10,null);
				current.next = head;
			}
			if(sum < 10){
				temp = 0;
				head = new Node<Integer>(sum,null);
				current.next = head;
			}
			n = n.next;
			m = m.next;
		}

		if(n.next == null){
			if(temp == 0){
				current.next = m;
			}
			while(temp == 1){
				sum = m.data + temp;
				if(sum >= 10){
					head = new Node<Integer>(sum%10,null);
					current.next = head;
					temp = 1;
				}
				if(sum < 10){
					temp = 0;
					head = new Node<Integer>(sum,null);
					current.next = head;
				}
			}
		}
		if(m.next == null){
			if(temp == 0){
				current.next = n;
			}	
			if(sum >= 10){
				head = new Node<Integer>(sum%10,null);
				current.next = head;
				temp = 1;
			}
			if(sum < 10){
				temp = 0;
				head = new Node<Integer>(sum,null);
				current.next = head;
			}
		}
		current.next = null;
		return current;		
	}
	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(4, null);
		Node<Integer> micheal2 = new Node<Integer>(1, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(7, micheal2);
		Node<Integer> linda1 = new Node<Integer>(11, null);
		Node<Integer> linda2 = new Node<Integer>(2, linda1);
		Node<Integer> linda3 = new Node<Integer>(9, linda2);
	    Twonumber.addNumber(linda3, micheal3);
	}
}
