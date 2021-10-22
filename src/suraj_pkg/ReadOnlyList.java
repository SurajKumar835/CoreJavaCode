package suraj_pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyList {
	public static void main(String args[])
	{
		List<String> li=new ArrayList<String>();
		li.add("Apple");
		li.add(0, "Mango");
		li.add(1, "Neem");
		li.add("Orange");
		List<String> readList=Collections.unmodifiableList(li);
		try {
			readList.add("Grapes");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//readList.remove("Grapes");
		System.out.println(readList);
	}
}
