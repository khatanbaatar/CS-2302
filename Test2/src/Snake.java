public class Snake extends Animal
{

	private boolean poisonous;

	/**
	 * precondition: sound cannot be null & must have at least 1 character
	 * @param sound
	 * @param poisonous
	 */
	public Snake(String sound, boolean poisonous)
	{
		super(sound);
		this.poisonous = poisonous;
	}

	public boolean isPoisonous()
	{
		return poisonous;
	}

	public String characteristics()
	{
		String s = "snake's sound: " + getSound();
		if (isPoisonous())
			s += " and is poisonous";
		else
			s += " and is not poisonous";
		return s;
	}
	
}
