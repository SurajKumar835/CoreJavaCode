import java.util.*;


public class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(in.hasNext())
        {
            String s=in.next();
          
            int f=Integer.parseInt(Character.toString(s.charAt(0)));
            int l=Integer.parseInt(Character.toString(s.charAt(s.length()-1)));
            System.out.println(f+l);
        }
    }
}
