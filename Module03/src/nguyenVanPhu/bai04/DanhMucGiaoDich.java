package nguyenVanPhu.bai04;

import java.util.ArrayList;
import java.util.List;

public class DanhMucGiaoDich {
	private GiaoDich[] list;
	private int count;

	public DanhMucGiaoDich(int n) {
		list = new GiaoDich[n];
		count = 0;
	}

	public boolean themGiaoDich(GiaoDich gd) {
		if (count < list.length) {
			list[count++] = gd;
			return true;

		} else
			return false;
	}

	public String layThongTinDanhMuc() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += list[i] + "\n";
		}
		return s;
	}

	public int tongSoLuongGiaoDichDat() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichDat) {
				dem++;
			}
		}
		return dem;
	}

	public int tongSoLuongGiaoDichNha() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichNha) {
				dem++;
			}
		}
		return dem++;
	}

	public double tinhThanhTienGiaoDichDat() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichDat) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;
	}

	public double tinhThanhTienGiaoDichNha() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichNha) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;
	}

	public double tinhTrungBinhThanhTienGiaoDichDat() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			s = tinhThanhTienGiaoDichDat() / tongSoLuongGiaoDichDat();

		}
		return s;
	}

	public String xuatCacGiaoDich() {
		String s = "";

		for (int i = 0; i < count; i++) {

			if (list[i].getNgayGD().getMonthValue() == 9 && list[i].getNgayGD().getYear() == 2013) {
				s += list[i] + "\n";
			}

		}

		return s;
	}

	public boolean xoaDanhMucTheoMa(String maGiaoDich) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaGD().equalsIgnoreCase(maGiaoDich)) {
				for (int j = i; j < count - 1; j++)
					list[j] = list[j + 1];
				count--;

				return true;
			}
		}
		return false;
	}

	public boolean timKiemGiaoDichTheoMa(String maGiaoDich) {

		for (int i = 0; i < count; i++)
			if (list[i].getMaGD().equalsIgnoreCase(maGiaoDich))
				return true;
		return false;
	}
public void suaGiaoDichTheoMa(String maGiaoDich, String maCanSua) {
		
		for (int i = 0; i < count; i++) {
			if(list[i].getMaGD().equalsIgnoreCase(maGiaoDich))
				 list[i].setMaGD(maCanSua);
		}
	}
}
