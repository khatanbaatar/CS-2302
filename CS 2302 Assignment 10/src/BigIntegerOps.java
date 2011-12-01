import java.math.BigInteger;


public class BigIntegerOps {
	public static BigInteger[] first10Squares(){
		BigInteger[] results = new BigInteger[10];
		BigInteger start = new BigInteger((long)Math.sqrt(Long.MAX_VALUE) + "");
		start = start.add(BigInteger.ONE);	
		int num = 0;
		BigInteger store;
		while (num < 10) {
				store = start.multiply(start);
				results[num] = store;
				num++;
				start = start.add(BigInteger.ONE);	
		}
		return results;
	}
}
