package nguyenVanPhu.bai05;

import java.time.LocalDate;

public class HoaDonKhachHangVietNam extends HoaDon {
	/**
	 * thuộc tính
	 */
	private String doiTuongKhachHang;
	private double dinhMuc;

	/**
	 * phương thức
	 */
	public HoaDonKhachHangVietNam() {
		super();
		doiTuongKhachHang = "chưa biết";
		dinhMuc = 0;
	}

	public HoaDonKhachHangVietNam(String maKH, String hoTen, LocalDate ngayLapHD, double donGia, double soKWTieuThu,
			String doiTuongKhachHang, double dinhMuc) {
		super(maKH, hoTen, ngayLapHD, donGia, soKWTieuThu);
		this.doiTuongKhachHang = doiTuongKhachHang;
		this.dinhMuc = dinhMuc;
	}

	public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}

	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		this.doiTuongKhachHang = doiTuongKhachHang;
	}

	public double getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	public double tinhThanhTien(double soKWVuotDinhMuc) {
		double s = 0;
		if (super.getSoKWTieuThu() < dinhMuc) {
			s = super.getSoKWTieuThu() * super.getDonGia();
		} else {
			s = super.getSoKWTieuThu() * super.getDonGia() * dinhMuc + soKWVuotDinhMuc * super.getDonGia() * 2.5;
		}
		return s;
	}

	@Override
	public String toString() {
		return String.format("%s %-12s %-10.2f", super.toString(), this.doiTuongKhachHang, this.dinhMuc);
	}

}
