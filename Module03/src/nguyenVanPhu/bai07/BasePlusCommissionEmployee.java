package nguyenVanPhu.bai07;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return String.format("%s %s", super.toString(), this.baseSalary);
	}
	@Override 
	public double earnings() {
		return (super.getGrossSales() * super.getCommissionRate()) +baseSalary;
	}
	
}
