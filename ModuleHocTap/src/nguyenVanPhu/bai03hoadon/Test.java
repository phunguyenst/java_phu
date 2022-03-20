package nguyenVanPhu.bai03hoadon;

import java.time.LocalDate;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		DanhSachHoaDon hd = new DanhSachHoaDon();
		HoaDon hd1 = new KhachHangVietNam("123", "Nguyễn văn tèo", LocalDate.of(2018, 3, 5), 50, 250000.00, "sinh hoạt", 120);
		HoaDon hd2 = new KhachHangVietNam("456", "Nguyễn văn hai", LocalDate.of(2018, 4, 5), 50, 450000.00, "sản xuất", 220);
		HoaDon hd3 = new KhachHangVietNam("789", "Nguyễn văn ba", LocalDate.of(2018, 9, 5), 50, 350000.00, "kinh doanh", 190);
		HoaDon hd4 = new KhachHangNuocNgoai("133", "join biden", LocalDate.of(2018, 9, 21), 36, 200000.00, "america");
		HoaDon hd5 = new KhachHangNuocNgoai("144", "join huo", LocalDate.of(2018, 2, 21), 39, 300000.00, "america");
		HoaDon hd6 = new KhachHangNuocNgoai("155", "shinjiro", LocalDate.of(2018, 3, 21), 56, 320000.00, "japan");
		
		hd.themHoaDon(hd1);
		hd.themHoaDon(hd2);
		hd.themHoaDon(hd3);
		hd.themHoaDon(hd4);
		hd.themHoaDon(hd5);
		hd.themHoaDon(hd6);
		System.out.println(hd);
		
		List<HoaDon> kq = hd.getHoaDonTheoDe();
		for (HoaDon hoaDon : kq) {
			System.out.println(hoaDon.toString());
		}
	}

}
