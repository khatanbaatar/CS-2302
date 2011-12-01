import java.math.BigInteger;

public class BigIntegerOps {
	/**
	 * @return the first ten numbers with 50 decimal digits that are divisible by 2 or 3
	 */
	public static BigInteger[] first10DivisbleBy2Or3() {
		BigInteger[] results = new BigInteger[10];
		final BigInteger TWO = new BigInteger("2");
		final BigInteger THREE = new BigInteger("3");
		BigInteger start = new BigInteger("10000000000000000000000000000000000000000000000000");
		int num = 0;
		while (num < 10) {
			if (start.mod(TWO).equals(BigInteger.ZERO)
					|| start.mod(THREE).equals(BigInteger.ZERO)) {
				results[num] = start;
				num++;
			}
			start = start.add(BigInteger.ONE);
		}
		return results;
	}
}
