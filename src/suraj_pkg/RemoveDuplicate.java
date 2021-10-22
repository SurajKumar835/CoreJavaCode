package suraj_pkg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;
public class RemoveDuplicate {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] str=s.split(",");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.parseInt(str[i].trim());
		}
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
			for(int j=0;j<arr.length;j++)
			{	
				set.add(arr[j]);
			}
			System.out.println(set);
			System.out.println("-----------------");
		//HashMap
			 HashMap<Integer, Boolean> mp = new HashMap<>();
			  for(int i=0;i<arr.length;i++)
			  {
				  if(mp.get(arr[i])==null)
				  {
					  mp.put(arr[i],true);
				  }
			  }
			  System.out.println(mp.keySet());
	}

}
