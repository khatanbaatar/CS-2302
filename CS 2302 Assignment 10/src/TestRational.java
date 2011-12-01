import java.math.BigInteger;

import tester.Testing;
import tester.Validation;


public class TestRational implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestRational());
	}

	@Override
	public void doTests()
	{
		Rational r = new Rational (BigInteger.ONE,BigInteger.ZERO);
		Validation.shouldHaveReportedError();
		r = new Rational (new BigInteger ("2"), new BigInteger ("3"));
		Validation.shouldBeEqual(r.getNumerator(), new BigInteger("2"));
		Validation.shouldBeEqual(r.getDenominator(), new BigInteger ("3"));
		Rational r1 = new Rational (new BigInteger ("3"), new BigInteger ("-6"));
		Validation.shouldBeEqual(r1.getNumerator(), new BigInteger ("-1"));
		Validation.shouldBeEqual(r1.getDenominator(), new BigInteger ("2"));
		Rational r2 = r.add(r1);
		Validation.shouldBeEqual(r2, new Rational (BigInteger.ONE, new BigInteger ("6")));
		Rational r3 = r.subtract(r1);
		Validation.shouldBeEqual(r3, new Rational (new BigInteger ("7"), new BigInteger ("6")));
		Rational r4 = r.multiply(r1);
		Validation.shouldBeEqual(r4, new Rational (BigInteger.ONE, new BigInteger ("-3")));
		Rational r5 = r.divide(r1);
		Validation.shouldBeEqual(r5, new Rational (new BigInteger ("4"), new BigInteger ("-3")));
		Rational r6 = new Rational (new BigInteger ("-6"), new BigInteger ("-9"));
		Validation.shouldBeEqual(r.equals(r6), true);
		Validation.shouldBeEqual(r.equals(r1), false);
	}
}
