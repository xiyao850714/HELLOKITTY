package pretty;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KMerge {
	private static PriorityQueue<Node<Integer>> minHeap = null;
	//Use heap
	public static Node<Integer> mergeKList1(Node<Integer>[] source){
		int k = source.length;
		minHeap = new PriorityQueue<Node<Integer>>(k, new Comparator<Node<Integer>>(){
			@Override
			public int compare(Node<Integer> o1, Node<Integer> o2) {
				return o1.data - o2.data;
			}
		});	
		for(Node<Integer> n : source){
			if(n != null){
			minHeap.add(n);
			}
		}
		Node<Integer> head = new Node<Integer>(0,null);
		Node<Integer> cur = head;
		while(minHeap.size() > 0){
			Node<Integer> temp = minHeap.poll();
			cur.next = temp;
			if(temp.next != null){
				minHeap.add(temp.next);
			}
			cur = cur.next;
		}
//		while(head != null){
//			System.out.println(head.data);
//			head = head.next;
//		}
        return head.next;	
	}

	public static void main(String[] args) {
		Node<Integer> micheal1 = new Node<Integer>(10, null);
		Node<Integer> micheal2 = new Node<Integer>(7, micheal1);
		Node<Integer> micheal3 = new Node<Integer>(5, micheal2);
		Node<Integer> micheal4 = new Node<Integer>(3, micheal3);
		Node<Integer> micheal5 = new Node<Integer>(1, micheal4);
		Node<Integer> linda1 = new Node<Integer>(9, null);
		Node<Integer> linda2 = new Node<Integer>(4, linda1);
		Node<Integer> linda3 = new Node<Integer>(2, linda2);
		Node<Integer>[] n = new Node[2];
		n[0] = linda3;
		n[1] = micheal4;
		KMerge.mergeKList1(n);

	}
}
