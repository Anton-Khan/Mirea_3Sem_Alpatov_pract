public class Programm {
		
		public static void main(String [] args) {
			
			System.out.println("HELLO!\n");
			
			Ball b1 = new Ball("Basketball Ball", "Orange", 15);
			
			System.out.println("Type is "+b1.getType()+"\nColor is "+b1.getColor()+"\nRadius is "+b1.getRadius()+"\n\n");
			
			String a;
			a = b1.toString();
			System.out.println(a+"\n");
			
			System.out.println("Ball's volume is "+b1.getVolume());
			
			System.out.println("Ball's area is "+b1.getArea());
		}
	
	

}
