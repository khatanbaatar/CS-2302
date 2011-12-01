import tester.Testing;
import tester.Validation;


public class TestRemoveDigits implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestRemoveDigits());
	}

	@Override
	public void doTests()
	{
		String s = null;
		String result = DigitRemover.removeDigits(s);
		Validation.shouldHaveReportedError();
		s = "";
		result = DigitRemover.removeDigits(s);
		Validation.shouldBeEqual(result, "");
		s = "12345";
		result = DigitRemover.removeDigits(s);
		Validation.shouldBeEqual(result, "");
		s = "abcde";
		result = DigitRemover.removeDigits(s);
		Validation.shouldBeEqual(result, "abcde");
		s = "a1s2d3f4g";
		result = DigitRemover.removeDigits(s);
		Validation.shouldBeEqual(result, "asdfg");
	}

}
