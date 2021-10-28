package suraj_pkg;

import java.util.HashMap;

public class String3 {
	public static void main(String args[])
	{
		int[] a = {1,2,3,1,2,3,1,2,3,4,4,5,7,78,9};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			int b=a[i];
			//Java 8 compute concept
			hm.compute(b, (key, value) -> (value == null) ? 1 : value + 1);
		}
		System.out.println(hm);
		for(Integer key:hm.keySet())
		{
			int value=hm.get(key);
			if(value>1)
			{
				System.out.println(key);
			}
		}
	}
}
