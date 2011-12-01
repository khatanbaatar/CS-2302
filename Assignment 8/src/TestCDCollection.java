import tester.Testing;
import tester.Validation;


public class TestCDCollection implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestCDCollection());
	}

	@Override
	public void doTests()
	{
		CDCollection collection = new CDCollection();
		Validation.shouldBeEqual(collection.numberOfCDs(), 0); //1
		Validation.shouldBeEqual(collection.totalCost(), 0.0); // 2
		double ave = collection.averageCost();
		Validation.shouldHaveReportedError(); // 3
		CD c1 = new CD ("total garbage", "bubba", 5, 12);
		collection.add(c1);
		Validation.shouldBeEqual(collection.numberOfCDs(), 1); // 4
		Validation.shouldBeEqual(collection.totalCost(), 5.0); // 5
		Validation.shouldBeEqual(collection.averageCost(), 5.0); // 6
		CD c2 = new CD ("pure noise", "screaming dawgs", 1, 1);
		collection.add(c2);
		Validation.shouldBeEqual(collection.numberOfCDs(), 2); // 7
		Validation.shouldBeEqual(collection.totalCost(), 6.0); // 8
		Validation.shouldBeEqual(collection.averageCost(), 3.0);// 9
		System.out.println (collection);
	}

}