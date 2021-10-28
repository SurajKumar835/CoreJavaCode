package suraj_pkg;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Student2 {

	public static void main(String[] args) throws Exception {
		ObjectInputStream o=new ObjectInputStream(new FileInputStream("Student.txt"));
		Student s=(Student) o.readObject();
		System.out.println(s.rollno+":"+s.name+":"+s.age);
		o.close();
	}

}
