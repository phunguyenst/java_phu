package nguyenVanPhu.bai06;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class  HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;
	public HoaDon() {
		super();
	}
	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public static String getTieuDe() {
		return String.format("%-15s %-15s %-20s %-10s %-15s %-10s", "mã hóa đơn", "ngày hóa đơn", "tên khách hàng", "mã phòng", "đơn giá", "thành tiền");
	}
	
	public abstract double tinhThanhTien();
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-15s %-20s %-10s %-15s %10.2f", this.maHoaDon, dtf.format(ngayHoaDon), this.tenKhachHang, this.maPhong,df.format(donGia), this.tinhThanhTien());
	}
	
}
