import tester.Testing;
import tester.Validation;


public class TestOrder implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestOrder());
	}

	@Override
	public void doTests()
	{
		Order o = new Order();
		Validation.shouldBeEqual(o.orderCost(), 0.0);
		Validation.shouldBeEqual(o.orderDescription(), "");
		MenuItem m1 = new FrenchFries (FrenchFries.SMALL);
		o.add(m1);
		Validation.shouldBeEqual(o.orderCost(), 1.0);
		Validation.shouldBeEqual(o.orderDescription(), "small french fries" + '\n');
		MenuItem m2 = new Hamburger (true, false, true, false);
		o.add(m2);
		Validation.shouldBeEqual(o.orderCost(), 3.4);
		String s = "small french fries" + '\n' + "hamburger with cheese with ketchup" + '\n';
		Validation.shouldBeEqual(o.orderDescription(), s);
		Pizza heartburn = new Pizza (false, true, true, false);
		Validation.shouldBeEqual(heartburn.getCost(), 7.25);
		s = "pizza with pepperoni with onions";
		Validation.shouldBeEqual(heartburn.getDescription(), s);
		heartburn.setOnions(false);
		Validation.shouldBeEqual(heartburn.getCost(), 6.5);
		s = "pizza with pepperoni";
		Validation.shouldBeEqual(heartburn.getDescription(), s);
		heartburn.setMushrooms(true);
		Validation.shouldBeEqual(heartburn.getCost(), 7.4);
		s = "pizza with pepperoni with mushrooms";
		Validation.shouldBeEqual(heartburn.getDescription(), s);
		o.add(heartburn);
		Validation.shouldBeEqual(o.orderCost(), 10.8);
		s = "small french fries" + '\n' + "hamburger with cheese with ketchup" + '\n'
			+ "pizza with pepperoni with mushrooms" + '\n';
		Validation.shouldBeEqual(o.orderDescription(), s);
	}
}
