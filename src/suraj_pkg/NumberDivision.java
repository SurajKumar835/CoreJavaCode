Divide a number into two parts such that sum of digits is maximum
public class Test
{
    public static void main(String args[])
    {
        int n=70;
        if(n<9)
        {
            System.out.println(n);
        }
        else{
            String a=Integer.toString(n);
            int c=a.length();int num=0;
            for(int i=0;i<c-1;i++)
            {
                num=num*10+9;
            }
            int p1=num;
            int p2=n-p1;
            System.out.println(sumOfBoth(p1,p2));
        }
    }
    static int sumOfBoth(int a,int b)
    {
        int d=0;int sum=0;int d1,sum1=0;
        while(a>0)//351
        {
            d=a%10;
            sum=sum+d;
            a=a/10;
        }
        while(b>0)
        {
            d1=b%10;
            sum1=sum1+d1;
            b=b/10;
        }
        return sum+sum1;
    }
  
}
