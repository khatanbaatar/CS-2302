import tester.Testing;
import tester.Validation;


public class TestOctal implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestOctal());
	}

	@Override
	public void doTests()
	{
		String s = null;
		int value = Octal.parseOctal(s);
		Validation.shouldHaveReportedError();
		s = "";
		value = Octal.parseOctal(s);
		Validation.shouldHaveReportedError();
		s = "45682";
		value = Octal.parseOctal(s);
		Validation.shouldHaveReportedError();
		s = "A45";
		value = Octal.parseOctal(s);
		Validation.shouldHaveReportedError();
		s = "4";
		value = Octal.parseOctal(s);
		Validation.shouldBeEqual(value, 4);
		s = "123";
		value = Octal.parseOctal(s);
		Validation.shouldBeEqual(value, 83);
		s = "761";
		value = Octal.parseOctal(s);
		Validation.shouldBeEqual(value, 497);

	}

}
