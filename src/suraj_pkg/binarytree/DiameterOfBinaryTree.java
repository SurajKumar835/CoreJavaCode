package suraj_pkg.binarytree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DiameterOfBinaryTree {
	public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fl=br.readLine();
		String[] fla=fl.split(" ");
		int nodeNum=Integer.parseInt(fla[0]);
		int rootData=Integer.parseInt(fla[1]);
		Node1 root=new Node1();
		root.data=rootData;
		for(int i=0;i<nodeNum-1;i++)
		{	//imp line
			Node1 current=root;
			String ch=br.readLine();
			for(int j=0;j<ch.length();j++)
			{//L,LR,LL,R
				if(ch.charAt(j)=='L')
				{
					if(current.left==null)
					{
						Node1 temp=new Node1();
						current.left=temp;
					}
					current=current.left;					
				}
			else if(ch.charAt(j)=='R')
			{
				if(current.right==null)
				{
					Node1 temp=new Node1();
					current.right=temp;
				}
				current=current.right;					
			}
				
		}
			ch=br.readLine();
			current.data=Integer.parseInt(ch);
	}
		System.out.println(Diameter(root));
}

	private static int Diameter(Node1 root) {
		if(root == null) {
    		return 0;
    	}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int leftDiameter = Diameter(root.left);
    	int rightDiameter = Diameter(root.right);
    	
    	return Math.max((leftHeight + rightHeight + 1), Math.max(leftDiameter, rightDiameter));
	}

	private static int height(Node1 root) {
		if(root == null) {
    		return 0;
    	}
    	
    	return (1 + Math.max(height(root.left), height(root.right)));
		
	}

	
}