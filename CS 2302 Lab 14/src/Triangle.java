import tester.Validation;


public class Triangle extends GeometricObject
{

	/**
	 * side1 must be positive
	 */
	private double side1;
	
	/**
	 * side2 must be positive
	 */
	private double side2;
	
	/**
	 * side3 must be positive
	 */
	private double side3;
	
	
	/**
	 * precondition: side1, side2, side3 must all be positive
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle (double side1, double side2, double side3)
	{
		super ("triangle");
		if (side1 <= 0 || side2 <= 0 || side3 <= 0)
			Validation.reportError("invalide triangle dimension");
		else
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		
	}
	@Override
	public double area()
	{
		double temp = (side1 + side2 + side3)/2;
		return Math.sqrt(temp * (temp - side1)* (temp - side2) * (temp - side3));
	}

	@Override
	public double perimeter()
	{
		return side1 + side2 + side3;
	}

}
