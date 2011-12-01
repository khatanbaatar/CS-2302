import tester.Validation;


/**
 * @author AndresMobile
 *
 */
public class FindArea {
	
	/**
	 * preconditions: x1 not equal to x2
	 * @param s1 first coordinate of first point
	 * @param s2 second coordinate of first point
	 */
	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static double area (double s1, double s2){
		double result = 0;
	
		if(s1 <= 0)
			Validation.reportError("First number is Negative");
		else
			result = s1 * s2;
		return result;
		}

}
