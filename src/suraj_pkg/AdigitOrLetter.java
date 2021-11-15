import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
     Scanner in=new Scanner(System.in);
        String s=in.nextLine();
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
                }
            }
        }
        System.out.println(cd);
        System.out.println(ca);
    }
}
