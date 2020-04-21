/*java prog to implement two stacks*/
package stack;

public class TwoStacks {

	int size;
	int top1,top2;
	int arr[];
	
	public TwoStacks(int n) {
		
		this.size = n;
		this.top1 = -1;
		this.top2 = size;
		this.arr = new int[n];
	}
	void push1(int x) {
		if(top1 < top2-1) {
			top1++;
			arr[top1]=x;
		}
		else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	
	void push2(int x) {
		if(top1 < top2-1) {
			top2--;
			arr[top2]=x;	
		}
		else {
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	
//	void push2(int x) {
//		if()
//	}
	
	int pop1() {
		if(top1>0) {
			int x=arr[top1];
			top1--;
			return x;
			
		}else {
			System.out.println("stack overflow");
			System.exit(1);
		}
		return 0;
		
	}
	
	int pop2() {
		if(top2<size) {
			int x=arr[top2];
			top2++;
			return x;
			
		}
		else {
			System.out.println("stack overflow");
			System.exit(1);
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStacks ts=new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("popped elementfrom stack1 "
				+ ts.pop1());
		ts.push2(6);
		System.out.println("popped element from stack2 "
		+ts.pop2());
		
	}




}
