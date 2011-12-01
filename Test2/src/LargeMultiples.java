import java.math.BigInteger;

import tester.Validation;

public class LargeMultiples {

	/**
	 * precondition - n > 1
	 * 
	 * @param n
	 *            - number to find the multiple of
	 * @return the first large multiple of n that is greater than Long.Max_Value
	 */
	public static BigInteger firstLargeMultiple(int n) {
		BigInteger b = new BigInteger(n + "");
		BigInteger test = new BigInteger(Long.MAX_VALUE + "");
		test = test.add(BigInteger.ONE);
		BigInteger result = BigInteger.ZERO;
		if (n <= 1) {
			Validation.reportError("N must be greater than 1");
		} else {
			while (!test.mod(b).equals(BigInteger.ZERO)) {
				test = test.add(BigInteger.ONE);
			}
		}

		return test;

	}

}
