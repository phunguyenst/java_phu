package nguyenVanPhu.bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	/**
	 * thuộc tính
	 */
	private double tiGia;
	private String loaiTienTe;

	/**
	 * phương thức
	 */
	public GiaoDichTienTe() {
		super();
		tiGia = 0;
		loaiTienTe = "chưa biết";
	}

	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public String getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}

	public double tinhThanhTien() {
		double s = 0;
		if (this.loaiTienTe.equals("USD") || this.loaiTienTe.equals("Euro")) {
			s = super.getDonGia() * super.getSoLuong() * this.tiGia;
		} else {
			s = super.getDonGia() * super.getSoLuong();
		}
		return s;
	}

	@Override
	public String toString() {
		return String.format("Giao dịch tiền tệ: \n %s tỉ giá: %10.1f loại tiền tệ: %-15s ", super.toString(),
				this.tiGia, this.loaiTienTe);
	}

}
