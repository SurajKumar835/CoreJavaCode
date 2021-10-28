package suraj_pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class String2 {
	public static void main(String args[])
	{
		int[] arr= {1,2,3,1,2,1,2,4,5,6,2,1,5,8,9,8,9,1};
		List<Integer> hm=new ArrayList<Integer>();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.contains(arr[i]))
			{
				hm.add(arr[i]);
			}
			
		}
		System.out.println(hm);
		System.out.println("-------------------------");
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{	
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
				for(Integer key:map.keySet())
				{
					int value=map.get(key);
					if(value>1)
					{
						System.out.print(key);System.out.print(' ');
					}
					
				}
	}
}
