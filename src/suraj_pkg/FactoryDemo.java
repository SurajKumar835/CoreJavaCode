package suraj_pkg;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory s=new ShapeFactory();
		Shape shap1=s.getShape("circle");
		shap1.draw();
	}

}
