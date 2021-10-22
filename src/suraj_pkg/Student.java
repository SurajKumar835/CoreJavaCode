package suraj_pkg;

public class Student implements Comparable<Student> {
	public int rollno;
	public String name;
	public int age;
	
	public Student() {
	
	}
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	//Comparable Interface usage
	@Override
	public int compareTo(Student st) {
		if(st.age==age)
			return 0;
		else if(age<st.age)
			return 1;
		else 
			return  -1;
	}

}
