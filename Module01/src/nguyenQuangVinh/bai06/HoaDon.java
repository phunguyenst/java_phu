package nguyenQuangVinh.bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;
	/**
	 * @return the maHoaDon
	 */
	public String getMaHoaDon() {
		return maHoaDon;
	}
	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(String maHoaDon) {
		if(!maHoaDon.equals(""))
				this.maHoaDon = maHoaDon;
		else
			this.maHoaDon="Loi ma";
	}
	/**
	 * @return the ngayHoaDon
	 */
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	/**
	 * @param ngayHoaDon the ngayHoaDon to set
	 */
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		if(ngayHoaDon.isBefore(LocalDate.now()))
			this.ngayHoaDon = ngayHoaDon;
		else
			this.ngayHoaDon=LocalDate.now();
	}
	/**
	 * @return the tenKhachHang
	 */
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	/**
	 * @param tenKhachHang the tenKhachHang to set
	 */
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	/**
	 * @return the maPhong
	 */
	public String getMaPhong() {
		return maPhong;
	}
	/**
	 * @param maPhong the maPhong to set
	 */
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
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
	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		setMaHoaDon(maHoaDon);
		setNgayHoaDon(ngayHoaDon);
		setTenKhachHang(tenKhachHang);
		setMaPhong(maPhong);
		setDonGia(donGia);
	}
	public HoaDon() {
		this("Loi ma", LocalDate.now(),"", "", 0);
	}
	public abstract double getThanhTien();
	
	public static String layTieuDe() {
		return String.format("%-15s %-20s %-20s %-15s %10s", "Ma hoa don", "Ngay lap hoa don","Tên khách hàng","Mã phòng","Đơn giá");
		
		
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-15s %-20s %-20s %-15s %10.2f",maHoaDon,dtf.format(ngayHoaDon),tenKhachHang,maPhong,donGia);
	
	}

}
