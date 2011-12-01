import tester.Testing;
import tester.Validation;

public class TestAccount implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestAccount());
	}
	
	@Override
	public void doTests()
	{
		Account a = new Account (null, 7);
		Validation.shouldHaveReportedError(); // Test 1
		a = new Account ("", 2.3);
		Validation.shouldHaveReportedError(); // Test 2
		a = new Account ("abc", -7);
		Validation.shouldHaveReportedError(); // Test 3
		a = new Account ("abc", 0);
		Validation.shouldHaveReportedError(); // Test 4
		a = new Account ("abc", 10);
		Validation.shouldBeEqual(a.getId(), "abc"); // Test 5
		Validation.shouldBeEqual(a.getBalance(), 10.0); // Test 6
		
		a.deposit(-8);
		Validation.shouldHaveReportedError(); // Test 7
		a.deposit(0);
		Validation.shouldHaveReportedError(); // Test 8

		a.deposit(14);
		Validation.shouldBeEqual(a.getBalance(), 24.0); // Test 9
		
		a.withdraw(-4);
		Validation.shouldHaveReportedError(); // Test 10
		a.withdraw(50);
		Validation.shouldHaveReportedError(); // Test 11
		a.withdraw(9);
		Validation.shouldBeEqual(a.getBalance(), 15.0); // Test 12
	}

}