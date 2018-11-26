
class Circle extends Shape{

	private double Radius;

	public Circle(){};
	
	
	
	public Circle(double radius) {
		Radius = radius;
	}
	
	public Circle(double radius, String color, boolean fill) {
		Radius = radius;
		Color = color;
		filled = fill;
	}
	
	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}


	@Override
	public double getArea() {
		return Math.PI*Radius*Radius;
	}

	@Override
	public double getParimeter() {
		return 2*Math.PI*Radius;
	}

	@Override
	public String toString() {
		String temp;
		if(isFilled()) {
			temp =" filled ";
		}
		else temp = " not filled ";
		
		return ("This is "+Color+temp+"Circle\n");
	}
	
	
	
}
