package nguyenVanPhu.bai03hoadon;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHoaDon {
	private List<HoaDon> dsHoaDon;
	
	public DanhSachHoaDon() {
		dsHoaDon = new ArrayList<HoaDon>();
	}
	public boolean themHoaDon(HoaDon hd) {
		if(dsHoaDon.contains(hd))
		{
			return false;
		}
		else 
			dsHoaDon.add(hd);
			return true;
	}
	public String toString() {
		String s = "";
		for (HoaDon hoaDon : dsHoaDon) {
			s += hoaDon + "\n";
			
		}
		return s;
	}
	public int tongSoLuongKhachHangVietNam() {
		int count = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof KhachHangVietNam)
				count ++;
		}
		return count;
	}
	public int tongSoLuongKhachHangNuocNgoai() {
		int count = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof KhachHangNuocNgoai)
				count ++;
		}
		return count;
	}
	public double tinhTongTienKhachHangNuocNgoai() {
		double s = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof KhachHangNuocNgoai)
			{
				s += hoaDon.tinhThanhTien();
			}
		}
		return s;
	}
	public double tinhTrungBinhThanhTienCuaKhachHangNuocNgoai() {
		double s = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof KhachHangNuocNgoai )
				s = tinhTongTienKhachHangNuocNgoai()/tongSoLuongKhachHangNuocNgoai();
		}
		return s;
	}
	public List<HoaDon> getHoaDonTheoDe(){
		List<HoaDon> hd = new ArrayList<HoaDon>();
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon.getNgayLapHoaDon().getMonthValue()==9 && hoaDon.getNgayLapHoaDon().getYear()==2018)
			{
				hd.add(hoaDon);
			}
		}
		return hd;
	}
}
