package bai07;

public class Administrator extends Employee{
	private String theDepartment;

	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "   %-10s", theDepartment);
	}

	@Override
	/**
	 * Phụ cấp 40% của lương cơ bản
	 */
	public double getMonthlySalary() {
		return getTheBasicMonthlySalary() + (getTheBasicMonthlySalary() * 40 / 100);
	}
	
	
	
	

}
