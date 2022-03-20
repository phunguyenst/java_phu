package nguyenQuangVinh.bai07;

public class Test {

	public static void main(String[] args) {
		DanhSachEmployee ds= new DanhSachEmployee(100);
		ds.them(new Salaried_Employee("Mark","Zob", "13232145",2000000));
		ds.them(new Salaried_Employee("Bill","Scott", "14235566",1500000));
		
		ds.them(new Hourly_Employee("Tom","Hiddleston","10022154", 1000, 8));
		ds.them(new Hourly_Employee("Louis","Ken","10522154", 20000, 13));
		
		ds.them(new Commission_Employee("Harry","Potter","12345612", 2500000,0.02));
		ds.them(new Commission_Employee("Theo","Man","14545255", 30020000, 0.01));
		
		ds.them(new BasePlus_Employee("John","McCathy","10231522",51925000,0.02,6500000));
		ds.them(new BasePlus_Employee("Mark","Steve","11245522",35123000,0.01,3000000));		
		
		System.out.println("SalariedEmployee");
		System.out.println(Salaried_Employee.layTieuDe());
		System.out.println(ds.getSalariedEmployee());
		
		System.out.println("HourlyEmployee");
		System.out.println(Hourly_Employee.layTieuDe());
		System.out.println(ds.getHourlyEmployee());
		
		System.out.println("CommissionEmployee");
		System.out.println(Commission_Employee.layTieuDe());
		System.out.println(ds.getCommissionEmployee());
		
		System.out.println("BasePlusComissionEmployee");
		System.out.println(BasePlus_Employee.layTieuDe());
		System.out.println(ds.getBasePlusComissionEmployee());

	}

}
