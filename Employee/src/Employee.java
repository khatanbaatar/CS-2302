import tester.Validation;

public class Employee {

	/**
	 * name - at least 1 character
	 */
	private String name;
	/**
	 * format ddd-dd-dddd where d is a digit
	 */
	private String ssn;
	/**
	 * must be positive
	 */
	private double payRate;

	/**
	 * preconditions: name must have at least 1 chracter, ssn must be a valid
	 * social security number, pay rate must be positive
	 * 
	 * @param name
	 * @param ssn
	 * @param payRate
	 */
	public Employee(String name, String ssn, double payRate) {
		if (name == null || name.length() == 0) {
			Validation.reportError("Invalid name");
		} else if (!SSN.isValidSSN(ssn)) {
			Validation.reportError("Invalid social security number");
		} else if (payRate <= 0) {
			Validation.reportError("Invalid pay rate");
		} else {
			this.name = name;
			this.ssn = ssn;
			this.payRate = payRate;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			Validation.reportError("Invalid Name");
		} else {
			this.name = name;
		}
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		if (payRate <= 0) {
			Validation.reportError("Invalid pay rate");
		} else {
			this.payRate = payRate;
		}
	}

	public String getSsn() {
		return ssn;
	}
	
	public double pay(){
		return payRate;
	}

}
