package nguyenVanPhu.bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	/**
	 * thuộc tính
	 */
	private String loaiNha;
	private String diaChi;

	/**
	 * phương thức
	 */
	public GiaoDichNha() {
		super();
		loaiNha = "chưa biết";
		diaChi = "chưa biết";
	}

	public GiaoDichNha(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double tinhThanhTien() {
		double s = 0;
		if (loaiNha.equals("cao cấp")) {
			s = super.getDienTich() * super.getDonGia();
		} else {
			s = super.getDienTich() * super.getDonGia() * 0.9;
		}
		return s;
	}

	@Override
	public String toString() {
		return String.format("\nGiao dịch nhà: \n %s loại nhà: %-10s địa chỉ: %-30s", super.toString(), this.loaiNha,
				this.diaChi);
	}

}
