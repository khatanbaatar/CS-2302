import tester.Validation;

public class Executive extends Employee {
	private double bonus;
	
	/**
	 * precondition: ssn must be a valid social security number & payRate must be positive
	 * @param name
	 * @param ssn
	 * @param payRate
	 */
	public Executive(String name, String ssn, double payRate) {
		super(name, ssn, payRate);
		bonus = 0;
	}
	
	
	/**
	 * precondition: bonus can't be less than 0
	 * @param bonus gets the bonus
	 */
	public void setBonus(double bonus) {
		if (bonus < 0) {
			Validation.reportError("Invalid Bonus");
		} else {
			this.bonus = bonus;
		}
	}

	/**
	 * @return GETS the bonus
	 */
	public double getBonus() {
		return bonus;
	}


	@Override
	/**
	 * @return the bonus + their Basepay
	 */
	public double pay() {
		return bonus + getPayRate();
	}

}
