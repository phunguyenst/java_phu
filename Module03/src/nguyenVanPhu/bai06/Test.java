package nguyenVanPhu.bai06;

import java.time.LocalDate;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DanhSachHoaDon hd = new DanhSachHoaDon(6);
			hd.them(new HoaDonTheoGio("123", LocalDate.of(2021, 9, 30), "Nguyen van teo", "A11", 2000000, 7));
			hd.them(new HoaDonTheoGio("456", LocalDate.of(2021, 10, 30), "Nguyen van hung", "A12", 2000000, 29));
			hd.them(new HoaDonTheoGio("789", LocalDate.of(2021, 10, 30), "Nguyen van ti", "A13", 2000000, 25));
			hd.them(new HoaDonTheoNgay("321", LocalDate.of(2021, 10, 31), "Tran teo", "B11", 3000000, 8));
			hd.them(new HoaDonTheoNgay("654", LocalDate.of(2021, 10, 31), "Tran ngon", "B12", 3000000, 2));
			hd.them(new HoaDonTheoNgay("987", LocalDate.of(2021, 10, 31), "Tran tuoi", "B13", 3000000, 3));
			System.out.println(HoaDon.getTieuDe());
			System.out.println(hd);
			System.out.println("Số lượng hóa đơn theo giờ là: " + hd.thongKeSoLuongHDTheoGio());
			System.out.println("Số lượng hóa đơn theo ngày là: "+ hd.thongKeSoLuongHDTheoNgay());
			System.out.println("tổng thành tiền là: " + hd.tinhTongThanhTien(9, 2021));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		
	}

}
