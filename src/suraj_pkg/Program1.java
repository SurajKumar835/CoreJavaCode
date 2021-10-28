package suraj_pkg;

public class Program1 {

	public static void main(String[] args) {
		 int a=2;
		 int b=3;
		 int c=6;
		 System.out.println(add(a,b));
		 System.out.println(add(a,b,c));

	}

	private static int add(int a, int b, int c) {
		return (a+b+c);
		
	}

	private static int add(int a, int b) {
		return (a+b);
		
	}

}
