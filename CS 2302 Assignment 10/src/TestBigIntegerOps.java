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
		expectedResults[0] = new BigInteger("9223372037000250000");
		expectedResults[1] = new BigInteger("9223372043074251001");
		expectedResults[2] = new BigInteger("9223372049148252004");
		expectedResults[3] = new BigInteger("9223372055222253009");
		expectedResults[4] = new BigInteger("9223372061296254016");
		expectedResults[5] = new BigInteger("9223372067370255025");
		expectedResults[6] = new BigInteger("9223372073444256036");
		expectedResults[7] = new BigInteger("9223372079518257049");
		expectedResults[8] = new BigInteger("9223372085592258064");
		expectedResults[9] = new BigInteger("9223372091666259081");
		BigInteger[] results = BigIntegerOps.first10Squares();
		Validation.shouldBeEqual(results, expectedResults);
	}

}