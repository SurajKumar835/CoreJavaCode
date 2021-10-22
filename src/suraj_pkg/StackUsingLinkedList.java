package suraj_pkg;

public class StackUsingLinkedList {
	static class Snode{
		public int data;
		public Snode next;
	}
	Snode top;
	public StackUsingLinkedList()
	{
		this.top=null;
	}
	public static void main(String args[])
	{
		  StackUsingLinkedList obj = new StackUsingLinkedList();
	        // insert Stack value
	        obj.push(11);
	        obj.push(22);
	        obj.push(33);
	        obj.push(44);
	 
	        // print Stack elements
	        obj.display();
	 
	        // print Top element of Stack
	        System.out.printf("\nTop element is %d\n", obj.peek());
	 
	        // Delete top element of Stack
	        obj.pop();
	        obj.pop();
	 
	        // print Stack elements
	        obj.display();
	 
	        // print Top element of Stack
	        System.out.printf("\nTop element is %d\n", obj.peek());
	}
	 public void display()
	    {
	        // check for stack underflow
	        if (top == null) {
	            System.out.printf("\nStack Underflow");
	            System.exit(1);
	        }
	        else {
	            Snode temp = top;
	            while (temp != null) {
	 
	                // print node data
	                System.out.printf("%d->", temp.data);
	 
	                // assign temp link to temp
	                temp = temp.next;
	            }
	        }
	    }
	public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
 
        // update the top pointer to point to the next node
        top = (top).next;
    }
	public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
	 public boolean isEmpty()
    {
        return top == null;
    }
	private void push(int data) {
		Snode n=new Snode();
		if(n==null)
		{
			 System.out.print("\nHeap Overflow");
	            return;
		}
		n.data=data;
		n.next=top;
		top=n;
	}
}
