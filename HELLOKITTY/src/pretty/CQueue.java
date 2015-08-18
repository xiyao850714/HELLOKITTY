package pretty;

import java.util.Stack;
/*
 * Author: Linda.yin
 * Use two Stack to realize Queue.
 * Queue push & Queue pop.
 * POP: if stout is not null, just pop.
 *      if stout is null, pop all element in stin and push them to stout, then pop.
 */
public class CQueue{
	static Stack<Integer> stin = new Stack<Integer>();
	static Stack<Integer> stout = new Stack<Integer>();
	
	//Return: void. Input variable is int.
	public static void queueIn(int n){
		stin.push(n);
//		System.out.println(stin.peek());
	}
	
	
	//Return int. No input variable.
	public static int queueOut() throws Myexception{
		if(!stout.isEmpty()){
//			System.out.println(stout.peek());
			return stout.pop();
		}
		if(stin.isEmpty()) {throw new Myexception("No elements in this queue");}
		while(!stin.isEmpty()){
			stout.push(stin.pop());
//			System.out.println(stout.peek());
		}
//		System.out.println(stout.peek());
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