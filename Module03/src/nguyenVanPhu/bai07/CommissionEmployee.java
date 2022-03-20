package nguyenVanPhu.bai07;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %f %f ", super.toString(), this.grossSales, this.commissionRate);
	}
	@Override 
	public double earnings() {
		return commissionRate * grossSales;
	}
	
}
