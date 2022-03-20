package nguyenVanPhu.bai07;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %f", super.toString(), this.weeklySalary);
	}
	 @Override
	public double earnings() {
		return weeklySalary;
	}
		

}
