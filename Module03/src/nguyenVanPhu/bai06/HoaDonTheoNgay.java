package nguyenVanPhu.bai06;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;

	public HoaDonTheoNgay() {
		super();
		soNgayThue = 0;
	}
	
	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		if(soNgayThue>0)
		{
			this.soNgayThue = soNgayThue;
		}
		this.soNgayThue = 0;
	}

	@Override
	public double tinhThanhTien() {
		double s = 0;
		if(soNgayThue>7) {
			s =  (7*getDonGia())+ ((soNgayThue-7) *( getDonGia() *0.8));
		}
		else 
			s = getDonGia() * soNgayThue;
		return s;
		
	}

	@Override
	public String toString() {
		return String.format("%s số ngày thuê: %12d", super.toString(), this.soNgayThue);
	}
	
	
	
}
