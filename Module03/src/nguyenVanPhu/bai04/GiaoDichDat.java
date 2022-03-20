package nguyenVanPhu.bai04;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
	/**
	 * thuộc tính
	 */
	private String loaiDat;

	/**
	 * phương thức
	 */
	public GiaoDichDat() {
		super();
		loaiDat = "chưa biết";
	}

	public GiaoDichDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public double tinhThanhTien() {
		double s = 0;
		if (loaiDat.equals("B") || loaiDat.equals("C")) {
			s = super.getDienTich() * super.getDonGia();
		} else {
			s = super.getDienTich() * super.getDonGia() * 1.5;
		}
		return s;
	}

	@Override
	public String toString() {
		return String.format("\nGiao dịch đất: \n %s loại đất: %-10s", super.toString(), this.loaiDat);
	}

}
