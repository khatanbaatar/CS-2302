import tester.Validation;

public class Dog extends Animal
{
	
	private String breed;

	/**
	 * precondtions: sound & breed cannot be null & must have at least 1 character
	 * @param sound
	 * @param breed
	 */
	public Dog(String sound, String breed)
	{
		super(sound);
		if (breed == null || breed.length() == 0)
			Validation.reportError("invalid breed");
		else
			this.breed = breed;
	}

	public String getBreed()
	{
		return breed;
	}

	public String characteristics()
	{
		return "dog's sound: " + getSound() + " breed: " + getBreed();
	}
	
}
