package suraj_pkg;

public class CustomException {
	public static void main(String args[])
	{
		CustomException1 obj=new CustomException1();
		 try  
	        {  
	            // calling the method   
			 	obj.validateName("luv");  
	        }  
	        catch (InvalidNameException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
	 
	}

