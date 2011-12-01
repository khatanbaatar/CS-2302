import tester.Testing;
import tester.Validation;


public class TestSortStudentGrades implements Testing
{

	public static void main(String[] args)
	{
		Validation.run(new TestSortStudentGrades());
	}
	
	@Override
	public void doTests()
	{
		String[] s = null;
		int[] g = null;
		SortStudentGrades.sortByGrade(s, g);
		Validation.shouldHaveReportedError(); // Test 1
		g = new int[5];
		SortStudentGrades.sortByGrade(s, g);
		Validation.shouldHaveReportedError(); // Test 2
		s = new String[3];
		SortStudentGrades.sortByGrade(s, g);
		Validation.shouldHaveReportedError(); // Test 3
		
		g = new int[0];
		s = new String[0];
		SortStudentGrades.sortByGrade(s, g);
		
		int[] g1 = new int[0];
		String[] s1 = new String[0];
		Validation.shouldBeEqual(s, s1); // Test 4
		Validation.shouldBeEqual(g, g1); // Test 5
		
		int[] g2 = {34, 45, 23, 99, 63};
		String[] s2 = {"Smith", "Jones", "Thomas", "Nelson", "Adams"};
		
		int[] g3 = {99, 63, 45, 34, 23};
		String[] s3 = {"Nelson", "Adams", "Jones", "Smith", "Thomas"};
		
		SortStudentGrades.sortByGrade(s2, g2);
		Validation.shouldBeEqual(g2, g3); // Test 6
		Validation.shouldBeEqual(s2, s3); // Test 7
		
	}


}