package nguyenVanPhu.bai07;

public class Programmer extends Employee{
	protected String theLanguage ;
	
	

	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}
/*
 * Lập trình viên: Nếu ngôn ngữ lập trình là “Java” thì phụ cấp 20% của lương cơ bản
 */
	@Override
	public double getMonthlySalary() {
		if(theLanguage.equalsIgnoreCase("java")) {
			return getTheBasicMonthlySalary()+ (0.2*getTheBasicMonthlySalary());
		}
		return getTheBasicMonthlySalary();
	}

	@Override
	public String toString() {
		return String.format("%s %10s", super.toString(), this.theLanguage);
	}
	
	
}
