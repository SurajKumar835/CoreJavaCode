package suraj_pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("suraj");
		l.add("tom");
		l.add("baby");
		l.add("monkey");
		Collections.sort(l, (p1,p2)->{
		        return p1.compareTo(p2);  
		});
		for(String t:l)
		{
			System.out.println(t);
		}
	}

}
