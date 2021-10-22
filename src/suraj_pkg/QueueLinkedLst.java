package suraj_pkg;

public class QueueLinkedLst {
	
	static class Node{
		public int key;
		public Node next;
		public Node(int key) {
			this.key = key;
			this.next=null;
		}	
	}
	Node front;	Node rear;
	public QueueLinkedLst()
	{
		this.front=null;
		this.rear=null;
	}
	public static void main(String args[])
	{
		QueueLinkedLst q = new QueueLinkedLst();
	        q.enqueue(10);
	        q.enqueue(20);
	        q.dequeue();
	        q.dequeue();
	        q.enqueue(30);
	        q.enqueue(40);
	        q.enqueue(50);
	        q.dequeue();
	        System.out.println("Queue Front : " + q.front.key);
	        System.out.println("Queue Rear : " + q.rear.key);
	}
	private void dequeue() {
		 // If queue is empty, return NULL.
        if (this.front == null)
            return;
 
        // Store previous front and move front one node ahead
        Node temp = this.front;
        this.front = this.front.next;
 
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }
		
	
	private void enqueue(int key) {
		// // Create a new LL node
        Node temp = new Node(key);
 
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
 
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
		
	}


}
