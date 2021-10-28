package suraj_pkg;

import java.util.Optional;

public class FactoryDrawPattern {

	public static void main(String[] args) {
		DrawFactory f1=new DrawFactory();
		Draw f=f1.getDrawing("triangle");
		f.draw("Hi I am");
		Draw f2=f1.getDrawing("square");
		f2.draw("Hi I am");
		
		Optional<Draw> opt=Optional.ofNullable(f1.getDrawing(null));
		if(opt.isPresent())
		{
			System.out.println("hello");
		}else
		{
			System.out.println("Check Input string");
		}

	}

}
