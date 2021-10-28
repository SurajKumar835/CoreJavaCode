package suraj_pkg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SchoolSerial {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		School s=new School("KvKendriya",20,21);
		ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("School.txt"));
		oo.writeObject(s);
		oo.flush();
		oo.close();
		System.out.println("Success written in File");
	}

}
