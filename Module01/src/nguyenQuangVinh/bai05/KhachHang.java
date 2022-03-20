package nguyenQuangVinh.bai05;

import java.time.LocalDate;

public class KhachHang {
	private String maKhachHang;
	private String hoTen;
	private LocalDate ngayLapHD;
	private double soKW;
	private double donGia;
	/**
	 * @return the maKhachHang
	 */
	public String getMaKhachHang() {
		return maKhachHang;
	}
	/**
	 * @param maKhachHang the maKhachHang to set
	 */
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}
	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	/**
	 * @return the ngayLapHD
	 */
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	/**
	 * @param ngayLapHD the ngayLapHD to set
	 */
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	/**
	 * @return the soKW
	 */
	public double getSoKW() {
		return soKW;
	}
	/**
	 * @param soKW the soKW to set
	 */
	public void setSoKW(double soKW) {
		this.soKW = soKW;
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
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHD, double soKW, double donGia) {
		setMaKhachHang(maKhachHang);
		setHoTen(hoTen);
		setNgayLapHD(ngayLapHD);
		setSoKW(soKW);
		setDonGia(donGia);
	}
	public KhachHang() {
		this("","", LocalDate.now(), 0, 0);
	}
	public double getThanhTien() {
		return donGia*soKW;
		
	}
	@Override
	public String toString() {
		
		return String.format("%-10s %-15s %-15s %10.1f %10.1f",maKhachHang,hoTen,ngayLapHD,soKW,donGia);
	}
	public static String getLayTieuDe() {
		return String.format("%-10s %-15s %-15s %10s %10s","Ma KH","Ho ten","Ngay lap HD","So KW","Don gia");
	}
	

}
