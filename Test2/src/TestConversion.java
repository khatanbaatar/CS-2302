import java.util.ArrayList;

import tester.Testing;
import tester.Validation;


public class TestConversion implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestConversion());
	}

	@Override
	public void doTests()
	{
		String[] s = null;
		ArrayList<String> l = Conversion.convert(s);
		Validation.shouldBeEqual(l, null);
		s = new String[0];
		l = Conversion.convert(s);
		Validation.shouldBeEqual(l.size(), 0);
		String[] s1 = {"abc", "def", "ghi"};
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("abc");
		l1.add("def");
		l1.add("ghi");
		l = Conversion.convert(s1);
		Validation.shouldBeEqual(l, l1);
	}

}
