public class Ball{
		
		private int Radius;
		private String Color;
		private String Type;
		
		public Ball() {
			
		}

		public Ball(String type, String color, int radius) {
			Type = type;
			Color = color;
			Radius = radius;
		}
		
		public int getRadius() {
			return Radius;
		}

		public void setRadius(int radius) {
			Radius = radius;
		}

		public String getColor() {
			return Color;
		}

		public void setColor(String color) {

			Color = color;
		}
		
		public String getType() {

			return Type;
		}
		
		public void setType(String type) {
			Type = type;
		}
		
		public String toString() {
			return "Type is "+Type+"\nColor is "+Color+"\nRadius is "+Radius;
		}
		
		public double getVolume() {
			return 4*Math.PI*Math.pow((double)Radius, 2);
		}
		
		public double getArea() {
			return 4.0/3*Math.PI*Math.pow((double)Radius, 3);
		}
		
	}
