import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int len=s.length()/2;
        //System.out.println(len);
        String t1=s.substring(0,len);
        String t2=s.substring(len,s.length());
        String[] st1=t1.split("");
        String[] st2=t2.split("");
        int sum1=0;int sum2=0;
        for(int i=0;i<st1.length;i++)
        {
            sum1+=Integer.parseInt(st1[i]);
        }
        for(int j=0;j<st2.length;j++)
        {
            sum2+=Integer.parseInt(st2[j]);
        }
        int sum=0;//55
        int n=sum1+sum2;
        while(n>0||sum>9)
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
