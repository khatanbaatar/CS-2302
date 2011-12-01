import tester.Testing;
import tester.Validation;


public class TestComparableOps implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestComparableOps());
	}

	@Override
	public void doTests()
	{
		Integer[] a = null;
		int location = ComparableOps.max(a);
		Validation.shouldHaveReportedError();
		a = new Integer[0];
		location = ComparableOps.max(a);
		Validation.shouldHaveReportedError();
		Integer[] a1 = {3, 6, 2, -4, 5, 9, 2};
		Validation.shouldBeEqual(ComparableOps.max(a1), 5);
		Validation.shouldBeEqual(ComparableOps.min(a1), 3);
		String[] s = {"bgt", "b", "bad", "bat", "ghr", "c"};
		Validation.shouldBeEqual(ComparableOps.max(s), 4);
		Validation.shouldBeEqual(ComparableOps.min(s), 1);
		Circle[] c = new Circle[4];
		c[0] = new Circle(4);
		c[1] = new Circle(6);
		c[2] = new Circle (3);
		c[3] = new Circle(5);
		Validation.shouldBeEqual(ComparableOps.max(c), 1);
		Validation.shouldBeEqual(ComparableOps.min(c), 2);
	}

}
