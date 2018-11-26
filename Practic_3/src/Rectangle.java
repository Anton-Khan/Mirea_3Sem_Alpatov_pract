
class Rectangle extends Shape {

	protected double Width;
	protected double Lenght;
	
	public Rectangle() {};
	
	public Rectangle(double w, double l) {
		Width = w;
		Lenght = l;
	}
	
	public Rectangle(double w, double l, String color, boolean fill) {
		Width = w;
		Lenght = l;
		Color = color;
		filled = fill;
	}
	
	@Override
	public double getArea() {
		return Width * Lenght;
	}

	@Override
	public double getParimeter() {
		return 2*Width + 2*Lenght;
	}

	@Override
	public String toString() {
		String temp;
		if(isFilled()) {
			temp =" filled ";
		}
		else temp = " not filled ";
		
		return ("This is "+Color+temp+"Rectangle\n");
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getLenght() {
		return Lenght;
	}

	public void setLenght(double lenght) {
		Lenght = lenght;
	}

	
}
