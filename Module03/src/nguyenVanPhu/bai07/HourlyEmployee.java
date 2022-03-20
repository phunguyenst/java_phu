package nguyenVanPhu.bai07;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return String.format("%s %f %f", super.toString(), this.wage, this.hours);
	}
	
	@Override 
	public double earnings() {
		double s = 0;
		if(hours <= 40)
		{
			s = hours * wage;
		}
		else if(hours >40)
		{
			s = 40 * wage + (hours -40) * wage * 1.5;
		}
		return s;
	}

}
