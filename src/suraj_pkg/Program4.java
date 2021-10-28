package suraj_pkg;

import java.util.ArrayList;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(4);
		l.stream().map(n->n*2).forEach(System.out::print);
		System.out.println("*******************");
		l.parallelStream().map(n->n*2).forEach(System.out::print);
	}

}
