package nguyenVanPhu.bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoaiSach {
	/**
	 * thuộc tính
	 */
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;
	/**
	 * phương thức
	 */
	public LoaiSach() {
		super();
	}
	public LoaiSach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
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
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public double tinhThanhTien() {
		return donGia* soLuong;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("mã sách: %-10s ngày nhập: %-15s đơn giá: %10.1f số lượng: %10d nhà xuất bản: %-10s", this.maSach, dtf.format(ngayNhap), this.donGia, this.soLuong, this.nhaXuatBan);
		
	}
	
}