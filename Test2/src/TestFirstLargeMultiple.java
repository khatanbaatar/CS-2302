import java.math.BigInteger;

import tester.Testing;
import tester.Validation;


public class TestFirstLargeMultiple implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestFirstLargeMultiple());
	}

	@Override
	public void doTests()
	{
		BigInteger result = LargeMultiples.firstLargeMultiple(-4);
		Validation.shouldHaveReportedError();
		result = LargeMultiples.firstLargeMultiple(1);
		Validation.shouldHaveReportedError();
		result = LargeMultiples.firstLargeMultiple(2);
		Validation.shouldBeEqual(result, new BigInteger ("9223372036854775808"));
		result = LargeMultiples.firstLargeMultiple(17);
		Validation.shouldBeEqual(result, new BigInteger ("9223372036854775816"));
	}

}
