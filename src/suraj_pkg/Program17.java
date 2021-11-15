package suraj_pkg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Program17
{
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        int t=Integer.parseInt(br.readLine());
        while(t-- !=0)
        {
        	String s=br.readLine();
        	String[] inA=s.split(" ");
        	String res="";
        	if(inA[0].length()==inA[1].length())
        	{
        		for(int i=0;i<inA[0].length();i++)
        		{
        			res+=Integer.toString(Integer.parseInt(Character.toString(inA[0].charAt(i)))
        					+Integer.parseInt(Character.toString(inA[1].charAt(i))));
        		}
        		System.out.println(res);
        	}
        	else
        	{
        		String end="";String temp="";
        		if(inA[0].length()>inA[1].length())
        		{
        			
        			end=inA[0];
        			temp=inA[1];
        		}else
        		{
        			end=inA[1];
        			temp=inA[0];
        		}
        		
        		String res1=end.substring(0,temp.length());
        		String rl=end.substring(temp.length(), end.length());
        		//System.out.println(res1 +":"+rl);
        		for(int j=0;j<res1.length();j++)
        		{
        			res+=Integer.toString(Integer.parseInt(Character.toString(res1.charAt(j)))
        					+Integer.parseInt(Character.toString(temp.charAt(j))));
        		}
        		System.out.println(res+rl);
        	}
        		
        }
}
}




