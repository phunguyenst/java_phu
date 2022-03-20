package nguyenVanPhu.bai02giaodichnhadatlist;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public GiaoDichDat() {
		super();
		loaiDat = "chưa biết";
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiDat(loaiDat);
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		if (!loaiDat.equals("")) {
			this.loaiDat = loaiDat;
		} else
			this.loaiDat = "chưa biết";
	}

	/**
	 * Nếu là loại B, C thì: thành tiền = diện tích * đơn giá. - Nếu là loại A thì:
	 * thành tiền = diện tích * đơn giá * 1.5
	 */

	public double tinhThanhTien() {
		if (loaiDat.equalsIgnoreCase("B") && loaiDat.equalsIgnoreCase("C")) {
			return super.tinhThanhTien();
		} else
			return super.tinhThanhTien() * 1.5;
	}

	@Override
	public String toString() {
		return String.format("%s %-10s", super.toString(), this.loaiDat);
	}

}
