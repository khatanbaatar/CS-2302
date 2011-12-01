import tester.Validation;

/**
 * @author Andres Castro Lab 6
 *
 */
public class Account {
	String id;
	double Balance;

	/**
	 * @return Bank account string ID
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return The Balance of the account
	 */
	public double getBalance() {
		return Balance;
	}

	/**
	 * @param id Account Name
	 * @param Balance Account Balance
	 */
	public Account(String id, double Balance) {
		super();
		if (id == null || id.length() == 0) {
			Validation.reportError("the string is null");
		} else if (Balance <= 0) {
			Validation.reportError("Balance is not positive");
		} else {
			this.id = id;
			this.Balance = Balance;
		}
	}

	/**
	 * @param withdraw
	 * @return Balance left in account
	 */
	public double withdraw(double withdraw) {
		if(withdraw <= 0 || withdraw > Balance){
			Validation.reportError("Can't widthdraw negative or zero");
		}else{
			Balance -= withdraw;
		}
		return Balance;
		
	}

	/**
	 * @param deposit Amount you want to add to account
	 * @return Amount left in your account
	 */
	public double deposit(double deposit) {
		if (deposit <= 0) {
			Validation
					.reportError("You can't deposit zero or less than zero dummy");
		}
		else{
			Balance += deposit;
		}
		return Balance;

	}

}
