package pretty;

import java.util.Stack;

public class CQueue{
	static Stack<Integer> stin = new Stack<Integer>();
	static Stack<Integer> stout = new Stack<Integer>();
	public static void queueIn(int n){
		stin.push(n);
		System.out.println(stin.peek());
	}
	public static int queueOut() throws Myexception{
		if(stout.isEmpty() == false){
			System.out.println(stout.peek());
			return stout.pop();
		}
		if(stin.isEmpty() == true) {throw new Myexception("No elements in this queue");}
		while(stin.isEmpty() == false){
			stout.push(stin.pop());
			System.out.println(stout.peek());
		}
		System.out.println(stout.peek());
		return stout.pop();
	}
	public static void main(String[] args) {
		try {
			CQueue.queueOut();
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}
		CQueue.queueIn(5);
		CQueue.queueIn(1);
		CQueue.queueIn(8);		
		try {
			CQueue.queueOut();
			CQueue.queueOut();
			CQueue.queueOut();
			CQueue.queueOut();
		} catch (Myexception e) {
			System.out.println(e.getMessage());
		}

	}
}