package nguyenVanPhu.bai05;

import java.time.LocalDate;

public class HoaDonKhachHangNuocNgoai extends HoaDon {
	/**
	 * thuộc tính
	 */
	private String quocTich;

	/**
	 * phương thức
	 */
	public HoaDonKhachHangNuocNgoai() {
		super();
		quocTich = "chưa biết";
	}

	public HoaDonKhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayLapHD, double donGia, double soKWTieuThu,
			String quocTich) {
		super(maKH, hoTen, ngayLapHD, donGia, soKWTieuThu);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public double tinhThanhTien() {
		return super.getSoKWTieuThu() * super.getDonGia();
	}

	@Override
	public String toString() {
		return String.format("%s quốc tịch: %-11s", super.toString(), this.quocTich);
	}

}
