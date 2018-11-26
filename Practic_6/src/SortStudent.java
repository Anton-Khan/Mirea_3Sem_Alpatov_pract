import java.util.ArrayList;

public class SortStudent {
	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<Student>();
		for(int i = 0; i < 20; i++)
		ar.add(new Student("Vasya" + (int)(Math.random()*100), 30 - (int)(Math.random()*8), "IKBO-LOL" ));
				
		for(Student s : ar)
		{
			s.tOString();
		}
		
		
		for(int i = 0; i < 20; i++ )
		{
			for(int j = 0; j < 20; j++ )
			{
				if(ar.get(i).getYear() > ar.get(j).getYear() ) 
				{
					Student temp;
					temp = ar.get(i);
					ar.set(i, ar.get(j));
					ar.set(j, temp);
				}
			}
		}
		
		System.out.println("\n");
		
		for(Student s : ar)
		{
			s.tOString();
		}
		
		
	}

}
