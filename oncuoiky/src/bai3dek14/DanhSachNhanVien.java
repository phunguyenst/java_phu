package bai3dek14;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhanVien {
	private List<NhanVien> dsNhanVien;
	
	public DanhSachNhanVien() {
		dsNhanVien = new ArrayList<NhanVien>();
	}
	public boolean themNhanVien(NhanVien nv) {
		if(dsNhanVien.contains(nv))
			return false;
		else
			dsNhanVien.add(nv);
			return true;
	}
	public String toString() {
		String s = "";
		for (NhanVien nhanVien : dsNhanVien) {
			s+= nhanVien +"\n";
		}
		return s;
	}
	public boolean suaNgayCongNhan(String maNhanVien, int soNgayMoi) {
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien instanceof NhanVienHopDong)
			{
				if(nhanVien.getMaNhanVien().equalsIgnoreCase(maNhanVien)) {
					((NhanVienHopDong) nhanVien).setSoNgayCongTrenThang(soNgayMoi);
					return true;
				}
			}
		}
		return false;
		
	}
	public ArrayList<NhanVien> getNhanVienKhongDungTienDo(){
		ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien instanceof NhanVienBienChe) {
				if(((NhanVienBienChe) nhanVien).isTrangThai()==false) {
					nv.add(nhanVien);
				}
			}
			
		}
		return nv;
	}
	public double tinhTongTienLuong() {
		double s = 0;
		for (NhanVien nhanVien : dsNhanVien) {
			s += nhanVien.tinhTienLuong();
		}
		return s;
	}
}
