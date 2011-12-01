import tester.Validation;

public class CheckingAccount extends Account {

	private double Fee;

	/**
	 * @return the fee of the account.
	 */
	public double getFee() {
		return Fee;
	}

	/**
	 * preconditions: balance >= 0 & id must have at least 1 character, Fee most be positive.
	 * @param balance The balance of the account
	 * @param id The Id of the account
	 * @param fee The fee associated with the account
	 */
	public CheckingAccount(double balance, String id, double fee) {
		super(balance, id);
		if (fee < 0) {
			Validation.reportError("Invalid Fee");
		} else {
			Fee = fee;
		}
	}

	/* (non-Javadoc)
	 * @see Account#deposit(double)
	 */
	@Override
	public void deposit(double amount) {
		if (amount <= 0)
			Validation.reportError("invalid deposit amount");
		else if (amount < balance - getFee()) {
			Validation.reportError("Deposite would make the balance negative");
		} else {
			balance += amount - getFee();
		}
	}

	/* (non-Javadoc)
	 * @see Account#withdraw(double)
	 */
	@Override
	public void withdraw(double amount) {
		if (amount <= 0)
			Validation.reportError("invalid withdrawal amount");
		else if (amount > getBalance())
			Validation.reportError("attempt to overdraw account");
		else if (amount - getFee() > getBalance()) {
			Validation.reportError("Withdraw would make the balance negative");
		} else {
			balance -= (amount + getFee());
		}
	}

}
