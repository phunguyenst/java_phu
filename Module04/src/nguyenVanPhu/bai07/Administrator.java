package nguyenVanPhu.bai07;

public class Administrator extends Employee {
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
	/*
	 * Người quản lý: Phụ cấp 40% của lương cơ bản
	 */
	@Override
	public double getMonthlySalary() {
		return getTheBasicMonthlySalary() +(getTheBasicMonthlySalary()*0.4);
	}

	@Override
	public String toString() {
		return String.format("%s %12s", super.toString(), this.theDepartment);
	}

}
