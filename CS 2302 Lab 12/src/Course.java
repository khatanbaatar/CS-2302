
import java.util.ArrayList;
import tester.Validation;

public class Course
{
	
	/**
	 * name of course - cannot be null & must have at least 1 character
	 */
	private String courseName;
	/**
	 * students in the course
	 */
	private ArrayList<String> students = new ArrayList<String>();
	
	/**
	 * precondition: courseName cannot be null & must have at least 1 character
	 * 
	 * @param courseName
	 */
	public Course(String courseName)
	{
		if (courseName == null || courseName.length() == 0)
			Validation.reportError("invalid course name");
		else
			this.courseName = courseName;
	}

	/**
	 * precondition: student cannot be null & must have at least 1 character
	 * postcondition: student has been added to the course
	 * 
	 * @param student
	 */
	public void addStudent(String student)
	{
		if (student == null || student.length() == 0)
			Validation.reportError("invalid student");
		else
		{
			students.add(student);
		}
	}

	/**
	 * @return list of students in the course
	 */
	public String[] getStudents()
	{
		String[] s1 = new String[students.size()];
		students.toArray(s1);
		return s1;
	}

	/**
	 * @return number of students in the course
	 */
	public int getNumberOfStudents()
	{
		return students.size();
	}
	
	/**
	 * @return course name
	 */
	public String getCourseName()
	{
		return courseName;
	}

	/**
	 * precondition: student cannot be null & must have at least 1 character
	 * postcondition: if student is in the course, student has been removed - if
	 * student is not the course, no action is taken
	 * 
	 * @param student
	 */
	public void dropStudent(String student)
	{
		if (student == null || student.length() == 0)
			Validation.reportError("invalid student");
		else
		{
			students.remove(student);
		}
	}
}