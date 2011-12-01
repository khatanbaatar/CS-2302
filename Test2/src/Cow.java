import tester.Validation;

public class Cow extends Animal
{

	private String motto;

	/**
	 * preconditions: sound & motto cannot be null & must contain at least 1 character
	 * @param sound
	 * @param motto
	 */
	public Cow(String sound, String motto)
	{
		super(sound);
		if (motto == null || motto.length() == 0)
			Validation.reportError("invalid motto");
		else
			this.motto = motto;
	}

	public String getMotto()
	{
		return motto;
	}

	public String characteristics()
	{
		return "cow's sound: " + getSound() + " motto: " + getMotto();
	}
	
}
