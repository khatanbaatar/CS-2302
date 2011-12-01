import tester.Testing;
import tester.Validation;


public class TestBinary implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestBinary());
	}

	@Override
	public void doTests()
	{
		String s = null;
		int result = Binary.parseBinary(s);
		Validation.shouldHaveReportedError();
		s = "";
		result = Binary.parseBinary(s);
		Validation.shouldHaveReportedError();
		s = "10123";
		result = Binary.parseBinary(s);
		Validation.shouldHaveReportedError();
		s = "10101010t";
		result = Binary.parseBinary(s);
		Validation.shouldHaveReportedError();
		s = "-1111";
		result = Binary.parseBinary(s);
		Validation.shouldHaveReportedError();
		s = "0";
		result = Binary.parseBinary(s);
		Validation.shouldBeEqual(result, 0);
		s = "1";
		result = Binary.parseBinary(s);
		Validation.shouldBeEqual(result, 1);
		s = "01";
		result = Binary.parseBinary(s);
		Validation.shouldBeEqual(result, 1);
		s = "1001101";
		result = Binary.parseBinary(s);
		Validation.shouldBeEqual(result, 77);
}

}