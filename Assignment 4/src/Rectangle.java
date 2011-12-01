import tester.Validation;


/**
 * @author Andres Castro Assignment 4
 *
 */
public class Rectangle {
	private double width = 0;
	private double length = 0;
	
	/**
	 * @param w the width of the rectangle thats not negative or zero
	 * @param l the length of the rectangle thats not negative or zero
	 */
	Rectangle(double w,double l ){
		width = l;
		length = w;
		if(w <= 0){
			Validation.reportError("Width can not be negative or zero");
		}
		if(l <= 0){
			Validation.reportError("Length can not be negative or zero");
		}
	}
	

	/**
	 * @param newWidth the width you want to set for the rectangle
	 */
	public void setWidth(double newWidth){
		if(newWidth <= 0){
			Validation.reportError("Width can not be negative");
		}
		width = newWidth;
	}
	/**
	 * @return gets the width from the rectangle
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * @param newLength the width you want to set for the rectangle
	 */
	public void setLength(double newLength){
		if(newLength <= 0){
			Validation.reportError("Length can not be negative");
		}
		length = newLength;
	}
	/**
	 * @return the current length of the rectangle
	 */
	public double getLength(){
		return length;
	}
	/**
	 * @return the perimeter of the rectangle
	 */
	public double perimeter(){
		return (2*length) + (2*width);
	}
	/**
	 * @return the area of the rectangle
	 */
	public double area(){
		return length*width;
	}
}
