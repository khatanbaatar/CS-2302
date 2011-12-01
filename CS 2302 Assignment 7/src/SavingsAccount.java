import tester.Validation;


/**
 * @author AndresMobile
 *
 */
public class SavingsAccount extends Account {
	
	double YearlyInterestRate;

	/**
	 * @return the amount of interest that the account has
	 */
	public double getYearlyInterestRate() {
		return YearlyInterestRate;
	}

	/**
	 * preconditions: balance >= 0 & id must have at least 1 character, Interest rate must be positive.
	 * @param balance The balance of the account
	 * @param id The Id of the account
	 * @param interestRate The interest rate a Year
	 */
	public SavingsAccount(double balance, String id, double interestRate) {
		super(balance, id);
		if(interestRate < 0){
			Validation.reportError("Invalid Interest Rate");
		}
		else{
			YearlyInterestRate = interestRate;
		}
		
	}
	
	
	
	/**
	 * Gets the Balance of the account and adds the the monthly interest to it
	 */
	public void earnMonthlyInterest(){
		balance +=   balance * getYearlyInterestRate() / 12 ;
	}
}
