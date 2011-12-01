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
		SavingsAccount a1 = new SavingsAccount(-2, "xxx", 0.1);
		Validation.shouldHaveReportedError();
		a1 = new SavingsAccount (10, "", 0.1);
		Validation.shouldHaveReportedError();
		a1 = new SavingsAccount (10, "xxx", -3);
		Validation.shouldHaveReportedError();
		a1 = new SavingsAccount (10, "xxx", 0.1);
		Validation.shouldBeEqual(a1.getBalance(), 10.0);
		Validation.shouldBeEqual(a1.getId(), "xxx");
		Validation.shouldBeEqual(a1.getYearlyInterestRate(), 0.1);
		a1.deposit(-2);
		Validation.shouldHaveReportedError();
		a1.deposit(45);
		Validation.shouldBeEqual(a1.getBalance(), 55.0);
		a1.withdraw(-8);
		Validation.shouldHaveReportedError();
		a1.withdraw(88);
		Validation.shouldHaveReportedError();
		a1.withdraw(7);
		Validation.shouldBeEqual(a1.getBalance(), 48.0);
		a1.earnMonthlyInterest();
		Validation.shouldBeEqual(a1.getBalance(), 48.4); //12

		CheckingAccount a2 = new CheckingAccount(-2, "xxx", 5);
		Validation.shouldHaveReportedError(); //13
		a2 = new CheckingAccount (10, "", 5);
		Validation.shouldHaveReportedError(); //14
		a2 = new CheckingAccount (10, "xxx", -3);
		Validation.shouldHaveReportedError(); //15
		a2 = new CheckingAccount (10, "xxx", 5);
		Validation.shouldBeEqual(a2.getBalance(), 10.0); //16
		Validation.shouldBeEqual(a2.getId(), "xxx"); //17
		Validation.shouldBeEqual(a2.getFee(), 5.0);//18
		System.out.println (a2.getBalance());
		a2.deposit(-2);
		Validation.shouldHaveReportedError();
		a2.deposit(45);
		Validation.shouldBeEqual(a2.getBalance(), 50.0);
		a2.withdraw(-8);
		Validation.shouldHaveReportedError();
		a2.withdraw(88);
		Validation.shouldHaveReportedError();
		a2.withdraw(9);
		Validation.shouldBeEqual(a2.getBalance(), 36.0);
	
	}

}