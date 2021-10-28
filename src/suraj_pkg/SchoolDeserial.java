package suraj_pkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SchoolDeserial {

	public static void main(String[] args) throws Exception {
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("School.txt"));
		School s=(School) oi.readObject();
		System.out.println(s.name+"**"+s.SchoolNo+"**"+s.roadNo);
		oi.close();

	}

}
