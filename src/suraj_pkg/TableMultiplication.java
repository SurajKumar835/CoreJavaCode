package suraj_pkg;
import java.util.*;
public class TableMultiplication {

	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		int n=in.nextInt();
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.print("\n");
		}
	}
}
