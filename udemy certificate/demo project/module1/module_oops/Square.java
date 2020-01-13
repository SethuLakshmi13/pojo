package module1.module_oops;

public class Square extends Shape {

	private double area;
	private int side;

	public Square(int side, String shapeName) {
		super(shapeName);
		this.side = side;

	}

	public void setSide(int side) {
		// setShapeName(shapeName);
		this.side = side;
	}

	public double calculateArea() {
		area = side * side;
		return area;
	}
}