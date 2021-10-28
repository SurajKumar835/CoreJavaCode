package suraj_pkg;

import java.util.HashMap;

public class Program7 {

	public static void main(String[] args) {
		String input="Iammmmgoingtojunpmpodsdsdsdsd";
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			hm.compute(ch,(key,value)->(value==null)?1:value+1);
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
