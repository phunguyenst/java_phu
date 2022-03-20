package nguyenVanPhu.bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
	/**
	 * thuộc tính
	 */
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private double dienTich;
	/**
	 * phương thức
	 */
	public GiaoDich() {
		this("chưa biết", LocalDate.now(), 0, 0);
	}
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public double tinhThanhTien() {
		return dienTich * donGia;
	}
	@Override
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		return String.format("mã giao dịch: %-10s ngày giao dịch: %-15s đơn giá: %-20.1f diện tích: %-10.1f", this.maGD, dtf.format(ngayGD), this.donGia, this.dienTich);	
	}
}
