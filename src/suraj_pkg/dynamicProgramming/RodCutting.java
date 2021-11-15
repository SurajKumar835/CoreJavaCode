package suraj_pkg.dynamicProgramming;

public class RodCutting {

	public static void main(String[] args) {
		int[] a= {3,7,3,1,9}; 
			//{-1,4,-1,2};
				//{1, 5, 8, 9, 10, 17, 17, 20};
		int len=a.length;
		System.out.println("Maximum Sum "+maxSum(a,len));
	}

	private static int maxSum(int[] a, int len) {
		int[] subSol=new int[len+1];
		for(int i=1;i<=len;i++)
		{
			int max=0;
			for(int j=0;j<i;j++)
			{
				max=Math.max(max,a[j]+subSol[i-j-1]);
			}
			subSol[i]=max;
		}
		/*for(Integer i:subSol)
		{
			System.out.println(i);
		}*/
		return subSol[len];
	}

}
