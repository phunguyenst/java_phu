package bai07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SofwareHouse {
	private List<Employee> list;

	public SofwareHouse() {
		list = new ArrayList<Employee>();
	}

	/**
	 * xuất toàn bộ nhân viên
	 */
	public String xuatEmployee() {
		String s = "";
		for(int i=0; i<list.size(); i++)
			s += list.get(i) + "\n";
		return s;
	}

	/**
	 * Thêm Employee
	 * 
	 * @param e
	 * @return
	 */
	public boolean addEmployee(Employee emp) {
		if (list.contains(emp))
			return false;
		list.add(emp);
		return true;
	}

	/**
	 * xuất Programer
	 * 
	 * @return
	 */
	public String xuatProgramer() {
		String s = "";
		for (int i = 0; i < 2; i++)
			s += list.get(i) + "\n";
		return s;
	}

	/**
	 * xuất Administrator
	 * 
	 * @return
	 */
	public String xuatAdministrator() {
		String s = "";
		for (int i = 2; i < 4; i++)
			s += list.get(i) + "\n";
		return s;
	}

	/**
	 * xuất ProjectLeader
	 * 
	 * @return
	 */
	public String xuatProjectLeader() {
		String s = "";
		for (int i = 4; i < 6; i++)
			s += list.get(i) + "\n";
		return s;
	}

	/**
	 * tính tổng tiền phải trả cho nhân viên
	 * 
	 * @return
	 */
	public double getMonthlySalaryBill() {
		double s = 0;
		for (int i = 0; i < list.size(); i++)
			s += list.get(i).getMonthlySalary();
		return s;
	}

	/**
	 * sắp xếp danh sách nhân viên theo tên
	 */
	public void sortAllStaffByName() {
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareToIgnoreCase(o2.getTheName());
			}
		});
	}

	/**
	 * Trả về thông tin các lập trình viên
	 */
	public String displayListProgrammers() {
		String s = "";
		for (int i = 0; i < 2; i++)
			s += list.get(i) + "\n";
		return s;
	}

	/**
	 * cập nhật phòng ban là deptNew cho người quản lý có mã số là aPayrollNo, trả
	 * về true nếu cập nhật thành công
	 */
	public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew) {
		for(int i=0; i<list.size(); i++)
			if(list.get(i) instanceof Administrator)
				if(list.get(i).getThePayrollNumber() == aPayrollNo) {
					((Administrator) list.get(i)).setTheDepartment(deptNew);
					return true;
				}
		return false;
	}
	
	/**
	 * Xóa employee theo mã 
	 * @param id
	 * @return
	 */
	public boolean deleteEmployee(int id) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getThePayrollNumber() == id) {
				list.remove(i);
			    return true;
			}
		}
		return false;
	}

}
