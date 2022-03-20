package bai07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0$");
		SofwareHouse sh = new SofwareHouse();
		sh.addEmployee(new Programmer(1, "Tuan", 10000, "Java"));
		sh.addEmployee(new Programmer(2, "Tinh", 5000, "Python"));
		sh.addEmployee(new Administrator(3, "Gam", 4000, "Design"));
		sh.addEmployee(new Administrator(4, "Thao", 4000, "Testter"));
		sh.addEmployee(new ProjectLeader(5, "Hau", 8000, "C++"));
		sh.addEmployee(new ProjectLeader(6, "Yen", 6000, "C"));
		System.out.println("======Software House======");
		System.out.println("1. In danh sách các nhân viên");
		System.out.println("2. Tính tổng tiền lương nhân viên");
		System.out.println("3. Sắp xếp danh sách các nhân viên theo tên");
		System.out.println("4. Trả về thông tin lập trình viên");
		System.out.println("5. Cập nhật phòng ban theo mã nhân viên");
		System.out.println("6. Xóa nhân viên theo mã");
		System.out.println("7. Thoát");
		while(true) {
			System.out.println("\nNhập lựa chọn của bạn: ");
			int chon  = sc.nextInt();
			switch(chon) {
			case 1:{
				System.out.println("=====Programmer=====");
				System.out.println(Employee.getTieuDeProgrammer());
				System.out.println(sh.xuatProgramer());
				System.out.println("=====Administrator=====");
				System.out.println(Employee.getTieuDeAdministrator());
				System.out.println(sh.xuatAdministrator());
				System.out.println("=====ProjectLeader=====");
				System.out.println(Employee.getTieuDeProjectLeader());
				System.out.println(sh.xuatProjectLeader());
				break;
			}
			case 2:{
				System.out.println("Tổng tiền lương của nhân viên: " + df.format(sh.getMonthlySalaryBill()));
				break;
			}
			case 3:{
				System.out.println("Danh sách sau khi sắp xếp các nhân viên theo tên");
				sh.sortAllStaffByName();
				System.out.println(sh.xuatEmployee());
				break;
			}
			case 4:{
			    System.out.println("Thông tin các nhân viên Programmer: ");
			    System.out.println(sh.displayListProgrammers());
			    break;
			}
			case 5:{
				System.out.println("Nhập mã Administrator: ");
				int aPayrollNo = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhập phòng ban mới của Administrator: ");
				String deptNew = sc.nextLine();
				if(sh.updateDepartmentForAdmin(aPayrollNo, deptNew)) {
					System.out.println("Danh sách sau khi cập nhật");
					System.out.println(sh.xuatEmployee());
				}
				else
					System.out.println("Không tim thấy aPayrollNo!");
				break;
					
			}
			case 6:{
				System.out.println("Nhập id nhân viên cần xóa: ");
				int id = sc.nextInt();
				boolean kq = sh.deleteEmployee(id);
				if(kq == true) {
					System.out.println("Đã xóa xong\nDanh sách nhân viên sau khi xóa: ");
					System.out.println(sh.xuatEmployee());
				}
				else
					System.out.println("Không tìm thấy id!");
				break;
			}
			case 7:{
				System.out.println("Thoát thành công!");
				sc.close();
				return;
			}
			default:
				System.out.println("Nhập các lựa chọn có trong menu!");
			}
		}

	}

}
