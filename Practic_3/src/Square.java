
public class Square extends Rectangle {

	
	public Square() {};
	
	public Square(double side) {
		Lenght = side;
		Width = side;
	}
	
	public Square(double side, String color, boolean fill) {
		Lenght = side;
		Color = color;
		filled = fill;
	}
	
	public double getSide() {
		return Lenght;
	}

	public void setSide(double side) {
		Lenght = side;
		Width = side;
	}
	
	public String toString() {
		String temp;
		if(isFilled()) {
			temp =" filled ";
		}
		else temp = " not filled ";
		
		return ("This is "+Color+temp+"Square\n");
	}
	
	public void setWidth(double side) {
		Width = side;
	}
	
	public void setLenght(double side) {
		Lenght = side;
	}

}
