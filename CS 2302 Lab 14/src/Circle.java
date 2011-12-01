import tester.Validation;


public class Circle extends GeometricObject
{

	/**
	 * radius must be positive
	 */
	private double radius;
	
	
	/**
	 * precondition: radius must be positive
	 * @param radius
	 */
	public Circle(double radius)
	{
		super("circle");
		if (radius <= 0)
			Validation.reportError("invalid radius");
		else
			this.radius = radius;
	}

	@Override
	public double area()
	{
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter()
	{
		return 2 * Math.PI * radius;
	}

}
