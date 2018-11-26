
public class TestShape {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5, "Red", true);
		
		System.out.println(c1.toString());
		System.out.println("Area is "+ c1.getArea() +"\nPerimeter is "+ c1.getParimeter());
		
		Rectangle r1 = new Rectangle(10, 20, "Yellow", false);
		
		System.out.println(r1.toString());
		System.out.println("Area is "+ r1.getArea() +"\nPerimeter is "+ r1.getParimeter());
		
		Square s1 = new Square(12, "Blue", true);
		
		System.out.println(s1.toString());
		System.out.println("Area is "+ s1.getArea() +"\nPerimeter is "+ s1.getParimeter());
	}
}
