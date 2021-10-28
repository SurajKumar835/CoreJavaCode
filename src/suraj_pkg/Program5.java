package suraj_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(3);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(1);
		l2.add(5);
		List<List<Integer>> l3=new ArrayList<List<Integer>>();
		l3.add(l1);
		l3.add(l2);
		System.out.println(l3);
		//Now Merge using traditional way
		for(List<Integer> t:l3)
		{
			for(Integer l:t)
			{
				System.out.print(l);
			}
		}
		//Now FlatMap Java 8
		List<Integer> l4=l3.stream().flatMap(n->n.stream()).filter(n->n>2).collect(Collectors.toList());
		System.out.println(l4);
	}

}
