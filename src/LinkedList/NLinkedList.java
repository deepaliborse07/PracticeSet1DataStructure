/*Program for nth node from the end of linked list*/
package linkedList;

public class NLinkedList {
	Node head;//
	
	/*Linked List Node*/
	class Node{
		int data;
		Node next;
		
		public Node(int d) {
			
			this.data = d;
			this.next = null;
		}
		
	}
	
	void printNthFromLast(int n) {
		
		int len=0;
		Node temp=head;
		
		//1count number of nodes in linked list
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		
		//check if value of nis not morethan length
		if(len < n)
			return;
		
		temp=head;
		
		//2)get the (len-n+1)th node from beginning
		
		for(int i=1;i<len-n+1;i++)
			temp=temp.next;
		
		System.out.println(temp.data);
	}
	
	public void push(int new_data) {
		
		Node new_node =new  Node(new_data);
		
		new_node.next=head;
		
		head=new_node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NLinkedList list=new NLinkedList();
		list.push(20);
		list.push(4);
		list.push(15);
		list.push(35);
		
		list.printNthFromLast(4);
	}

}
