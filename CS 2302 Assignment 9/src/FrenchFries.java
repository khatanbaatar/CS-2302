import tester.Validation;


public class FrenchFries extends MenuItem
{

	public static final int SMALL = 1;
	public static final int LARGE = 2;
	
	private static final double COST_FOR_SMALL = 1;
	private static final double COST_FOR_LARGE = 1.5;
	
	private int size;
	
	/**
	 * precondition: size must be a valid integer code for the size
	 * @param size - integer code for size
	 */
	public FrenchFries(int size)
	{
		super("french fries");
		if (size != SMALL && size != LARGE)
			Validation.reportError("invalid size of french fries");
		else
			this.size = size;
	}


	@Override
	public String getDescription()
	{
		String s;
		if (size == SMALL)
			s = "small";
		else
			s = "large";
		return s + " " + getName();
	}


	@Override
	public double getCost()
	{
		double value;
		if (size == SMALL)
			value = COST_FOR_SMALL;
		else
			value = COST_FOR_LARGE;
		return value;
	}

}
