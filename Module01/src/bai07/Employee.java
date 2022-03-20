package bai07;

import java.text.DecimalFormat;

public abstract class Employee {
	private final int thePayrollNumber;
	private String theName;
	private double theBasicMonthlySalary;

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
	    return String.format("%s %5s %20s %10s", "Number", "Name", "BasicMonthlySalary", "Language");
	}
	
	public static String getTieuDeAdministrator() {
	    return String.format("%s %5s %20s %12s", "Number", "Name", "BasicMonthlySalary", "Department");
	}
	
	public static String getTieuDeProjectLeader() {
	    return String.format("%s %5s %20s %10s", "Number", "Name", "BasicMonthlySalary", "Language");
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0$");
		return String.format("%5d   %-10s %14s", thePayrollNumber, theName, df.format(theBasicMonthlySalary));
	}
	
	public abstract double getMonthlySalary();
	
	

}
