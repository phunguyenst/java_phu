package nguyenVanPhu.bai07;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SoftwareHouse sh = new SoftwareHouse();
		sh.addEmployee(new Programmer(1, "văn phú", 5500000, "Java"));
		sh.addEmployee(new Programmer(2, "tèo nguyễn", 330000, "Python"));
		sh.addEmployee(new Administrator(3, "trùm nood", 200000, "Design"));
		sh.addEmployee(new Administrator(4, "nguyễn hiền", 60000, "Testter"));
		sh.addEmployee(new ProjectLeader(5, "kim ngân", 30000, "C++"));
		sh.addEmployee(new ProjectLeader(6, "alice", 1200000, "C"));
		
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
				System.out.println(sh.getProgramer());
				System.out.println("=====Administrator=====");
				System.out.println(Employee.getTieuDeAdministrator());
				System.out.println(sh.getAdministrator());
				System.out.println("=====ProjectLeader=====");
				System.out.println(Employee.getTieuDeProjectLeader());
				System.out.println(sh.getProjectLeader());
				break;
			}
			case 2:{
				System.out.println("Tổng tiền lương của nhân viên: " + sh.getMonthlySalaryBill());
				break;
			}
			case 3:{
				System.out.println("Danh sách sau khi sắp xếp các nhân viên theo tên");
				sh.sortAllStaffByName();
				System.out.println(sh.displayAllStaff());
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
					System.out.println(sh.displayAllStaff());
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
					System.out.println(sh.displayAllStaff());
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


