package nguyenVanPhu.bai02;

/*
 * Trong hàm main, tạo sẵn mỗi loại 3 cuốn sách vào danh sách (không cần cho nhập từ bàn phím), sau đó:
	o Tính tổng thành tiền cho từng loại.
	o Xuất ra các sách giáo khoa của nhà xuất bản K (yêu cầu nhập K).
	o Tìm thành tiền cao nhất.
 */
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DanhMucSach dms = new DanhMucSach(100);
		dms.themLoaiSach(new SachGiaoKhoa("123", LocalDate.of(2021, 10, 18), 32000.00, 2, "kim dong", true));
		dms.themLoaiSach(new SachGiaoKhoa("456", LocalDate.of(2021, 10, 18), 42000.00, 5, "tuoi tre", true));
		dms.themLoaiSach(new SachGiaoKhoa("789", LocalDate.of(2021, 10, 18), 52000.00, 3, "kim dong", true));
		dms.themLoaiSach(new SachThamKhao("123", LocalDate.of(2021, 10, 18), 60000.00, 3, "hoc tot", 5000.00));
		dms.themLoaiSach(new SachThamKhao("456", LocalDate.of(2021, 10, 18), 70000.00, 3, "hoc tot", 5000.00));
		dms.themLoaiSach(new SachThamKhao("789", LocalDate.of(2021, 10, 18), 80000.00, 3, "hoc tot", 5000.00));
		System.out.println(dms.layThongTinDanhMuc());
		System.out.println("Tổng thành tiền sách giáo khoa là: " + dms.tinhThanhTienSachGiaoKhoa());
		System.out.println("Tổng thành tiền sách tham khảo là: " + dms.tinhThanhTienSachThamKhao());
		System.out.println("Thành tiền lớn nhất là: " + dms.thanhTienLonNhat());
		System.out.println("nhập nhà xuất bản cần tìm: ");
		Scanner sc = new Scanner(System.in);
		String nhaXuatBan = sc.nextLine();
		List<SachGiaoKhoa> kq = dms.getSachGiaoKhoa(nhaXuatBan);
		for (SachGiaoKhoa sachGiaoKhoa : kq) {
			System.out.println(sachGiaoKhoa);
		}
		System.out.print("Nhập mã sách cần tìm:");
		
		String maSach = sc.nextLine();
		if(!dms.timKiemLoaiSachTheoMa(maSach))
			System.out.println("Không tìm thấy!");
		else
		{
			System.out.println("tìm thấy");
		}
		System.out.println("Nhập mã sách cần xóa: ");
		String maS = sc.nextLine();
		if(dms.xoaLoaiSachTheoMa(maS)) {
			System.out.println("mã sách sau khi xóa: "+ dms.layThongTinDanhMuc());
			
		}
		System.out.println("nhập mã sách cần sửa: ");
		String MS = sc.nextLine();
		System.out.println("nhập số cần sửa lại: ");
		String maSachCanSua = sc.nextLine();
		dms.suaLoaiSachTheoMa(MS, maSachCanSua);
		System.out.println(dms.layThongTinDanhMuc());
	}
}
