import java.util.*;
import java.util.Base64;
public class TestClass {
    public static void main(String args[] ) throws Exception {
            // Write your code here
            Scanner in =new Scanner(System.in);
            int sys=0;
            HashMap<String,String> hm=new HashMap<>();
            while(in.hasNext())
            {
                String s=in.nextLine();
                
                Base64.Encoder encoder=Base64.getEncoder();
                Base64.Decoder decoder=Base64.getDecoder();
                if(s.length()>=10 && s.length()<=12)
                {
                    int UA=2;
                    int LA=2;
                    int d=1;int flag=0;int c4=0;
                    int sc=1;int c1=0;int c2=0;int c3=0;
                    for(int i=0;i<s.length();i++)
                    {
                        char ch=s.charAt(i);
                        if(Character.isUpperCase(ch))
                        {
                                c1++;
                        }else
                        {
                                c2++;
                        }
                        if(ch=='#' || ch=='$'|| ch=='@'||ch=='!'|| ch=='%'||ch=='&' ||ch=='*')
                        {
                            c3++;
                            flag=0;
                        }else{
                            flag=1;
                        }
                        if(Character.isDigit(ch))
                        {
                            c4++;
                        }
                    }
                    if(c1>=UA && c2>=LA && c3>=sc && c4>=d)
                    {
                        String endResult=encoder.encodeToString(s.getBytes());                                        System.out.println("Encoded password for system-"+(char)(97+sys)+":"+endResult); 
                        hm.put(("system-"+(char)(97+sys)), endResult);          
                        sys++;
                       
                    
                    }else{
                        System.out.println("Password Policy not Followed");
                    }
                }else if(s.length()==8 ){
                    System.out.print("Reading Security Password for "+s+".....");
                     //System.out.println(hm);
                    String estr="";
                   
                            estr=hm.get(s);
                     
                    String dcr=new String(decoder.decode(estr));
                    System.out.print(dcr);
                }
                else{
                    System.out.println("Password Policy not Followed");
                }
            }

    }
}
