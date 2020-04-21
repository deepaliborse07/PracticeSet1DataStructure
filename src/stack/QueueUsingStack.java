//java program to implement Queue using two stacks
package stack;

import java.util.Stack;

public class QueueUsingStack {
	
	static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		
		//move all elements frm s1 to s2
		static void enQueue(int x) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			
			}
			s1.push(x);
			
			//push everything back to s1
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		static int deQueue() {
			
			//if first stack is empty
			if(s1.isEmpty()) {
				System.out.println("queue is empty");
				System.exit(0);
			}
			
			//return top of s1
			int x=s1.peek();
			s1.pop();
			return x;
			
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

}
