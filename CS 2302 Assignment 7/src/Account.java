import java.util.Date;

import tester.Validation;


public class Account
{

	/**
	 * balance of account - must be non-negative
	 */
	protected double balance;
	
	/**
	 * id for account - must have at least 1 character
	 */
	private String id;
	
	/**
	 * date account was created
	 */
	private Date dateCreated;

	/**
	 * preconditions: balance >= 0 & id must have at least 1 character
	 * @param balance
	 * @param id
	 */
	public Account(double balance, String id)
	{
		if (balance < 0)
			Validation.reportError("negative balance");
		else
			this.balance = balance;
		if (id == null || id.length() == 0)
			Validation.reportError("invalid id");
		else
			this.id = id;
		dateCreated = new Date();
	}

	public double getBalance()
	{
		return balance;
	}

	public String getId()
	{
		return id;
	}

	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	/**
	 * precondition: amount must be positive
	 * postcondition: amount has been added to balance
	 * @param amount - must be positive
	 */
	public void deposit (double amount)
	{
		if (amount <= 0)
			Validation.reportError("invalid deposit amount");
		else
			balance += amount;
	}
	
	/** precondition: amount must be positive & less than balance in account
	 * postcondition: balance has been reduced by amount
	 * @param amount - must be positve
	 */
	public void withdraw (double amount)
	{
		if (amount <= 0)
			Validation.reportError("invalid withdrawal amount");
		else if (amount > getBalance())
			Validation.reportError("attempt to overdraw account");
		else
			balance -= amount;
	}
}