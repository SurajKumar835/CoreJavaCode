package suraj_pkg;

public class StackOverFlowError {

	public static void print(int a)
	{
		int b=a;
		//Infinite Recursive error cause StackOverFlowError
		print(b);
	}
	public static void main(String[] args) {
		
			print(0);
	}

}
