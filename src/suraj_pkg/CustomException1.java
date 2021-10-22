package suraj_pkg;

public class CustomException1 {
	
	static void validateName(String str)throws InvalidNameException{
		if (!str.equalsIgnoreCase("suraj"))
		{
			throw new InvalidNameException("Name Not Matched with records");
		}else {
			System.out.println("Welcome to Suraj!!");
		}
	}
}
