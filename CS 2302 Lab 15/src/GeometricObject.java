import tester.Validation;


public abstract class GeometricObject
{

	private String name;

	/**
	 * precondition: name cannot be null & name must have at least 1 character
	 * @param name
	 */
	public GeometricObject(String name)
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
	
	public abstract double perimeter();
	
	public abstract double area();
}
