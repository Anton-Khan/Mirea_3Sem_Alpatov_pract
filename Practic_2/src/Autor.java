public class Autor {
	
	private String Name;
	private String Email;
	private char Gender;

	Autor(String name, String email, char gender)
	{
		Name = name;
		Email = email;
		Gender = gender;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public char getGender() {
		return Gender;
	}
	
	public String toString(){
		return "Autor's Name is "+Name+"\nAutor's email is "+Email+"\nGender is "+Gender;
	}
	
}
