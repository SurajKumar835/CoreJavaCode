package suraj_pkg.dynamicProgramming;

public class MaxSoFar {

	public static void main(String[] args) {
		int[] arr= {1,-1,3,4,-3,5,-1};
				//{-2,-2,3,-1,2,-1};
				//{1,-1,3,4,-3,5,-1};
		int max=0;int maxf=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max+=arr[i];//0,
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
