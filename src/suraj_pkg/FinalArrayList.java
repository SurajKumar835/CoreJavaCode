package suraj_pkg;

import java.util.ArrayList;
import java.util.List;

public class FinalArrayList {

	public static void main(String[] args) {
		
		//making a list final cause reassign impossible 
				//final List<Integer> list = new ArrayList<Integer>();
				//list = new ArrayList<Integer>();
		final List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(0, 5);
		System.out.println(list);
		System.out.println(list.hashCode());
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		System.out.println(list1.hashCode());
		//Refereeing to new instance which is different object having hashcode 
		list1=new ArrayList<Integer>();
		System.out.println(list1.hashCode());
	}

}
