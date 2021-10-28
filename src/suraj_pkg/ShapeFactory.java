package suraj_pkg;

public class ShapeFactory {
	public Shape getShape(String shapeType)
	{
		if(shapeType.equalsIgnoreCase("Circle"))
		{
			Circle c=new Circle();
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Rectangle"))
		{
			Rectangle r=new Rectangle();
			return r;
		}else {
			return null;
		}
		
	}
}
