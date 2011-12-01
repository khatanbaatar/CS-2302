import tester.Validation;


/**
 * @author AndresMobile
 *
 */
public class Contact implements Comparable<Contact> {
	private String firstName,lastName;
	

	/**
	 * preconditions: Names can't be null, Names must be at least one character long
	 * postcondition: Creates a contact who has a first and last name
	 * @param firstName The first name of a contact
	 * @param lastName	The last name of a contact
	 */
	public Contact(String firstName, String lastName) {
		super();
		if(firstName == null || lastName == null){
			Validation.reportError("One or both of the names are null");
		}
		else if(firstName.length() < 1 || lastName.length() < 1){
			Validation.reportError("Names need to be at least one character long");
		}
		else{
		this.firstName = firstName;
		this.lastName = lastName;
		}
	}


	/**
	 * @return Gets the first name of the contact
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return Gets the second name of the contact
	 */
	public String getLastName() {
		return lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * Compares two Contact objects by last name. If last names are the same it then compares 
	 * by first name.
	 */
	@Override
	public int compareTo(Contact c) {
		int result = 0;
		if(lastName.compareTo(c.getLastName()) == 0){
			result = firstName.compareTo(c.getFirstName());
		}else{
			result = lastName.compareTo(c.getLastName());
		}
		return result;
		
	
	}


}
