package suraj_pkg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Program15 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        String s=br.readLine();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int j=0;j<10;j++)
        {
        	hm.put(j, 0);
        }
        for(int i=0;i<s.length();i++)
        {
        	int c=Integer.parseInt(Character.toString(s.charAt(i)));
        	if(hm.containsKey(c))
        	{
        		hm.put(c,hm.get(c)+1);
        	}else
        	{
        		hm.put(c,1);
        	}
        }
        for(Integer k:hm.keySet())
        {
        	System.out.println(k+" "+hm.get(k));
        }
}
}


