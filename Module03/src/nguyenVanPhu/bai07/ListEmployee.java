package nguyenVanPhu.bai07;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
	private List<Employee> list;
	
	public ListEmployee() {
		list = new ArrayList<Employee>();
	}
	public boolean addEmployee(Employee e) {
		if(list.contains(e))
			return false;
		else
			list.add(e);
		return true;
	}
	public String getInformationEmployee() {
		String s = "";
		for (Employee e : list) {
			s += e +"\n";
		}
		return s;
	}
	public double sumCommissionEmployee() {
		double s = 0;
		for (Employee employee : list) {
			if(employee instanceof CommissionEmployee)
				s += employee.earnings();
		}
		return s;
	}
	public double sumSalariedEmployee() {
		double s = 0;
		for (Employee employee : list) {
			if(employee instanceof SalariedEmployee)
				s += employee.earnings();
		}
		return s;
	}
	public double sumHourlyEmployee() {
		double s = 0;
		for (Employee employee : list) {
			if(employee instanceof HourlyEmployee)
				s += employee.earnings();
		}
		return s;
	}
	public double sumBasePlusCommissionEmployee() {
		double s = 0;
		for (Employee employee : list) {
			if(employee instanceof BasePlusCommissionEmployee)
				s += employee.earnings();
		}
		return s;
	}
}
