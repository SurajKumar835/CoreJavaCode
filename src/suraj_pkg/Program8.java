package suraj_pkg;

import java.util.HashMap;

public class Program8 {

	public static void main(String[] args) {
		String in="Iammmmgoingtojunpmpodsdsdsdsd";
		String input=in.toLowerCase();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++)
		{
			if(hm.containsKey(input.charAt(i)))
			{
				hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
			}else {
				hm.put(input.charAt(i), 1);
			}
		}
		System.out.println(hm);
		for(Character key:hm.keySet())
		{
			int value=hm.get(key);
			if(value>1)
			{
				System.out.print(key);
				System.out.print(' ');
			}
		}
	}

}
