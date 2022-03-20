package simpleassociation;

public class Address {

	private String streetAddress;
	private String city;
	private String state;
	private long zipCode;

	public Address(String streetAddress, String city, String state, long zipCode) {
		super();
		setStreetAddress(streetAddress);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return String.format("%s , %s , %s , %d", this.streetAddress, this.city, this.state, this.zipCode);
	}

}
