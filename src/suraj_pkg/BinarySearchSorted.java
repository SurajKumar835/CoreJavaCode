package suraj_pkg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class BinarySearchSorted {
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String k=br.readLine();
		int key=Integer.parseInt(k);
		String[] str=s.split(",");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.parseInt(str[i].trim());
		}
		Arrays.sort(arr);
		int start=0;
		int last=arr.length-1;
		int mid=(start+last)/2;
		while(start<=last)
		{
			if(arr[mid]<key)
			{
				start=mid+1;
			}else if(arr[mid]==key)
			{
				System.out.println("element found at:" +mid);
				break;
			}else {
				last=mid-1;
				
			}
			mid=(start+last)/2;
		}
		if(start>last)System.out.println("Element not found");
	}
}
