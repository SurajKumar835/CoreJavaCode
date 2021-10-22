package suraj_pkg.binarytree;

public class BinaryTreeMain {
	static class Node{
		public int data;
		public Node left;
		public Node right;
		//default constructor
		public Node() {}
		//Parameterized constructor
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static void main(String[] args) {
		
		 Node root = new Node(1);
		    root.left = new Node(2);
		    root.right = new Node(3);
		    root.left.left = new Node(4);
		    root.left.right = new Node(5);
		    root.right.left = new Node(9);
		    root.right.right = new Node(8);
		    root.left.left.left = new Node(6);
		    root.left.left.right = new Node(7);
		    System.out.println(totalNodes(root));
	}

	private static int totalNodes(Node root) {
		if(root==null)
			return 0;
		int lh=left_height(root);
		int rh=right_height(root);
		System.out.println(lh+":"+rh);
		if(lh==rh)
		{
			 return (int)Math.pow(2, lh)-1;
		}
		
		return 1+totalNodes(root.left)+totalNodes(root.right);
	}

	private static int right_height(Node root) {
		int ht=0;
		while(root!=null)
		{
			ht++;
			root=root.left;
		}
		return ht;
	}

	private static int left_height(Node root) {
		int ht=0;
		while(root!=null)
		{
			ht++;
			root=root.right;
		}
		return ht;
	}

	

}
