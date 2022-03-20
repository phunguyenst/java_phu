package nguyenVanPhu.bai03;

import java.util.ArrayList;
import java.util.List;

public class DanhMucGiaoDich {
	private GiaoDich[] list;
	private int count;
	public DanhMucGiaoDich(int n) {
		list = new GiaoDich[n];
		count = 0;
	}
	public boolean themDanhMucGiaoDich(GiaoDich gd) {
		if(count<list.length)
		{
			list[count++]= gd;
			return true;
		}
		else
			return false;
	}
	public String layThongTinDanhMuc() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s+= list[i] + "\n";
		}
		return s;
	}

	public int tongSoLuongGiaoDichVang() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichVang)
				dem++;
		}
		return dem;
	}

	public int tongSoLuongGiaoDichTienTe() {
		int dem = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichTienTe)
				dem++;
		}
		return dem;
	}

	public double tinhThanhTienGiaoDichTienTe() {
		double s = 0;
		for (int i = 0; i < count; i++) {
			if (list[i] instanceof GiaoDichTienTe) {
				s += list[i].tinhThanhTien();
			}
		}
		return s;

	}

	public double tinhTrungBinhThanhTienGiaoDichTienTe() {
		double s = 0;
		for (int i = 0; i < count; i++) {

			s = tinhThanhTienGiaoDichTienTe() / tongSoLuongGiaoDichTienTe();
		}
		return s;
	}

	public List<GiaoDich> soLuongGiaoDichMotTy() {
		List<GiaoDich> kq = new ArrayList<GiaoDich>();
		for (int i = 0; i < count; i++) {
			if (list[i].getDonGia() > 1000000000.00) {
				kq.add((GiaoDich)list[i]) ;
			}

		}
		return kq;

	}
	public boolean xoaGiaoDichTheoMa(String maGiaoDich) {
		for (int i = 0; i < count; i++) {
			if (list[i].getMaGiaoDich().equalsIgnoreCase(maGiaoDich)) {
				for (int j = i; j < count - 1; j++)
					list[j] = list[j + 1];
				count--;

				return true;
			}
		}
		return false;
	}
	public boolean timKiemGiaoDichTheoMa(String maGiaoDich) {
		
		for (int i = 0; i <count; i++) 
			if(list[i].getMaGiaoDich().equalsIgnoreCase(maGiaoDich)) 
				return true;
			return false;
	}
public void suaGiaoDichTheoMa(String maGiaoDich, String maCanSua) {
		
		for (int i = 0; i < count; i++) {
			if(list[i].getMaGiaoDich().equalsIgnoreCase(maGiaoDich))
				 list[i].setMaGiaoDich(maCanSua);
		}
	}
}
