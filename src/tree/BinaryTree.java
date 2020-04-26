package tree;

class Node{
	int key;
	Node left,right;
	
	public Node(int item) {
		key=item;
		left=right=null;
	}
}

public class BinaryTree {

	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	/*postorder*/
	private void printPostorder(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return;
		
		//left 
		printPostorder(node.left);
		
		printPostorder(node.right);
		
		System.out.println(node.key +"");
	}
	
	
/*Inorder*/
private void printInorder(Node node) {
		// TODO Auto-generated method stub
	if(node==null)
		return;
	printInorder(node.left);
	
	System.out.println(node.key +"");
	
	printInorder(node.right);
	
	}

private void printPreorder(Node node) {
	// TODO Auto-generated method stub
	if(node==null)
		return;
	
	System.out.println(node.key+"");
	
	printPreorder(node.left);
	
	printPreorder(node.right);
	
}
	
	
	void printPostorder() {
		printPostorder(root);

	}

	void printInorder() {
		printInorder(root);
	}


	void printPreorder() {
		printPreorder(root);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		System.out.println("\nPostorder traversal of Binary Tree");
		tree.printPostorder();
		
		System.out.println("\nInorder traversal of Binary Tree");
		tree.printInorder();
		
		System.out.println("\nPreorder traversal of Binary Tree");
		tree.printPreorder();
	}

}
