/**
 * 
 */

/**
 * @author AndresMobile
 * 
 */
public class MyInteger {
	private int num;

	/**
	 * @param num sets a number to MyInteger
	 */
	public MyInteger(int num) {
		this.num = num;
	}

	/**
	 * @return True if it is even, False if it is not even
	 */
	public boolean isEven() {
		boolean result;
		if (getValue() % 2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * @return True if it is odd, False if it is not prime.
	 */
	public boolean isOdd() {
		boolean result;
		if (getValue() % 2 == 0) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

	/**
	 * @return False if it is not a prime number, True if it is a prime number.
	 */
	public boolean isPrime() {
		boolean result = false;
		if(getValue() == 2){
			result = true;
		}
		else if(getValue() < 2 || isEven() || getValue() % 3 == 0){
			result = false;
		}
		else{
			
			result = true;
		}
		
	return result;
	
	}

	/**
	 * @return returns the value of the integer
	 */
	public int getValue() {
		return num;
	}
}
