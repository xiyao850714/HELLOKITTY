package pretty;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class KthLargest {
	private PriorityQueue<Integer> heap = null;

	public int findKthLargest(int[] nums, int k) {
		if (nums.length < k) {
			return -1;
		}
		//Define comparator for min heap
		heap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		for (int num:nums) {
			//For the first k elements, build heap. 
			if (heap.size() < k) {
				heap.add(num);
			} else {
				//For the element after k, if it great than heap top, remove it and add it.
				if (heap.peek() < num) {
					heap.remove();
					heap.add(num);
				}
			}
		}
		return heap.peek();
	}



	public static void main(String[] args) {
		int[] nums = new int[] { 6, 4, 7, 10, 8, 9, 22 };
		System.out.println(new KthLargest().findKthLargest(nums,1));
	}
}
