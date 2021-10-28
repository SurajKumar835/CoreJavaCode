package suraj_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program6 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(34);
		l.add(35);
		l.add(56);
		l.add(99);
		l.add(101);
		List<Integer> filterResult=l.stream().filter(n->n<50).collect(Collectors.toList());
		System.out.println(filterResult);
	}

}
