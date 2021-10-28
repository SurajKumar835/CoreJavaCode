package suraj_pkg;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1234567L;
		public int rollno;
		public String name;
		transient int age;
		public Student(int rollno, String name, int age) {
			this.rollno = rollno;
			this.name = name;
			this.age = age;
		}
		
}
