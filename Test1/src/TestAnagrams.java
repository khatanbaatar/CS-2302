import tester.Testing;
import tester.Validation;


public class TestAnagrams implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestAnagrams());
	}

	@Override
	public void doTests()
	{
		String s1 = null;
		String s2 = null;
		boolean result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldHaveReportedError();
		s1 = "abc";
		result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldHaveReportedError();
		s1 ="";
		s2 = "";
		result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldBeEqual(result, true);
		s1 = "abd";
		s2 = "aabd";
		result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldBeEqual(result, false);
		s1 = "abcd";
		s2 = "cdab";
		result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldBeEqual(result, true);
		s1 = "aabcd";
		s2 = "abcdd";
		result = Anagrams.areAnagrams(s1, s2);
		Validation.shouldBeEqual(result, false);
	}

}
