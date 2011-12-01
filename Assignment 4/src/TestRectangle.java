import tester.Testing;
import tester.Validation;


public class TestRectangle implements Testing
{
	
	public static void main(String[] args)
	{
		Validation.run(new TestRectangle());
	}

	@Override
	public void doTests()
	{
		Rectangle r = new Rectangle (4, -3);
		Validation.shouldHaveReportedError(); // Test 1
		r = new Rectangle (0,2);
		Validation.shouldHaveReportedError(); // Test 2
		r = new Rectangle (3, 4);
		Validation.shouldBeEqual(r.getLength(), 3.0); // Test 3
		Validation.shouldBeEqual(r.getWidth(), 4.0); // Test 4
		r.setLength(-8);
		Validation.shouldHaveReportedError(); // Test 5
		r.setWidth(-22.8);
		Validation.shouldHaveReportedError(); // Test 6
		r.setLength(98.7);
		Validation.shouldBeEqual(r.getLength(), 98.7); // Test 7
		r.setWidth(4.345);
		Validation.shouldBeEqual(r.getWidth(), 4.345); // Test 8
		r.setLength(5);
		r.setWidth(3);
		Validation.shouldBeEqual(r.area(), 15.0); // Test 9
		Validation.shouldBeEqual(r.perimeter(), 16.0); // Test 10
	}

}