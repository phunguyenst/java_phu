package bai07;

public class Programmer extends Employee{
	private String TheLanguage;
	
	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		TheLanguage = theLanguage;
	}
	
	public String getTheLanguage() {
		return TheLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		TheLanguage = theLanguage;
	}
	
	@Override
	public String toString() {
		return String.format(super.toString() + "   %-10s", TheLanguage);
	}
	
	@Override
	/**
     * Nếu ngôn ngữ lập trình là “Java” thì phụ cấp 20% của lương cơ bản
     */
	public double getMonthlySalary() {
		if(TheLanguage.equalsIgnoreCase("Java"))
			return getTheBasicMonthlySalary() + (getTheBasicMonthlySalary() * 20 / 100);
		else
			return getTheBasicMonthlySalary();
	}
	

}
