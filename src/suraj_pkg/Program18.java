package suraj_pkg;

import java.io.*;
import java.math.*;
public class Program18{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T-- !=0)
        {
            String s=br.readLine();
            String[] str=s.split(" ");
            int b=Integer.parseInt(str[1]);
            int a=Integer.parseInt(Character.toString(str[0].charAt(str[0].length()-1)));
            if(b%4==0)
            {
                
                System.out.println((int)(Math.pow(a,4))%10);
            }else
            {
                System.out.println((int)(Math.pow(a,b%4))%10);
            }
        }
    }
}
