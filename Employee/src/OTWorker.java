
public class OTWorker extends HourlyWorker {
	
	/**
	 * precondition: ssn must be a valid social security number & payRate must be positive
	 * @param name
	 * @param ssn
	 * @param payRate
	 */
	public OTWorker(String name, String ssn, double payRate) {
		super(name, ssn, payRate);
	}

	/* (non-Javadoc)
	 * @see HourlyWorker#pay()
	 * Adds the overtime pay to the basepay at 40 hours
	 */
	@Override
	public double pay() {
		double overTimePay = 0;
		double overHours = 0;
		double result = 0;
		if(getNumHours() <= 40){
			result = getPayRate() * getNumHours();
		}
		else{
			overHours = getNumHours() - 40;
			overTimePay = overHours * 1.5 * getPayRate();
			result = overTimePay + (40 * getPayRate());
		}
		return result;
		
	}

	
	
}
