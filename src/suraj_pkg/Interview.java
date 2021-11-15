package suraj_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(7);
		l3.add(8);
		l3.add(9);
		List<List<Integer>> ll=new ArrayList<List<Integer>>();
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		
		List<Integer> a=ll.stream().flatMap(n->n.stream()).filter(n->(n%2==0)).collect(Collectors.toList());
		for(Integer t:a)
		{
			System.out.println(t);
		}
	}

}
