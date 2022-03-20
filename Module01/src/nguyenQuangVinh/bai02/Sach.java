package nguyenQuangVinh.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	private String maSach;
	private String NXB;
	private double donGia;
	private int soLuong;
	private LocalDate ngayNhap;
	/**
	 * @return the maSach
	 */
	public String getMaSach() {
		return maSach;
	}
	
	/**
	 * @param maSach the maSach to set
	 */
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	/**
	 * @return the nXB
	 */
	public String getNXB() {
		return NXB;
	}
	/**
	 * @param nXB the nXB to set
	 */
	public void setNXB(String nXB) {
		NXB = nXB;
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
	/**
	 * @return the ngayNhap
	 */
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	/**
	 * @param ngayNhap the ngayNhap to set
	 */
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public Sach(String maSach, String nXB, double donGia, int soLuong, LocalDate ngayNhap) {
		
		setMaSach(maSach);
		setNXB(nXB);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNgayNhap(ngayNhap);
	}
	public Sach() {
		this("", "", 0, 0, LocalDate.now());
	}
	public double getThanhTien() {
		return soLuong*donGia;
		
	}
	public static String layTieuDe(){
		return String.format("%-10s %-15s %10s %10s %-15s","Mã sách","NXB","Đơn giá","Số lượng","Ngày nhập");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.0");
		
		return String.format("%-10s %-15s %-10s %10d %-15s", maSach,NXB,df.format(donGia),soLuong,dtf.format(ngayNhap));
	}
	

}
