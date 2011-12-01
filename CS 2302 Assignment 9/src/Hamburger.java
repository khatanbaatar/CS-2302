
public class Hamburger extends MenuItem
{

	private final double HAMBURGER_COST = 2;
	
	/**
	 * specifies whether ketchup is selected
	 */
	private boolean ketchup;
	
	/**
	 * indicates whether mustard is selected
	 */
	private boolean mustard;
	
	/**
	 * indicates whether cheese is selected
	 */
	private boolean cheese;
	
	/**
	 * indicates whether pickles is selected
	 */
	private boolean pickles;
	
	private final double CHEESE_COST = 0.4;
	
	/**
	 * each argument specifies whether that condiment has been selected
	 * @param ketchup
	 * @param mustard
	 * @param cheese
	 * @param pickles
	 */
	public Hamburger(boolean ketchup, boolean mustard, boolean cheese, boolean pickles)
	{
		super("hamburger");
		this.ketchup = ketchup;
		this.mustard = mustard;
		this.cheese = cheese;
		this.pickles = pickles;
	}

	
	/**
	 * @param ketchup the ketchup to set
	 */
	public void setKetchup(boolean ketchup)
	{
		this.ketchup = ketchup;
	}


	/**
	 * @param mustard the mustard to set
	 */
	public void setMustard(boolean mustard)
	{
		this.mustard = mustard;
	}


	/**
	 * @param cheese the cheese to set
	 */
	public void setCheese(boolean cheese)
	{
		this.cheese = cheese;
	}


	/**
	 * @param pickles the pickles to set
	 */
	public void setPickles(boolean pickles)
	{
		this.pickles = pickles;
	}


	@Override
	public double getCost()
	{
		double result = HAMBURGER_COST;
		if (cheese)
			result += CHEESE_COST;
		return result;
	}

	@Override
	public String getDescription()
	{
		String s = getName();
		if (cheese)
			s += " with cheese";
		if (ketchup)
			s += " with ketchup";
		if (mustard)
			s += " with mustard";
		if (pickles)
			s += " with pickles";
		return s;
	}

}
