package suraj_pkg;

import java.util.Optional;

public class Program2 {

	public static void main(String[] args) {
		String s=null;
		Optional<String> a=Optional.ofNullable(s);
		if(a.isPresent())
		{
			System.out.println(a);
		}else {
			System.out.println("String s is nullable");
		}
	}

}
