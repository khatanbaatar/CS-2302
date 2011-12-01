
public class DisplayTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long mill = System.currentTimeMillis();
		long days = mill % 86400000;
		System.out.println("Days in Mili " + days);
		
		long hour = days % 3600000;
		long rHour = days / 3600000;
		System.out.println("Hours in mili " + rHour);
		
		long minutes = hour % 60000;		
		long rminutes = hour / 60000;
		System.out.println("Minutes in mili " + rminutes);
		
		double seconds =  minutes / 1000;
		System.out.println("Seconds in the minute is " + seconds);
	}

}
