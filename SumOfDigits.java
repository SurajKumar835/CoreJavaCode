import java.util.*;


public class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(in.hasNext())
        {
            String s=in.next();
            int sum=0;
            for(int i=0;i<s.length();i++)
            {
                sum+=Integer.parseInt(Character.toString(s.charAt(i)));
           
            }
             System.out.println(sum);
        }
    }
}
