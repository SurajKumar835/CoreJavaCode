package suraj_pkg;

import java.util.ArrayList;
import java.util.Collections;


public class Program11 {

	public static void main(String[] args) {
		ArrayList<Mark> al=new ArrayList<Mark>();
		al.add(new Mark("suraj", 22));
		al.add(new Mark("ajay", 12));
		Collections.sort(al);
		al.forEach(n->System.out.println(n.getName()+":"+n.getAge()));
	}

}
