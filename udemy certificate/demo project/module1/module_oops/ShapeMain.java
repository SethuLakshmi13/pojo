package module1.module_oops;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {

		String shapeName;
		Scanner scan = new Scanner(System.in);
		int side, radius, length, breadth;
		double area;
		System.out.println("choose the shape name 1.Rectangle 2.Square 3.Circle");
		int c = scan.nextInt();

		switch (c) {
		case 1:
			System.out.println("enter the length");
			length = scan.nextInt();
			System.out.println("enter the breadth");
			breadth = scan.nextInt();
			Rectangle rectangle = new Rectangle(length, breadth, "rectangle");
			rectangle.setLength(length);
			rectangle.setBreadth(breadth);
			area = rectangle.calculateArea();
			System.out.println("Area of the Rectangle is " + area);
			break;
		case 2:
			System.out.println("enter the side");
			side = scan.nextInt();
			Square square = new Square(side, "Square");
			square.setSide(side);
			area = square.calculateArea();
			System.out.println("Area of the Square is " + area);
			break;
		case 3:
			System.out.println("enter the radius");
			radius = scan.nextInt();
			Circle circle = new Circle(radius, "Circle");
			circle.setRadius(radius);
			area = circle.calculateArea();
			System.out.println("Area of the Square is " + area);
			break;

		}

	}

}
