package suraj_pkg;

public class FinalizeExample {
	public static void main(String args[])
	{
		FinalizeExample obj=new FinalizeExample();
		
		System.out.println(obj.hashCode());
		obj=null;
		System.gc();
		System.out.println(obj.hashCode());
	}
	public void finalize()
	{
		System.out.println("Finalize run");
	}

}
