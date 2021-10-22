package suraj_pkg;

public class StringEqual {
	public static void main(String args[])
	{
		String s1=new String("hello");
		String s2=new String("hello");
		if(s1==s2)
		{
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
}
