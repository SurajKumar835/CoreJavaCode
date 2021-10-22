package suraj_pkg;

public class OutOfMemory {

	public static void main(String[] args) {
		try {
			int[] arr=new int[1000*1000*1000];
		}catch(java.lang.OutOfMemoryError e)
		{
			System.out.println(Runtime.getRuntime().maxMemory());
		}

	}

}
