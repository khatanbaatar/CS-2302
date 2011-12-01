import tester.Testing;
import tester.Validation;



public class TestBook implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestBook());
	}
	
	@Override
	public void doTests()
	{
		Book b1 = new Book ("Sleeping in Class", "Bubba Dawg");
		Book b2 = new Book ("My Life in Fast Food", "Bubba Dawg");
		Book b3 = new Book ("Success in the Computing Field", "Brilliant Owl");
		Book b4 = new Book ("Success in the Computing Field", "Ambitious Jacket");
		Validation.shouldBeEqual(b1.compareTo(b2) < 0, false);
		Validation.shouldBeEqual(b3.compareTo(b4) > 0, true);
		Validation.shouldBeEqual(b1.compareTo(b4) > 0, true);
	}

}
