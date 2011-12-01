
public class Person {
	

	private String name, emailAddress, address;
	
	/**
	 * @param name the name of a person
	 * @param emailAddress the persons email address
	 * @param address the persons main address
	 */
	public Person(String name, String emailAddress, String address) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * returns - Name, email, and adress
	 */
	@Override
	public String toString() {
		String result = name + ", " + emailAddress + ", " + address ;
		return result;
	}
}
