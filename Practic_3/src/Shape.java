
public abstract class Shape {
	
	protected String Color;
	protected boolean filled;
	
	public Shape(){};
	
	public Shape(String color, boolean fill)
	{
		setColor(color);
		filled = fill;
		
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean fill) {
		filled = fill;
	}
	
	public abstract double getArea();
		
	public abstract double getParimeter();
	
	public abstract String toString();
	
}
