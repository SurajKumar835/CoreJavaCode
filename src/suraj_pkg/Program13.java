package suraj_pkg;

import java.io.*;
import java.util.*;


public class Program13 {
    public static void main(String[] args) throws IOException {
     Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        System.out.println(s);
        int cd=0;int ca=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                ++cd;
            }else 
            {
            	if(Character.isLetter(s.charAt(i)))
            	{
            		++ca;
            		//System.out.println(s.charAt(i));
            }}
            
        }
        System.out.println(cd);
        System.out.println(ca);
    }
}