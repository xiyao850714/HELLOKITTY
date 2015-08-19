package pretty;
/*
 * Author:Linda.yin
 * Add Two Numbers :You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 */
public class TwoNumber {
	static int temp = 0,sum = 0;
	static Node<Integer> cur = new Node<Integer>(0,null);
	static Node<Integer> pre = new Node<Integer>(0,cur);	
	
	public static Node<Integer> addNumber(Node<Integer> n, Node<Integer> m){
		Node<Integer> head = new Node<Integer>(0,pre);
		
        //Boundary condition.
		while(n == null){
			return m;
		}
		while(m == null){
			return n;
		}
        
		while(n != null && m != null){
			sum = n.data + m.data + temp; // temp is used to store the carry.
			cur.data= sum%10;
			if(sum >= 10){			
				temp = sum/10;
			}
			if(sum < 10){
				temp = 0;
			}
			pre = cur;
			cur = new Node<Integer>(0,null);
			pre.next = cur;
			n = n.next;
			m = m.next;				
		}
		temp = sum/10;
		if(n == null && m == null){	
		pre.next = new Node<Integer>(temp,null);
		}
		
		// Deal with the condition that the length of the two list are not same.
		if(n == null){
			addOnlyone(m, temp);
		}
		if(m == null){
			addOnlyone(n, temp);
		}

        head = head.next.next;
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		} 
		return head;		
	}
	
	//Deal with the condition that one list longer than another.
	public static Node<Integer> addOnlyone(Node<Integer> p, int temp){
		Node<Integer> subHead = new Node<Integer>(0,pre);
		if(temp == 1){
			while(p != null){
				sum = p.data + temp;
				cur.data = sum%10;
				if(sum >= 10){
					temp = sum/10;
				}
				if(sum < 10){
					temp = 0;
				}
				pre = cur;
				cur = new Node<Integer>(0,null);
				pre.next = cur;
				p = p.next;		
			}
		}
		
		//When carry is 0, return the left nodes of the list.
		if(temp == 0){
			pre.next = p;
			return p;
		}
		return subHead;
	}
	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(8, null);
		Node<Integer> micheal2 = new Node<Integer>(1, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(5, micheal2);
		Node<Integer> micheal4 = new Node<Integer>(1, micheal3);
		Node<Integer> micheal5 = new Node<Integer>(7, micheal4);
		Node<Integer> linda1 = new Node<Integer>(6, null);
		Node<Integer> linda2 = new Node<Integer>(2, linda1);
		Node<Integer> linda3 = new Node<Integer>(9, linda2);
		Node<Integer> show1 = new Node<Integer>(0,null);
		Node<Integer> show2 = new Node<Integer>(1,null);
		Node<Integer> show3 = new Node<Integer>(0,null);
//	    Twonumber.addNumber(linda3, micheal5);
//	    Twonumber.addNumber(show1,show2);
	    TwoNumber.addNumber(show1,show3);
	}
}
