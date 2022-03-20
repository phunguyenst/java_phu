package nguyenVanPhu.bai02giaodichnhadatlist;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		//GiaoDich gd = new GiaoDich("123", LocalDate.of(2018, 12, 25), 250000000.00, 125);
		DanhSachGiaoDich gd = new DanhSachGiaoDich();
		GiaoDichDat gd1 = new GiaoDichDat("123", LocalDate.of(2018, 12, 25), 250000000.00, 125, "B");
		GiaoDichNha gd2 = new GiaoDichNha("456", LocalDate.of(2018, 12, 24), 300000000.00, 130, "cao cấp", "32,tổ 9");
		gd.themMotGiaoDich(gd1);
		gd.themMotGiaoDich(gd2);
		System.out.println(gd);
	}

}
