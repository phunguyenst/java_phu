package nguyenQuangVinh.bai07;

public class Commission_Employee extends Employee {
	private double grossSales, commissionRate;
	//doanh so ban han & phan tram hoa hong

	/**
	 * @return the grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	}


	/**
	 * @param grossSales the grossSales to set
	 */
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}


	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}


	public Commission_Employee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}


	@Override
	public double earning() {
		
		return commissionRate*grossSales;
	}
	public static String layTieuDe() {	
		return String.format("%s %15s %15s %15s",Employee.layTieuDe(),"Gross sales","Commission rate","Earning");	
	}
	@Override
	public String toString() {
		return String.format("%s %15.2f %15.2f %15.2f",super.toString(),grossSales,commissionRate,earning());
	}
	

}
