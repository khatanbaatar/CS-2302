import tester.Validation;

public class Octagon extends GeometricObject {

	double side;

	public double getSide() {
		return side;
	}

	/**
	 * precondition: side must be positive
	 * @param side side of the octagon
	 */
	public Octagon(double side) {
		super("Octagon");
		if (side <= 0)
			Validation.reportError("invalid rectangle dimension");
		else {
			this.side = side;
		}
	}

	@Override
	public double area() {
		return  2* (1 + Math.sqrt(2)) * Math.pow(side, 2);
	}

	@Override
	public double perimeter() {

		return side * 8;
	}

}
