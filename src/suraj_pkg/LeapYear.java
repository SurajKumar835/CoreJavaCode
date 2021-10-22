package suraj_pkg;
import java.util.*;
public class LeapYear {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int year =in.nextInt();
		if(year%4 == 0)
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("Not leap year");
		}
	}
}
