package suraj_pkg;

public class FibboArrayWay {

	public static void main(String args[])
	{
		int n=8;
		int[] f=new int[n+1];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;i++)
		{
			f[i]=f[i-1]+f[i-2];
		}
		System.out.println(f[n]);
	}
}
