package suraj_pkg.dynamicProgramming;

public class EqualArray {
	public static void main(String args[])
	{
		int[] arr={3, 6, 5, 6, 7,4,2,2,11,24};
		int len=arr.length;int sum=0;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
		}
		if(sum%2!=0)
		{
			System.out.println("cannot be divided for equal sum");
		}
		else {
			boolean[][] b=new boolean[len+1][sum/2+1];
			
			for(int i=0;i<=sum/2;i++)
			{
				b[0][i]=false;
			}
			for(int i=0;i<=len;i++)
			{
				b[i][0]=true;
			}
			for(int i=1;i<=len;i++)
			{
				for(int j=1;j<=sum/2;j++)
				{
					b[i][j]=b[i-1][j];
					if(j>=arr[i-1])
					{
						b[i][j] = b[i][j] ||
								b[i - 1][j - arr[i -1]];
					}
				}
			}
			System.out.println(b[len][sum/2]);
		}
	}
}
