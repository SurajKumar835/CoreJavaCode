package suraj_pkg;

public class Single {
	public static Single s=null;
	public static Single getSingle()
	{
		if(s==null) 
		s= new Single();
		return (Single) s;
	}
}
