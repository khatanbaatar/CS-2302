import tester.Testing;
import tester.Validation;


public class TestEmployee implements Testing
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Validation.run(new TestEmployee());
	}

	@Override
	public void doTests()
	{
		Employee e = new Employee (null, "123-45-6789", 22);
		Validation.shouldHaveReportedError();
		e = new Employee ("bubba", "ddd", 89);
		Validation.shouldHaveReportedError();
		e = new Employee ("bubba", "123-45-6789", -3);
		Validation.shouldHaveReportedError();
		e = new Employee ("bubba", "123-45-6789", 1);
		Validation.shouldBeEqual(e.getName(), "bubba");
		Validation.shouldBeEqual(e.getSsn(), "123-45-6789");
		Validation.shouldBeEqual(e.getPayRate(), 1.0);
		e.setPayRate(-4);
		Validation.shouldHaveReportedError();
		e.setPayRate(2);
		Validation.shouldBeEqual(e.getPayRate(), 2.0);
		Validation.shouldBeEqual(e.pay(), 2.0);
		
		HourlyWorker hr = new HourlyWorker (null, "123-45-6789", 22);
		Validation.shouldHaveReportedError();
		hr = new HourlyWorker ("bubba", "ddd", 89);
		Validation.shouldHaveReportedError();
		hr = new HourlyWorker ("bubba", "123-45-6789", -3);
		Validation.shouldHaveReportedError();
		hr = new HourlyWorker ("bubba", "123-45-6789", 1);
		Validation.shouldBeEqual(hr.getName(), "bubba");
		Validation.shouldBeEqual(hr.getSsn(), "123-45-6789");
		Validation.shouldBeEqual(hr.getPayRate(), 1.0);
		hr.setPayRate(-4);
		Validation.shouldHaveReportedError();
		hr.setPayRate(2);
		Validation.shouldBeEqual(hr.getPayRate(), 2.0);
		hr.addHours(-3);
		Validation.shouldHaveReportedError();
		hr.addHours(5);
		Validation.shouldBeEqual(hr.getNumHours(), 5.0);
		hr.addHours(0.5);
		Validation.shouldBeEqual(hr.getNumHours(), 5.5);
		Validation.shouldBeEqual(hr.pay(), 11.0);

		PieceWorker pr = new PieceWorker (null, "123-45-6789", 22);
		Validation.shouldHaveReportedError();
		pr = new PieceWorker ("bubba", "ddd", 89);
		Validation.shouldHaveReportedError();
		pr = new PieceWorker ("bubba", "123-45-6789", -3);
		Validation.shouldHaveReportedError();
		pr = new PieceWorker ("bubba", "123-45-6789", 1);
		Validation.shouldBeEqual(pr.getName(), "bubba");
		Validation.shouldBeEqual(pr.getSsn(), "123-45-6789");
		Validation.shouldBeEqual(pr.getPayRate(), 1.0);
		pr.setPayRate(-4);
		Validation.shouldHaveReportedError();
		pr.setPayRate(2);
		pr.addItems(-3);
		Validation.shouldHaveReportedError();
		pr.addItems(5);
		Validation.shouldBeEqual(pr.getNumItems(), 5);
		pr.addItems(2);
		Validation.shouldBeEqual(pr.getNumItems(), 7);
		Validation.shouldBeEqual(pr.getPayRate(), 2.0);
		Validation.shouldBeEqual(pr.pay(), 14.0);

		Executive ex = new Executive (null, "123-45-6789", 22);
		Validation.shouldHaveReportedError();
		ex = new Executive ("bubba", "ddd", 89);
		Validation.shouldHaveReportedError();
		ex = new Executive ("bubba", "123-45-6789", -3);
		Validation.shouldHaveReportedError();
		ex = new Executive ("bubba", "123-45-6789", 1);
		Validation.shouldBeEqual(ex.getName(), "bubba");
		Validation.shouldBeEqual(ex.getSsn(), "123-45-6789");
		Validation.shouldBeEqual(ex.getPayRate(), 1.0);
		ex.setPayRate(-4);
		Validation.shouldHaveReportedError();
		ex.setPayRate(2);
		Validation.shouldBeEqual(ex.getPayRate(), 2.0);
		ex.setBonus(-3);
		Validation.shouldHaveReportedError();
		ex.setBonus(5);
		Validation.shouldBeEqual(ex.getBonus(), 5.0);
		Validation.shouldBeEqual(ex.pay(), 7.0);
		
		OTWorker othr = new OTWorker (null, "123-45-6789", 22);
		Validation.shouldHaveReportedError();
		othr = new OTWorker ("bubba", "ddd", 89);
		Validation.shouldHaveReportedError();
		othr = new OTWorker ("bubba", "123-45-6789", -3);
		Validation.shouldHaveReportedError();
		othr = new OTWorker ("bubba", "123-45-6789", 1);
		Validation.shouldBeEqual(othr.getName(), "bubba");
		Validation.shouldBeEqual(othr.getSsn(), "123-45-6789");
		Validation.shouldBeEqual(othr.getPayRate(), 1.0);
		othr.setPayRate(-4);
		Validation.shouldHaveReportedError();
		othr.setPayRate(2);
		Validation.shouldBeEqual(othr.getPayRate(), 2.0);
		othr.addHours(-3);
		Validation.shouldHaveReportedError();
		othr.addHours(5);
		Validation.shouldBeEqual(othr.getNumHours(), 5.0);
		othr.addHours(0.5);
		othr.addHours(50);
		Validation.shouldBeEqual(othr.getNumHours(), 55.5);
		Validation.shouldBeEqual(othr.pay(), 126.50);

	}

}