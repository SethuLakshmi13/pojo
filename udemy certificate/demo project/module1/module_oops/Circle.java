package module1.module_oops;

public class Circle extends Shape {

	private double area;
	private int radius;

	public Circle(int radius, String shapeName) {
		super(shapeName);
		this.radius = radius;

	}

	public void setRadius(int radius) {
		// setShapeName(shapeName);
		this.radius = radius;
	}

	public double calculateArea() {
		area = 2 * 3.14 * radius;
		return area;
	}
}
