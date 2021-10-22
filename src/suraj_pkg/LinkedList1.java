package suraj_pkg;

public class LinkedList1 {

	static class Node{
		public int data;
		public Node nextNode;
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(2);
		head.nextNode=new Node(3);
		head.nextNode.nextNode=new Node(4);
		head.nextNode.nextNode.nextNode=new Node(5);
		//printList(node);
		int pos=2;int data=41;
		
	       printList(insertAtPos(head, pos, data));
	}

	private static Node insertAtPos(Node headNode, int pos, int data) {
		Node head=headNode;
		if(pos<0)
		{
			System.out.println("invalid position entered");
		}
		if(pos==1) {
			Node newNode = new Node(data);
            newNode.nextNode = headNode;
            head = newNode;
		}else {
		while(pos-- !=0)
		{
			if(pos==1)
			{
				Node newNode=new Node(data);
				newNode.nextNode=headNode.nextNode;
				headNode.nextNode=newNode;break;
			}
			headNode=headNode.nextNode;
		}
		if(pos!=1) {System.out.println("pos out of range");}
		}
		return head;
	}

	private static void printList(Node node) {
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.nextNode;
		}
		
	}

}
