package nguyenQuangVinh.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;
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
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}
	public GiaoDich() {
		this("", LocalDate.now(), 0, 0);
	}
	public double getThanhTien() {
		return donGia* soLuong;
		
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.0");
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-15s %20s %10d", maGiaoDich,dtf.format(ngayGiaoDich),df.format(donGia),soLuong);
	}
	
	public static String layTieuDe() {
		return String.format("%-15s %-15s %20s %10s","Ma giao dich","Ngay giao dich","Don gia","So luong");
	}
	

}
