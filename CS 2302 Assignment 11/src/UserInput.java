
public class UserInput
{

	private boolean validInput;
	
	private int userInput;

	/**
	 * @param isValid
	 * @param userInput
	 */
	public UserInput(boolean validInput, int userInput)
	{
		this.validInput = validInput;
		this.userInput = userInput;
	}

	/**
	 * @return the validInput
	 */
	public boolean isValidInput()
	{
		return validInput;
	}

	/**
	 * @return the userInput
	 */
	public int getUserInput()
	{
		return userInput;
	}
	
	
}
