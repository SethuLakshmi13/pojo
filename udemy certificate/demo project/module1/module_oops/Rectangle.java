package module1.module_oops;

public class Rectangle extends Shape {
	private  double area;
	private  int length, breadth;
	public Rectangle(int length,int breadth,String shapeName) {
		super(shapeName);
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double calculateArea() {
		area = length * breadth;
		return area;
	}

}
