package ua.lviv.lgs;

public class Rectangle {
	
	int length;
	int width;
	
	
	public Rectangle() {
		length = 2;
		width = 4;
		
	}


	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public String countPerimeter() {
		int perimeter = 2 *(length + width);
		return "Rectangle perimeter = " + perimeter;
		
	}
	
	public String countSquare() {
		int sqr = length * width;
		return "Rectangle square = " + sqr;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	

}
