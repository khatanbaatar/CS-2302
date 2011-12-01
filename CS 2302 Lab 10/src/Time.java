import tester.Validation;

/**
 * @author AndresMobile
 *
 */
public class Time {
	private long hour = 0;
	private long second = 0;
	private long minute = 0;
	

	/**
	 * 
	 */
	public Time(){
		long mill = System.currentTimeMillis();
		long days = mill % 86400000;
		
		this.hour = days / 3600000;
		this.minute = days % 3600000 / 60000;
		this.second = days % 3600000 % 60000 / 1000;
		
	}

	/**
	 * preconditions: milliseconds can be negative
	 * @param milliseconds to be converted into Hours:Minutes:Seconds
	 */
	public Time(long milliseconds) {
		if (milliseconds < 0) {
			Validation.reportError("Less than 0");
		} else {

			long mill = milliseconds;
			long days = mill % 86400000;
			
			this.hour = days / 3600000;
			this.minute = days % 3600000 / 60000;
			this.second = days % 3600000 % 60000 / 1000;
		}
	}
	/**
	 * @return current hour in a day
	 */
	public int getHour() {
		return (int) hour;
	}

	/**
	 * @return current second in a minute
	 */
	public int getSecond() {
		return (int) second;
	}

	/**
	 * @return current minute in the hour
	 */
	public int getMinute() {
		return (int) minute;
	}

}
