package bai07;

public class ProjectLeader extends Programmer{
	

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}

	@Override
	/**
	 * Phụ cấp 20% lương cơ bản
	 */
	public double getMonthlySalary() {
		return getTheBasicMonthlySalary() + (getTheBasicMonthlySalary() * 20 / 100);
	}
	
	

}
