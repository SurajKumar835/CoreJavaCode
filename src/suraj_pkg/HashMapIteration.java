package suraj_pkg;
import java.util.*;
import java.util.Map.Entry; 
public class HashMapIteration {

	public static void main(String args[])
	{
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"CSK");
		hm.put(2, "RCB");
		hm.put(3, "MI");
			//iteration Type 1
		for(Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//iteration Type 2
		for(Integer n:hm.keySet())
		{
			System.out.println(n);
		}
		for(String m:hm.values())
		{
			System.out.println(m);
		}
		// Iteration Type 3
		Iterator<Map.Entry<Integer, String>> itr=hm.entrySet().iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		//Iteration Type 4 for java 8
			hm.forEach((k,v) -> System.out.println(k+":"+v));
		//Iteration Type 5
			for(Integer n:hm.keySet())
			{
				System.out.println(hm.get(n));
			}
	}
}
