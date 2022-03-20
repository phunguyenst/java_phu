package huynhQuocBao.bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachPhongHoc {
	private ArrayList<PhongHoc> dsPhongHoc;
	
	public DanhSachPhongHoc() {
		dsPhongHoc = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhongHoc(PhongHoc ph) {
		for(PhongHoc i: dsPhongHoc) {
			if (i.getMaPhong() == ph.getMaPhong()) {
				return false;
			}
		}
		dsPhongHoc.add(ph);
		return true;
	}
	
	public PhongHoc timKiemPhongHoc(int maPhong) {
		for(PhongHoc i: dsPhongHoc) {
			if (i.getMaPhong() == maPhong) {
				return i;
			}
		}
		return null;
	}
	
	public String toString() {
		String ds = "";
		for (PhongHoc i: dsPhongHoc) {
			ds += i.toString() + "\n";
		}
		return ds; 
	}
	
	public DanhSachPhongHoc layDsDatChuan() {
		DanhSachPhongHoc dsDatChuan = new DanhSachPhongHoc();
		for (PhongHoc i: dsPhongHoc) {
			if (i.kiemTraDatChuan()) 
				dsDatChuan.themPhongHoc(i);
		}
		return dsDatChuan;
	}
	
	public void sapXepTangTheoDayNha() {
		Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
	}
	
	public void sapXepGiamTheoDienTich() {
		Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc::getDienTich).reversed());
	}
	
	public void sapXepTangTheoSoBongDen() {
		Collections.sort(dsPhongHoc, Comparator.comparing(PhongHoc::getSoBongDen));
	}
	
	public boolean capNhatSoMayTinh(int maPhong, int soMayTinh) {
		for (PhongHoc i: dsPhongHoc) {
			if (i.getMaPhong() == maPhong) {
				if (i instanceof PhongMayTinh) {
					((PhongMayTinh) i).setSoMayTinh(soMayTinh);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean xoaPhongHoc(int maPhong) {
		for (PhongHoc i: dsPhongHoc) {
			if (i.getMaPhong() == maPhong) {
				dsPhongHoc.remove(dsPhongHoc.indexOf(i));
				return true;
			}
		}
		return false;
	}
	
	public int tinhTongSoPhongHoc() {
		return dsPhongHoc.size();
	}
	
	public DanhSachPhongHoc layDsPhong60May() {
		DanhSachPhongHoc ds = new DanhSachPhongHoc();
		for (PhongHoc i: dsPhongHoc) {
			if (i instanceof PhongMayTinh && ((PhongMayTinh) i).getSoMayTinh() == 60) {
				ds.themPhongHoc(i);
			}
		}
		return ds;
	}
}
