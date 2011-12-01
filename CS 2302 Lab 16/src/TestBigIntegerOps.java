import java.math.BigInteger;

import tester.Testing;
import tester.Validation;


public class TestBigIntegerOps implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestBigIntegerOps());
	}

	@Override
	public void doTests()
	{
		BigInteger[] expectedResults = new BigInteger[10];
		expectedResults[0] = new BigInteger ("10000000000000000000000000000000000000000000000000");
		expectedResults[1] = new BigInteger ("10000000000000000000000000000000000000000000000002");
		expectedResults[2] = new BigInteger ("10000000000000000000000000000000000000000000000004");
		expectedResults[3] = new BigInteger ("10000000000000000000000000000000000000000000000005");
		expectedResults[4] = new BigInteger ("10000000000000000000000000000000000000000000000006");
		expectedResults[5] = new BigInteger ("10000000000000000000000000000000000000000000000008");
		expectedResults[6] = new BigInteger ("10000000000000000000000000000000000000000000000010");
		expectedResults[7] = new BigInteger ("10000000000000000000000000000000000000000000000011");
		expectedResults[8] = new BigInteger ("10000000000000000000000000000000000000000000000012");
		expectedResults[9] = new BigInteger ("10000000000000000000000000000000000000000000000014");
		BigInteger[] result = BigIntegerOps.first10DivisbleBy2Or3();
		Validation.shouldBeEqual(result, expectedResults);
	}

}
