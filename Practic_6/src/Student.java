
public class Student {

	String name;
	private int year;
	private String group;
	
	Student(String n, int y, String g)
	{
		name = n;
		year = y;
		group = g;
	}
	
	void setName(String Name)
	{
		name = Name;
	}
	
	String getName()
	{
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void tOString()
	{
		System.out.println("It is " + name + ", " + year + " years old; Study in " + group + " group");
	}
	
	
	
}
