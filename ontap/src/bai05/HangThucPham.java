package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private  String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public String getMaHang() {
		return maHang;
	}
	private void setMaHang(String maHang) throws Exception {
		if(!maHang.equals(""))
		{
			this.maHang = maHang;
		}
		
		
	else
		throw new Exception("Lỗi nhập maHang rỗng");
		
	}

	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(!tenHang.equals(""))
		{
			this.tenHang = tenHang;
		}
		else
			this.tenHang = "xxx";
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia>0)
		{
			this.donGia = donGia;
		}
		else
			this.donGia = 0;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat.isBefore(LocalDate.now()))
		{
			this.ngaySanXuat = ngaySanXuat;
		}
		else
			this.ngaySanXuat = LocalDate.now();
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan.isAfter(ngaySanXuat))
		{
			this.ngayHetHan = ngayHetHan;
		}
		else
			this.ngayHetHan = ngaySanXuat;
	}
	public HangThucPham(String maHang) throws Exception {
		setMaHang(maHang);
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true: false;
	}
	
	public static String getTieuDe() {
		return String.format("%-10s %-10s %15s %-20s %-20s %-20s", "Mã_Hàng", "Tên_Hàng","dongia","Ngày_Sản_Xuất", "Ngày_Hết_Hạn", "Ghi_Chú");
	}
	
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String s = "";
		if(kiemTraHetHan())
		{
			s = "Hàng hết hạn";
		}
		return String.format("%-10s %-10s %15s %-20s %-20s %-20s", this.maHang, this.tenHang, df.format(donGia), dtf.format(ngaySanXuat), dtf.format(ngayHetHan),s);
	}
	
	
}
