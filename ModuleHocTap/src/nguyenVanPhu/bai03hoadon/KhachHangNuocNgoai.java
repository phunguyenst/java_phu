package nguyenVanPhu.bai03hoadon;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends HoaDon {
	private String quocTich;

	public KhachHangNuocNgoai() {
		super();
		quocTich = "chưa biết";
	}

	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKWTieuThu,
			double donGia, String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		if (!quocTich.equals("")) {
			this.quocTich = quocTich;
		} else

			this.quocTich = "chưa biết";
	}
	/**
	 * tính thành tiền khách hàng nước ngoài
	 */
	public double tinhThanhTien() {
		return super.tinhThanhTien();
	}

	public String toString() {
		return String.format("%s %-15s", super.toString(), this.quocTich);
	}

}
