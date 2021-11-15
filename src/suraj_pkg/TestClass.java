package suraj_pkg;

import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        int en=N/2;int a=0;String f="";String l="";
        while(in.hasNext())
        {
            String s=in.next();
            if(a!=en)
            {
            	f+=s.charAt(0);
            	a++;
            }
            else {
            	l+=s.charAt(s.length()-1);
            }
            
            
        }
        if(Integer.parseInt(f+l)%11==0)
        	System.out.println("OUI");
        else
        	System.out.println("NON");
}
}