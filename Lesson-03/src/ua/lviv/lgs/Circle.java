package ua.lviv.lgs;

public class Circle {

	public double radius;
	public double diameter;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	

	public String countCircleSquare(double diameter) {

		double sqr = (Math.PI * Math.pow(diameter, 2)) / 4;

		return "Circle square =  " + sqr;

	}

	public String countCircleLength(double radius) {

		double length = 2 * Math.PI * radius;
		return "Circle length = " + length;

	}

	public double getRadius() {
		return radius;
	}

	public double getDiameter() {
		return diameter;
	}

	@Override
	public String toString() {
		return "Circle [radius = " + radius + ", diameter = " + radius * 2 + "]";
	}

}
