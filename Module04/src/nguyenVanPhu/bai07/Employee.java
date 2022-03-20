package nguyenVanPhu.bai07;

import java.text.DecimalFormat;

public abstract class Employee {
	protected final int  thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	
	

	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) {
		super();
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}
	public static String getTieuDeProgrammer() {
	    return String.format("%-10s %-15s %-20s %10s", "Number", "Name", "BasicMonthlySalary", "Language");
	}
	
	public static String getTieuDeAdministrator() {
	    return String.format("%-10s %-15s %-20s %12s", "Number", "Name", "BasicMonthlySalary", "Department");
	}
	
	public static String getTieuDeProjectLeader() {
	    return String.format("%-10s %-15s %-20s %10s", "Number", "Name", "BasicMonthlySalary", "Language");
	}

	public abstract double getMonthlySalary();

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0$");
		return String.format("%10d %-15s %-20s", this.thePayrollNumber, this.theName, df.format(theBasicMonthlySalary));
	}
	
	
}
