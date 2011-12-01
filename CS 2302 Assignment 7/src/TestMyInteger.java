import tester.Testing;
import tester.Validation;


public class TestMyInteger implements Testing
{

	public static void main(String[] args)
	{
		Validation.run (new TestMyInteger());
	}

	@Override
	public void doTests()
	{
		MyInteger mi = new MyInteger (0);
		Validation.shouldBeEqual(mi.getValue(), 0);
		Validation.shouldBeEqual(mi.isEven(), true);
		Validation.shouldBeEqual(mi.isOdd(), false);
		Validation.shouldBeEqual(mi.isPrime(), false);
		mi = new MyInteger (1);
		Validation.shouldBeEqual(mi.getValue(), 1);
		Validation.shouldBeEqual(mi.isEven(), false);
		Validation.shouldBeEqual(mi.isOdd(), true);
		Validation.shouldBeEqual(mi.isPrime(), false);
		mi = new MyInteger (2);
		Validation.shouldBeEqual(mi.getValue(), 2);
		Validation.shouldBeEqual(mi.isEven(), true);
		Validation.shouldBeEqual(mi.isOdd(), false);
		Validation.shouldBeEqual(mi.isPrime(), true);
		mi = new MyInteger (17);
		Validation.shouldBeEqual(mi.getValue(), 17);
		Validation.shouldBeEqual(mi.isEven(), false);
		Validation.shouldBeEqual(mi.isOdd(), true);
		Validation.shouldBeEqual(mi.isPrime(), true);
		mi = new MyInteger (38);
		Validation.shouldBeEqual(mi.getValue(), 38);
		Validation.shouldBeEqual(mi.isEven(), true);
		Validation.shouldBeEqual(mi.isOdd(), false);
		Validation.shouldBeEqual(mi.isPrime(), false);
		mi = new MyInteger (-8);
		Validation.shouldBeEqual(mi.getValue(), -8);
		Validation.shouldBeEqual(mi.isEven(), true);
		Validation.shouldBeEqual(mi.isOdd(), false);
		Validation.shouldBeEqual(mi.isPrime(), false);

	}

}