import java.util.*;
import java.math.*;
public class TestClass{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        while(T-- !=0)
        {
            int a=in.nextInt();
            long b=in.nextLong();
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
