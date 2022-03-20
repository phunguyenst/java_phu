package bai3dek14;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		DanhSachNhanVien nv = new DanhSachNhanVien();
		nv.themNhanVien(new NhanVienHopDong("123", "nguyễn văn tèo", LocalDate.of(2018, 5, 8), 21));
		nv.themNhanVien(new NhanVienHopDong("767", "nguyễn văn lão", LocalDate.of(2018, 2, 9), 18));
		nv.themNhanVien(new NhanVienBienChe("456", "nguyễn thị na", LocalDate.of(2015, 3, 6), 3.35, true));
		nv.themNhanVien(new NhanVienBienChe("433", "nguyễn thị sáu", LocalDate.of(2015, 9, 8), 2.75, false));
		nv.themNhanVien(new NhanVienBienChe("578", "nguyễn thị anh", LocalDate.of(2015, 2, 10), 2.65, false));
		
		System.out.println(nv);

	}

}
