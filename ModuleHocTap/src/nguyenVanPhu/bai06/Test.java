package nguyenVanPhu.bai06;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		DanhSachPhongHoc ph = new DanhSachPhongHoc();
		PhongHoc ph1 = new PhongLyThuyet("123", "A11", 125, 10, true);
		PhongHoc ph2 = new PhongMayTinh("456", "B13", 135, 13, 70);
		PhongHoc ph3 = new PhongThiNghiem("789", "A12", 150, 11, "CNTT", 90, true);
		ph.themPhongHoc(ph1);
		ph.themPhongHoc(ph2);
		ph.themPhongHoc(ph3);
		System.out.println(ph);
		List<PhongHoc> kq = ph.sapXepDanhSachTangDanTheoDayNha();
		for (PhongHoc phongHoc : kq) {
			System.out.println(phongHoc);
		}
		

	}

}
