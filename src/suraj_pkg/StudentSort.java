package suraj_pkg;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSort {

	public static void main(String args[])
	{
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(1,"Suraj",73));
		al.add(new Student1(2,"vijay",33));
		al.add(new Student1(3,"jaya",24));
		Collections.sort(al,new NameComparator());
		for(Student1 st: al) 
		{
			System.out.println(st.age+":"+st.name+":"+st.rollno);
		}
		System.out.println("---------------------------");
		Collections.sort(al,new AgeComparator());
		for(Student1 st: al) 
		{
			System.out.println(st.age+":"+st.name+":"+st.rollno);
		}
	}
}
