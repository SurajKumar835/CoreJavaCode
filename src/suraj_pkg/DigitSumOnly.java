import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        String s=br.readLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                    sum+=Integer.parseInt(Character.toString(s.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}
