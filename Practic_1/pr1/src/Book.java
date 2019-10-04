
public class Book {

	private String Autor;
	private int Year;
	private String Name;
	private String Color;
	
	Book(){}
	
	Book(String name, String autor, int year, String color){
		Name = name;
		Autor = autor;
		Year = year;
		Color = color;
	}
	
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public String getBook()
	{
		return "Book is "+Name+"\nAutor is "+Autor+"\nYear is "+Year+"\nIf you Designer => Color is "+Color;
	}
	
	
	
}
