package nguyenVanPhu.bai02giaodichnhadatlist;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;

	public GiaoDichNha() {
		super();
		loaiNha = "chưa biết";
		diaChi = "chưa biết";
	}

	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		if (!loaiNha.equals("")) {
			this.loaiNha = loaiNha;
		} else
			this.loaiNha = "chưa biết";
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		if (!diaChi.equals("")) {
			this.diaChi = diaChi;
		} else
			this.diaChi = "chưa biết";
	}

	/**
	 * Nếu là loại nhà cao cấp thì: thành tiền = diện tích * đơn giá. - Nếu là loại
	 * thường thì: thành tiền = diện tích * đơn giá * 90%
	 */
	public double tinhThanhTien() {
		if (loaiNha.equalsIgnoreCase("thường")) {
			return super.tinhThanhTien();
		} else
			return super.tinhThanhTien() * 0.9;
	}

	@Override
	public String toString() {
		return String.format("%s %-15s %-20s", super.toString(), this.loaiNha, this.diaChi);
	}

}
