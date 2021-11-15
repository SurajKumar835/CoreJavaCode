package suraj_pkg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Program14 {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        String s=br.readLine();
        String[] str=s.split(" ");
        String s1=str[0];
        int k=Integer.parseInt(str[1]);
        if(k!=0)
        {
        	String r="";
        	for(int i=0;i<s1.length();i++)
        	{
        		if(Integer.parseInt(Character.toString(s1.charAt(i)))<9)
        		{
        			//System.out.println(s1.charAt(i));
        			r+="9";
        			--k;
        			if(k==0)break;
        		}else
        		{
        			r+="9";
        		}
        	}
        	int l1=r.length();
        	String s2=s1.substring(l1, s1.length());
        	System.out.println(r+s2);
        }
        else
        {
        	System.out.println(s1);
        }
}
}

