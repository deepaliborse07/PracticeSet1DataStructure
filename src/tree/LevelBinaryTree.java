package tree;

class Node1 {
	int data;
	Node1 left, right;

	public Node1(int item) {

		this.data = item;
		this.left = right = null;

	}

}

public class LevelBinaryTree {

	Node1 root;

	public LevelBinaryTree() {
		super();
		this.root = null;
	}

	private void printLevelOrder() {
		// TODO Auto-generated method stub
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);

	}

	private void printGivenLevel(Node1 root, int level) {
		// TODO Auto-generated method stub
		if (root == null)
			return;
		if (level == 1)
			System.out.println(root.data + "");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);

		}

	}

	private int height(Node1 root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelBinaryTree tree = new LevelBinaryTree();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);

		System.out.println("level order traversal of binary tree");
		tree.printLevelOrder();

	}

}
