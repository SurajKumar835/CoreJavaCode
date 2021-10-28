package suraj_pkg;

import java.util.ArrayList;
import java.util.Collections;

public class Program12 {

	public static void main(String[] args) {
		ArrayList <Program10> al=new ArrayList<Program10>();
		al.add(new Program10("suraj",23,10));
		al.add(new Program10("ajay", 10, 11));
		al.add(new Program10("vijay",3,24));
		//foreach with lambda expression
		Collections.sort(al, new NameProgram10());
		al.forEach(n->System.out.println(n.name+":"+n.age+":"+n.rollno));
		System.out.println("*******************************");
		Collections.sort(al, new AgeProgram10());
		al.forEach(n->System.out.println(n.age+":"+n.name+":"+n.rollno));
		System.out.println("************************************");
		Collections.sort(al, new RollnoProgram10());
		al.forEach(n->System.out.println(n.rollno+":"+n.name+":"+n.age));
	}

}
