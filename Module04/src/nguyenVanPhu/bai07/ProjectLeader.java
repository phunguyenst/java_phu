package nguyenVanPhu.bai07;

public class ProjectLeader extends Programmer {

	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Người trưởng dự án: Phụ cấp 20% lương cơ bản
	 */
	@Override
	public double getMonthlySalary() {
		return getTheBasicMonthlySalary() + (getTheBasicMonthlySalary() * 0.2);
	}


}
