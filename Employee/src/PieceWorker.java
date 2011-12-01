import tester.Validation;


public class PieceWorker extends Employee
{

	private int numItems;
	
	/**
	 * precondition: ssn must be a valid social security number & payRate must be positive
	 * @param name
	 * @param ssn
	 * @param payRate
	 */
	public PieceWorker(String name, String ssn, double payRate)
	{
		super(name, ssn, payRate);
		numItems = 0;
	}
	
    /**
	 * @return the numItems
	 */
	public int getNumItems()
	{
		return numItems;
	}
	
	/**
	 * precondition: moreItems must be non-negative
	 * @param moreItems - number of additional items
	 * postcondition: number of items for employee has been increased by moreItems
	 */
	public void addItems(int moreItems)
	{
		if (moreItems < 0)
			Validation.reportError("invalid number of items:");
		else
			numItems += moreItems;
	}

	/* (non-Javadoc)
	 * @see Employee#pay()
	 */
	@Override
	public double pay()
	{
		return getPayRate() * numItems;
	}
	
}