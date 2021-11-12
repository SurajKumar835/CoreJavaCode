
import java.util.*;


public class TestClass {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while(T-- !=0)
        {
            long n=in.nextLong();
            String c=String.valueOf(n);
            int len=c.length();
            int sum=0;
            while(n>0 || sum>9)
            {
                if(n==0)
                {
                    n=sum;
                    sum=0;
                }
                sum+=n%10;
               
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
