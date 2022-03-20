package nguyenQuangVinh.bai07;
//ke thua lop commision_Employee de tinh luong
public class BasePlus_Employee extends Commission_Employee{
	private double baseSalary; //luong can ban
	

	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}


	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	


	


	public BasePlus_Employee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}


	@Override
	public double earning() {
		
		return super.earning()+baseSalary; 
	}
	public static String layTieuDe() {
		return String.format("%s %15s",Commission_Employee.layTieuDe(),"Base salary");
	}
	@Override
	public String toString() {
		return String.format("%s %15.2f",super.toString(),baseSalary);
	}

}
