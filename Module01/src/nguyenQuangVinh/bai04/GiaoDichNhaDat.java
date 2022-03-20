package nguyenQuangVinh.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDichNhaDat {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;
	/**
	 * @return the maGiaoDich
	 */
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	/**
	 * @param maGiaoDich the maGiaoDich to set
	 */
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	/**
	 * @return the ngayGiaoDich
	 */
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	/**
	 * @param ngayGiaoDich the ngayGiaoDich to set
	 */
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @return the dienTich
	 */
	public double getDienTich() {
		return dienTich;
	}
	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public GiaoDichNhaDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setDienTich(dienTich);
	}
	public GiaoDichNhaDat() {
		this("", LocalDate.now(),0,0);
	}
	public double getThanhTien() {
		return donGia*dienTich;
		
	}
	@Override
	public String toString() {

		DecimalFormat df = new DecimalFormat("#,##0.0");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-15s %10s %10s", maGiaoDich,dtf.format(ngayGiaoDich),df.format(donGia),df.format(dienTich));
		
	}
	public static String getLayTieuDe() {
		return String.format("%-15s %-15s %10s %10s","Ma giao dich","Ngay giao dich","Don gia","Dien tich");
	}
	
}
