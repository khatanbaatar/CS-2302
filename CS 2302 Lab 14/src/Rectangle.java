import tester.Validation;


public class Rectangle extends GeometricObject
{
	/**
	 * length must be positive
	 */
	private double length;
	
	/**
	 * width must be positive
	 */
	private double width;
	
	/**
	 * preconditions: length & width must be positive
	 * @param length
	 * @param width
	 */
	public Rectangle (double length, double width)
	{
		super ("rectangle");
		if (length <= 0 || width <= 0)
			Validation.reportError("invalid rectangle dimension");
		else
		{
			this.length = length;
			this.width = width;
		}
		
	}
	
	@Override
	public double area()
	{
		return length * width;
	}

	@Override
	public double perimeter()
	{
		return 2 * length + 2 * width;
	}

}
