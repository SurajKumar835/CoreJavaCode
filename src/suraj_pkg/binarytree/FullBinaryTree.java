package suraj_pkg.binarytree;

public class FullBinaryTree {
	
	static class Node{
		int data;
		Node left;Node right;
	}
	static Node newNode(int data)
	{
		Node node=new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		return node;
		
	}
	static int getfullCount(Node root)
	{
	    if (root == null)
	    return 0;
	 
	    int res = 0;
	    if (root.left != null && root.right != null)
	     res++;
	 
	    res += (getfullCount(root.left) + getfullCount(root.right));
	    return res;
	}
	/*---------------------------------------/
	 * 
	 */
	public static void main(String[] args) {
		
		 Node root = newNode(2);
		    root.left = newNode(7);
		    root.right = newNode(5);
		    root.left.right = newNode(6);
		    root.left.right.left = newNode(1);
		    root.left.right.right = newNode(11);
		    root.right.right = newNode(9);
		    root.right.right.left = newNode(4);
		    System.out.println(getfullCount(root));
	}

}
