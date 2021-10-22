package suraj_pkg;

public class Interview {

	public static void main(String[] args) {
		String s="abc";
		String s1=new String("abc");
		System.out.println(s=="abc");
		System.out.println(s1==s);
		 try {
	            // The following line would throw ExceptionInInitializerError
	            SimpleCalculator calculator1 = new SimpleCalculator();
	        
	        } catch (Exception e) {
	            System.out.println(e);
	        }
		 catch (Throwable t) {
	            System.out.println(t);
		 }finally {
			 System.out.println("hello");
		 }
		 // The following line would cause NoClassDefFoundError
	        SimpleCalculator calculator2 = new SimpleCalculator();
	        
	    }
	

}
