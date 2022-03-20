package baicuoiky;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachGiaoDich gd = new DanhSachGiaoDich();
		gd.themGiaoDich(new GiaoDichVang("123", LocalDate.of(2018, 3, 14), 200000000, "9999", 20, "chục triệu"));
		gd.themGiaoDich(new GiaoDichVang("634", LocalDate.of(2018, 7, 12), 500000000, "999", 10, "chục triệu"));
		gd.themGiaoDich(new GiaoDichVang("452", LocalDate.of(2018, 8, 11), 300000000, "99", 30, "chục triệu"));
		gd.themGiaoDich(new GiaoDichDaQuy("456", LocalDate.of(2019, 8, 8), 900000000, "kim cương", 8));
		gd.themGiaoDich(new GiaoDichDaQuy("863", LocalDate.of(2019, 6, 4), 700000000, "cẩm thạch", 1));
		gd.themGiaoDich(new GiaoDichDaQuy("538", LocalDate.of(2019, 5, 8), 800000000, "cẩm thạch", 2));
		
		System.out.println("=====Giao Dịch Vàng=====");
		System.out.println(GiaoDich.getTieuDeGiaoDichVang());
		System.out.println(gd.getGiaoDichVang());
		System.out.println("=====Giao Dịch Đá Quý=====");
		System.out.println(GiaoDich.getTieuDeGiaoDichDaQuy());
		System.out.println(gd.getGiaoDichDaQuy());
		
		
	}

}
