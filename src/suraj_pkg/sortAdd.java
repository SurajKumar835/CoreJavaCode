import java.io.*;
import java.util.*;
public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
            String s=br.readLine();
            String[] in=s.split(" ");
            int k=Integer.parseInt(in[0]);
            int n=Integer.parseInt(in[1]);
            String inpA=br.readLine();
            String[] inA=inpA.split(" ");
           long[] a=new long[inA.length];
           for(int j=0;j<inA.length;j++)
           {
               a[j]=Integer.parseInt(inA[j]);
              // System.out.println(a[j]);
           }
           Arrays.sort(a);int c=0;long sum=0;
           for(int i=a.length-1;i>=0;i--)
           {
                        ++c;              
                        sum+=a[i];
                        if(c==k)break;
           }
           System.out.println(sum);
    }
}
