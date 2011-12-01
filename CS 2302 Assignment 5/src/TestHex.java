import tester.Testing;
import tester.Validation;


public class TestHex implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestHex());
	}

	@Override
	public void doTests()
	{
		String s = null;
		int value = Hex.parseHex(s);
		Validation.shouldHaveReportedError(); // Test 1
		s = "";
		value = Hex.parseHex(s);
		Validation.shouldHaveReportedError(); // Test 2
		s = "123QW";
		value = Hex.parseHex(s);
		Validation.shouldHaveReportedError(); // Test 3
		s = "A";
		value = Hex.parseHex(s);
		Validation.shouldBeEqual(value, 10); // Test 4
		s = "A5";
		value = Hex.parseHex(s);
		Validation.shouldBeEqual(value, 165); // Test 5
		s = "FAA";
		value = Hex.parseHex(s);
		Validation.shouldBeEqual(value, 4010); // Test 6
	}

}