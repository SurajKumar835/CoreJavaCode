package suraj_pkg;

public class OutOfMemoryError {
	public void arraySize(int size)
	{
		try {
			int[] arr=new int[size];
		}catch(java.lang.OutOfMemoryError err)
		{
			System.out.println("Size");
			System.out.println(Runtime.getRuntime().maxMemory());
		}
	}
	public static void main(String args[])
	{
		OutOfMemoryError obj=new OutOfMemoryError();
		obj.arraySize(1000*1000*1000);
	}
}
