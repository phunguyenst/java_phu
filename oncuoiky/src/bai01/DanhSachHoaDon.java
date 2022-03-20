package bai01;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHoaDon {
	private List<HoaDon> dsHoaDon;
	
	public DanhSachHoaDon() {
		dsHoaDon = new ArrayList<HoaDon>();
	}
	public boolean themHoaDon(HoaDon hd) {
		if(dsHoaDon.contains(hd))
			return false;
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
	public int thongKeSoLuongHDTheoGio() {
		int count = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof HoaDonTheoGio)
			{
				count ++;
			}
		}
		return count;
	}
	public int thongKeSoLuongHDTheoNgay() {
		int count = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if(hoaDon instanceof HoaDonTheoNgay)
			{
				count ++;
			}
		}
		return count;
	}
	public double tinhTongThanhTien(int thang, int nam) {
		double sum = 0;
		for (HoaDon hoaDon : dsHoaDon) {
			if( hoaDon.getNgayHoaDon().getMonthValue()== thang && hoaDon.getNgayHoaDon().getYear()==nam) {
				sum += hoaDon.tinhThanhTien();
			}
		}
		return sum;
	}
}
