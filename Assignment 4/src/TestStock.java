import tester.Testing;
import tester.Validation;

public class TestStock implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestStock());
	}

	@Override
	public void doTests()
	{
		Stock s = new Stock ("pitchfork", "Bubba");
		Validation.shouldBeEqual(s.getName(), "Bubba"); // Test 1
		Validation.shouldBeEqual(s.getSymbol(), "pitchfork"); // Test 2
		Validation.shouldBeEqual(s.getCurrentPrice(), 0.0); // Test 3
		Validation.shouldBeEqual(s.getPreviousClosingPrice(), 0.0); // Test 4
		double temp = s.getChangePercent();
		Validation.shouldHaveReportedError(); // Test 5
		s.setCurrentPrice(-3);
		Validation.shouldHaveReportedError(); // Test 6
		s.setPreviousClosingPrice(0);
		Validation.shouldHaveReportedError(); // Test 7
		s.setPreviousClosingPrice(6);
		Validation.shouldBeEqual(s.getPreviousClosingPrice(), 6.0); // Test 8
		s.setCurrentPrice (9);
		Validation.shouldBeEqual(s.getCurrentPrice(), 9.0); // Test 9
		Validation.shouldBeEqual(s.getChangePercent(), 0.5); // Test 10
	}

}