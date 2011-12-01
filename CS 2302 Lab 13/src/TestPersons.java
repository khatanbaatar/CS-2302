import java.util.ArrayList;


public class TestPersons
{

	public static void main(String[] args)
	{
		ArrayList<Person> list = new ArrayList<Person>();
		Person p = new Person ("bubba", "1 Nowhere Lane", "bubba@uga.edu");
		list.add(p);
		Student s = new Student ("Bobby Brilliant", "1000 Chastain Road", "brilliant@students.ksu.edu", "CS");
		list.add(s);
		Employee e = new Employee ("Dilbert", "100 Doomed Way", "dilbert@catbert.com", 10);
		list.add(e);
		Faculty f = new Faculty ("Albert Einstein", "1000 Chastain Road", "einstein@kennesaw.edu", 1000, "serf");
		list.add(f);
		Staff st = new Staff ("Tommy Talented", "1 Gold Dome Way", "talented@ga.gov", 1000000, "jack of all trades");
		list.add(st);
		for (int i = 0; i < list.size(); i ++)
			System.out.println (list.get(i));
	}

}