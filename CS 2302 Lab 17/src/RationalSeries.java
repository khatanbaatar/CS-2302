import java.math.BigDecimal;
import java.math.BigInteger;


public class RationalSeries {
	public static void main(String[] arg){
		Rational result = new Rational(BigInteger.ZERO,BigInteger.ONE);
		BigInteger hun = new BigInteger("100");
		for(BigInteger x = BigInteger.ONE; x.compareTo(hun) == 99; x = x.add(BigInteger.ONE)){
			Rational newRation = new Rational(x, x.add(BigInteger.ONE));
			result = result.add(newRation);
			System.out.println(x + ":" + result);
		}
		System.out.println(result);
	}
}
