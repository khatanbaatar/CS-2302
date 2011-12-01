import tester.Validation;


public abstract class MenuItem
{

	/**
	 * name of the item on the menu
	 */
	private String name;
	
	/**
	 * preconditions: name cannot be null and must have at least 1 character
	 * @param name
	 */
	public MenuItem(String name)
	{
		if (name == null || name.length() == 0)
			Validation.reportError("invalid name");
		else
			this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return cost of the menu item
	 */
	public abstract double getCost();
	
	/**
	 * @return string description of the menu item
	 */
	public abstract String getDescription();
	
}
