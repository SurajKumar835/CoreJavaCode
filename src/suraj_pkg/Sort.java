package suraj_pkg;
import java.util.*;
public class Sort {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		String[] str=s.split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];//2
					arr[j]=arr[i];//3
					arr[i]=temp;//2
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
