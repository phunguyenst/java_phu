package nguyenQuangVinh.bai07;

public abstract class Employee {
	private String firstName, lastName;
	private String socialSecurityNumber;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the sSN
	 */
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
	 * @param sSN the sSN to set
	 */
	public void setsocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber= socialSecurityNumber;
	}
		
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setsocialSecurityNumber(socialSecurityNumber);
	}
	public Employee() {
		this("","", "");
	}
	public abstract double earning();
	public static String layTieuDe() {
		return String.format("%-10s %-10s %-25s","First name","Last name","Social security number");
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-25s",firstName,lastName,socialSecurityNumber);
	}
	
	

}
