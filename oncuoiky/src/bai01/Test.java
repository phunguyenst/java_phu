package bai01;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		try {
			DanhSachHoaDon hd = new DanhSachHoaDon();
			hd.themHoaDon(new HoaDonTheoGio("123", LocalDate.of(2018, 5,9), "nguyen van teo", "A11", 200000.00, 16));
			hd.themHoaDon(new HoaDonTheoNgay("133", LocalDate.of(2018, 5,9), "nguyen van phu", "A12", 200000.00, 7));
			
			System.out.println(hd);
			System.out.println("thong ke so hoa don theo gio la: "+ hd.thongKeSoLuongHDTheoGio());
			System.out.println("thong ke so hoa don theo ngay la: "+ hd.thongKeSoLuongHDTheoNgay());
			System.out.println("tinh tong tien thang 9 nam 2018: " + hd.tinhTongThanhTien(5, 2018));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

	}

}
