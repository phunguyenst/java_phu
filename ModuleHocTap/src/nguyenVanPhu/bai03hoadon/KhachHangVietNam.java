package nguyenVanPhu.bai03hoadon;

import java.time.LocalDate;

public class KhachHangVietNam extends HoaDon {
	private String doiTuongKhachHang;
	private double dinhMuc;

	public KhachHangVietNam() {
		super();
		doiTuongKhachHang = "chưa biết";
		dinhMuc = 0;
	}

	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKWTieuThu,
			double donGia, String doiTuongKhachHang, double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
		setDoiTuongKhachHang(doiTuongKhachHang);
		setDinhMuc(dinhMuc);
	}

	public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}

	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		if (!doiTuongKhachHang.equals("")) {
			this.doiTuongKhachHang = doiTuongKhachHang;
		} else
			this.doiTuongKhachHang = "chưa biết";
	}

	public double getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(double dinhMuc) {
		if (dinhMuc > 0) {
			this.dinhMuc = dinhMuc;
		} else
			this.dinhMuc = 0;
	}

	/**
	 * Nếu số KW tiêu thụ <= định mức thì thành tiền = số KW tiêu thụ*đơn giá. -
	 * Ngược lại, thành tiền = số KW tiêu thụ*đơn giá*định mức + số KW vượt định
	 * mức*đơn giá*2.5
	 */
	public double tinhThanhTien() {
		if (super.getSoKWTieuThu() <= dinhMuc) {
			return super.tinhThanhTien();

		} else
			return super.tinhThanhTien() * dinhMuc + (getSoKWTieuThu() - dinhMuc) * 2.5;
	}

	public String toString() {
		return String.format("%s %-15s %-10.1f", super.toString(), this.doiTuongKhachHang, this.dinhMuc);
	}
}
