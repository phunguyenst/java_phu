package nguyenQuangVinh.bai07;

public class  Salaried_Employee extends Employee{
	private double weeklySalary; //sotien hang tuan
	

	/**
	 * @return the weeklySalary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	}


	/**
	 * @param weeklySalary the weeklySalary to set
	 */
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	public Salaried_Employee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(weeklySalary);
	}
	
	





	


	@Override
	public double earning() {
		
		return weeklySalary;
	}

	public static String layTieuDe() {
		return String.format("%s %15s %15s",Employee.layTieuDe(),"Weekly salary","Earning");
	}
	@Override
	public String toString() {
		return String.format("%s %15.2f %15.2f",super.toString(),weeklySalary,earning());
	}
	

}
