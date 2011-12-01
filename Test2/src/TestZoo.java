import tester.Testing;
import tester.Validation;


public class TestZoo implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestZoo());
	}

	@Override
	public void doTests()
	{
		Zoo congress = new Zoo();
		String s = congress.combinedCharacteristics();
		Validation.shouldBeEqual(s, "");
		congress.addAnimal(new Dog ("bark", "collie"));
		congress.addAnimal(new Snake ("hiss", true));
		congress.addAnimal(new Cow ("moo", "eat more chicken"));
		String result = "dog's sound: bark breed: collie" + '\n';
		result += "snake's sound: hiss and is poisonous" + '\n';
		result += "cow's sound: moo motto: eat more chicken" + '\n';
		s = congress.combinedCharacteristics();
		Validation.shouldBeEqual(s, result);
	}

}
