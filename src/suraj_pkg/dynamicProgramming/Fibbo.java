package suraj_pkg.dynamicProgramming;

public class Fibbo {

	public static void main(String[] args) {
		int n=3;
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
