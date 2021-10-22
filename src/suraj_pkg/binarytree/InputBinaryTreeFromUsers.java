package suraj_pkg.binarytree;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InputBinaryTreeFromUsers {
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
		System.out.println(totalNodes(root));
}

	private static int totalNodes(Node1 root) {
		if(root ==null)
			return 0;
		int lh=left_height(root);
		int rh=right_height(root);
		if(lh==rh)
		{
			return (int)(Math.pow(2,lh)-1);
		}
		return 1+totalNodes(root.left)+totalNodes(root.right);
	}

	private static int right_height(Node1 root) {
		int ht=0;
			while(root!=null)
			{
				ht++;
				root=root.right;
			}
		return ht;
	}

	private static int left_height(Node1 root) {
		int ht=0;
		while(root!=null)
		{
			ht++;
			root=root.left;
		}
		return ht;
	}
}