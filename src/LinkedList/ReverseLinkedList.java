/*Reverse a linked list*/
package linkedList;

public class ReverseLinkedList {
	
	static Node head;

	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			//super();
			this.data = data;
			this.next = null;
		}
		
}
	/*Function to reverse the linked list*/
	Node reverse(Node node) {
		Node prev=null;
		Node current=node;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			}
		node=prev;
		return node;
		
	}
	
	void PrintList(Node node) {
		while(node!=null) {
			System.out.println(node.data+"");
			node=node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList list=new ReverseLinkedList();
		list.head=new Node(85);
		list.head.next=new Node(15);
		list.head.next.next=new Node(4);
		list.head.next.next.next=new Node(20);
		
		System.out.println("Given Linked list");
		list.PrintList(head);
		head=list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list");
		list.PrintList(head);
	}

}
