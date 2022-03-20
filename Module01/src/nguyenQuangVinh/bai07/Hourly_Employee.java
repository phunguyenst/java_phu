package nguyenQuangVinh.bai07;

public class Hourly_Employee extends Employee   {
	private double wage; //so tien/gio
	private double hours;
	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}
	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}
	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public Hourly_Employee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}
	@Override
	public double earning() {
		if(hours <=40)
			return wage*hours;
		else if(hours >40)
			return 40*wage+(hours-40)*wage*1.5;
		return hours;
		
	}
	public static String layTieuDe() {
		return String.format("%s %10s %15s %15s",Employee.layTieuDe(),"Hours","Wage","Earning");
	}
	@Override
	public String toString() {
		return String.format("%s %10.2f %15.2f %15.2f",super.toString(),hours,wage,earning());
	}

}
