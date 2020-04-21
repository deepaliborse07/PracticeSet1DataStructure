//program t get minimum element from stack
package stack;

import java.util.Stack;

public class MinElementInStack {
	
	private Stack<Integer> st=new Stack<>();
	private Stack<Integer> minSt =new Stack<>();
	
	public void push(int data) {
		
		int min=data;
		
		if(!minSt.isEmpty() && min>minSt.peek()) {
			min=minSt.peek();
		}
		
		st.push(data);
		minSt.push(min);
		
	}
	
	public void pop() {
		st.pop();
		minSt.pop();
		
	}
	
	public int getMinimum() {
		return minSt.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinElementInStack MinEle=new MinElementInStack();
		MinEle.push(3);
		MinEle.push(2);
		MinEle.push(1);
		MinEle.push(9);
		MinEle.push(8);
		
		System.out.println(MinEle.st);
		System.out.println(MinEle.minSt);
		System.out.println(MinEle.getMinimum());
		
		MinEle.pop();
		MinEle.pop();
		
		System.out.println(MinEle.st);
		System.out.println(MinEle.minSt);
		

	}

}
