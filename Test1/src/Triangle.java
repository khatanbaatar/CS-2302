import tester.Validation;

/**
 * @author AndresMobile
 *
 */
public class Triangle {
	private int base, height;

	/**
	 * @return gets the base of the triangle
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param sets the base of the triangle
	 */
	public void setBase(int base) {
		if (base < 1) {
			Validation.reportError("Base is less than 1");
		} else {
			this.base = base;
		}
	}

	/**
	 * @return gets the height of the triangle
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height sets the height of the triangle
	 */
	public void setHeight(int height) {
		if (height < 1) {
			Validation.reportError("Height is less than 1");
		} else {
			this.height = height;
		}
	}

	/**
	 * precondition: base and height can't be less than 1
	 * @param base makes the base
	 * @param height makes the height
	 */
	public Triangle(int base, int height) {
		super();
		if (base < 1) {
			Validation.reportError("Base is less than 1");
		} else {
			this.base = base;
		}
		if (height < 1) {
			Validation.reportError("Height is less than 1");
		} else {
			this.height = height;
		}
	}

	/**
	 * @return calculates the area of the triangle
	 */
	public double area() {
		return .5 * base * height;
	}

}
