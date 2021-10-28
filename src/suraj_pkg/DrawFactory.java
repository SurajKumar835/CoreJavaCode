package suraj_pkg;

public class DrawFactory {
	public static Draw getDrawing(String ShapeType)
	{
		
		if(ShapeType==null)
		{
			return null;
		}
		 if(ShapeType.equalsIgnoreCase("Triangle"))
		{
			return new Triangle();
		}else if(ShapeType.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		
			return null;
		
		
	}
}
