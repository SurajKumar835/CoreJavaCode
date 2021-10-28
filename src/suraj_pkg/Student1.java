package suraj_pkg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Student1 {

	public static void main(String[] args) throws Exception {
		Student s=new Student(1,"suraj",23);
		FileOutputStream f=new FileOutputStream("Student.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(s);
		o.flush();
		o.close();
		f.close();
		System.out.println("success");
	}
	
}
