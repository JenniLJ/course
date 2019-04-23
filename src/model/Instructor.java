package model;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private String email;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName) {
		this(firstName, lastName, makeEmailAddress(firstName, lastName));
	}
	
	public Instructor(String firstName, String lastName, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	public static String makeEmailAddress(String firstName, String lastName) {
		return firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase() + "@dmacc.edu";
	}

}
