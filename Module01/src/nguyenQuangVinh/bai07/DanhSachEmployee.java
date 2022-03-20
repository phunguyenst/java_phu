package nguyenQuangVinh.bai07;

public class DanhSachEmployee {
	private Employee[] danhSach;
	private int count;
	
	
	public DanhSachEmployee(int n) {
		danhSach= new Employee[n];
		count=0;
	}


	public boolean them(Employee e) {
		if(count<danhSach.length) {
			danhSach[count++]=e;
			return true;
		}
		return false;
	}
	public String getHourlyEmployee() {
		String s="";
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof Hourly_Employee) {
				s+=danhSach[i]+"\n";
			}
		}
		return s;
	}
	public String getCommissionEmployee() {
		String s="";
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof BasePlus_Employee)
				s += "";
			else if(danhSach[i] instanceof Commission_Employee) {
				s+=danhSach[i]+"\n";
			}
		}
		return s;
	}
	public String getSalariedEmployee() {
		String s="";
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof Salaried_Employee) {
				s+=danhSach[i]+"\n";
			}
		}
		return s;
	}
	public String getBasePlusComissionEmployee() {
		String s="";
		for (int i = 0; i < count; i++) {
			if(danhSach[i] instanceof BasePlus_Employee) {
				s+=danhSach[i]+"\n";
			}
		}
		return s;
	}

}
