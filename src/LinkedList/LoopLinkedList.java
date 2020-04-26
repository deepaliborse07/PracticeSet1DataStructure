package linkedList;

public class LoopLinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			
			this.data = data;
			this.next = next;
		}
	}
	
	int detectAndRemoveLoop(Node node) {
		Node slow=node,fast=node;
		
		while(slow!=null  && fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			//if slow and fast meet at same point loop is present
			if(slow==fast) {
				removeLoop(slow,node);
				return 1;
				
			}
			
		}
		return 0;
		
	}

	
	//Remove loop
	private void removeLoop(Node loop, Node curr) {
		// TODO Auto-generated method stub
		Node ptr1=null,ptr2=null;
		
		ptr1=curr;
		while(1==1) {
			ptr2=loop;
			while(ptr2.next!=loop && ptr2.next!=ptr1) {
				ptr2=ptr2.next;
			}
			
			if(ptr2.next==ptr1) {
				break;
			}
			
			ptr1=ptr1.next;
		}
		
		ptr2.next=null;
		
	}
	
	void PrintList(Node node) {
		while(node!=null) {
			System.out.println(node.data +" ");
			node=node.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoopLinkedList list=new LoopLinkedList();
		list.head=new Node(50);
		list.head.next=new Node(20);
		list.head.next.next=new Node(15);
		list.head.next.next.next=new Node(4);
		list.head.next.next.next.next=new Node(10);
		
		
		//creating a loop for testing
		head.next.next.next.next.next=head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Linked list after removing loop");
		list.PrintList(head);
		
		

	}

}
