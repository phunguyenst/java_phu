package nguyenVanPhu.bai02giaodichnhadatlist;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
	/**
	 * thuộc tính
	 */
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;

	/**
	 * phương thức
	 */
	public GiaoDich() {
		this("chưa biết", LocalDate.now(), 0, 0);
	}

	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setDienTich(dienTich);
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		if (!maGiaoDich.equals("")) {
			this.maGiaoDich = maGiaoDich;
		} else
			this.maGiaoDich = "chưa biết";
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		if (ngayGiaoDich.isBefore(LocalDate.now())) {
			this.ngayGiaoDich = ngayGiaoDich;
		} else
			this.ngayGiaoDich = LocalDate.now();
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		if (dienTich >= 0) {
			this.dienTich = dienTich;
		} else
			this.dienTich = 0;
	}

	public double tinhThanhTien() {
		return dienTich * donGia;
	}

	public static String getTieuDeGiaoDichDat() {
		return String.format("%-15s %-20s %-15s %-15s %-20s %-10s", "mã giao dịch", "ngày giao dịch", "đơn giá",
				"diện tích", "thành tiền", "loại đất");
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-15s %-15.1f %-20s", this.maGiaoDich, dtf.format(ngayGiaoDich),
				df.format(donGia), this.dienTich, this.tinhThanhTien());
	}

}
