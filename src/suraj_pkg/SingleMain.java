package suraj_pkg;

public class SingleMain {

	public static void main(String[] args) {
		Single s=Single.getSingle();
	
		System.out.println(s.hashCode());
		
		Single s1=Single.getSingle();
		
		System.out.println(s1.hashCode());

	}

}
