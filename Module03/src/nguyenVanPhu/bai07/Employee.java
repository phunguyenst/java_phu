package nguyenVanPhu.bai07;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		this("chưa biết", "chưa biết","chưa biết");
	}
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
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
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public abstract double earnings();

	@Override
	public String toString() {
		return String.format("%s %s %s ", this.firstName, this.lastName, this.socialSecurityNumber);
	}
	
}
