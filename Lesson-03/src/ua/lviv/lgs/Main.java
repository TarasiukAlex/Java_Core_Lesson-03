package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 6);
		
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(45);
		Circle c3 = new Circle(0.587);
				
				
		System.out.println(rect1.countPerimeter());
		System.out.println(rect1.countSquare());
		System.out.println(rect2.countPerimeter());
		System.out.println();
		System.out.println(c1.countCircleSquare(4));
		System.out.println(c2.countCircleLength(5));
		System.out.println(c3.countCircleLength(2));
		System.out.println(c3);
		c2.countCircleSquare(7);
					
		
		
	}

	
}
