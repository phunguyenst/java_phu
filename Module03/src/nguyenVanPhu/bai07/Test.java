package nguyenVanPhu.bai07;

public class Test {

	public static void main(String[] args) {
		/*
		SalariedEmployee se = new SalariedEmployee("nguyen", "teo","123", 100000);
		System.out.println(se);
		HourlyEmployee he = new HourlyEmployee("tran", "nhi", "456", 100, 45);
		System.out.println(he);
		System.out.println("luong: " + he.earnings());
		CommissionEmployee ce = new CommissionEmployee("phan", "xi", "789", 4.6, 8.9);
		System.out.println(ce);
		*/
		ListEmployee e = new ListEmployee();
		e.addEmployee(new SalariedEmployee("nguyen", "teo","123", 100000));
		e.addEmployee(new HourlyEmployee("tran", "nhi", "456", 100, 45));
		e.addEmployee(new CommissionEmployee("phan", "xi", "789", 4.6, 8.9));
		e.addEmployee(new BasePlusCommissionEmployee("bui", "nhat", "333", 7.3, 10.2, 10.2));
		System.out.println(e.getInformationEmployee());
		System.out.println("tổng lương CommissionEmployee"+ e.sumCommissionEmployee());
		System.out.println("tổng lương HourlyEmployee"+e.sumHourlyEmployee());
		System.out.println("tổng lương SalariedEmployee"+e.sumSalariedEmployee());
		System.out.println("tổng lương BasePlusCommissionEmployee"+e.sumBasePlusCommissionEmployee());
	}

}
