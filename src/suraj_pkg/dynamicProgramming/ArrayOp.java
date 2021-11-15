package suraj_pkg.dynamicProgramming;

public class ArrayOp {

	public static void main(String[] args) {
		int[] arr= {-1,4,-1,2};
		int max=0;int maxf=arr[0];
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
			max+=arr[i];
			if(max<0)
			{
				max=0;
			}
			if(maxf<max)
			{
				maxf=max;
			}
		}
		System.out.println(maxf);
	}

}
