package suraj_pkg;

public class String1 {
	public static void main(String args[])
	{
		String s="iam surprised to see you back!";
		String[] str=s.split(" ");
				String t="";
				for(int i=0;i<s.length();i++)
				{
					t=s.charAt(i)+t;
				}
				System.out.println(t);
				System.out.println("--------------------------");
				String te="";
				for(int j=0;j<str.length;j++)
				{
					te=str[j]+te;
				}
				System.out.println(te);
				System.out.println("-----------------------------");
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<str.length;i++)
				{
					sb.append(reverseStr(str[i]));
					sb.append(' ');
				}
				System.out.println(sb.toString());
	}

	private static String reverseStr(String a) {
		String t="";
		for(int i=0;i<a.length();i++)
		{
			t=a.charAt(i)+t;
		}
		return t;
	}
}
