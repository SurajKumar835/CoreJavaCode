package suraj_pkg;

public class FibboSeries {
	static int fibo(int n)
	{
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String args[])
	{
		//1,1,2,3,5,8,13.....soon
		int n=3;
		System.out.println(fibo(n));
	}
	
}
