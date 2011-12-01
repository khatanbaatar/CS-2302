import tester.Validation;

public abstract class Animal
{

	private String sound;
	
	/**
	 * precondition: sound cannot be null & must have at least 1 character
	 * @param sound
	 */
	public Animal (String sound)
	{
		if (sound == null || sound.length() == 0)
			Validation.reportError("invalid sound");
		else
			this.sound = sound;
	}

	public String getSound()
	{
		return sound;
	}
	
	public abstract String characteristics();
}
