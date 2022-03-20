package nguyenVanPhu.bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class GiaoDich {
	/**
	 * thuộc tính
	 */
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
	/**
	 * phương thức
	 */
	public GiaoDich() {
		this("chưa biết", LocalDate.now(), 0,0);
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double tinhThanhTien() {
		return soLuong * donGia;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		return String.format("mã giao dịch: %-15s ngày giao dịch: %-15s đơn giá: %-15.1f số lượng %-10d", this.maGiaoDich, dtf.format(ngayGiaoDich), this.donGia, this.soLuong);
	}
	
	
}
