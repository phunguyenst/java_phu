package nguyenVanPhu.bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	/**
	 * thuộc tính
	 */
	private String loaiVang;

	/**
	 * phương thức
	 */
	public GiaoDichVang() {
		loaiVang = "chưa biết";
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public double tinhThanhTien() {
		return super.getDonGia() * super.getSoLuong();
	}

	@Override
	public String toString() {
		return String.format("Giao dịch vàng:\n %s loại vàng: %-15s", super.toString(), this.loaiVang);
	}
}
