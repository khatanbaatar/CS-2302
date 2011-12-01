import tester.Validation;


public class Circle extends GeometricObject implements Comparable<Circle>
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
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Circle c) {
		int result;
		if(radius < c.radius)
			result = -1;
		else if (radius == c.radius)
			result = 0;
		else 
			result = 1;
		
		return result;
	}

}
