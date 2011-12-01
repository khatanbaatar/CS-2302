import tester.Testing;
import tester.Validation;


public class TestTriangle implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestTriangle());
	}

	@Override
	public void doTests()
	{
		Triangle t = new Triangle (-3, 4);
		Validation.shouldHaveReportedError();
		t = new Triangle (4, -1);
		Validation.shouldHaveReportedError();
		t = new Triangle (4, 0);
		Validation.shouldHaveReportedError();
		t = new Triangle (4, 5);
		Validation.shouldBeEqual(t.getBase(), 4.0);
		Validation.shouldBeEqual(t.getHeight(), 5.0);
		Validation.shouldBeEqual(t.area(), 10.0);
		t.setBase(0);
		Validation.shouldHaveReportedError();
		t.setBase(8);
		Validation.shouldBeEqual(t.getBase(), 8.0);
		t.setHeight(-7);
		Validation.shouldHaveReportedError();
		t.setHeight(1);
		Validation.shouldBeEqual(t.getHeight(), 1.0);
	}

}
