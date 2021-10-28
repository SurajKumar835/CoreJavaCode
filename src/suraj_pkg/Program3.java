package suraj_pkg;

import java.lang.annotation.Annotation;

public class Program3 implements Functionalnterface {

	public static void main(String[] args) {
		Program3 p=new Program3();
			p.hello();
	}

	@Override
	public void hello() {
		System.out.println("Hello again");
		
	}

	

}
