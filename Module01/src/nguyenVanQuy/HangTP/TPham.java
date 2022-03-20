package nguyenVanQuy.HangTP;

import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.LocalDate;


public class TPham {
	
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) //throws Exception
	{
		
		//if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		//} else
			//throw new Exception("Lỗi: Mã hàng rỗng!");
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) throws Exception {
		if (!tenHang.equals("")) {
			this.tenHang = tenHang;
		} else
			throw new Exception("Lỗi: Tên hàng rỗng");
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (LocalDate.now().isBefore(ngaySanXuat)) {
			this.ngaySanXuat = ngaySanXuat;
		} else
			this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (LocalDate.now().isAfter(ngayHetHan)) {
			this.ngayHetHan = ngayHetHan;
		} else
			this.ngayHetHan = ngaySanXuat;
	}

	public TPham() throws Exception {
		setMaHang(maHang);
		tenHang = "XXX";
		donGia = 0;
		ngaySanXuat = LocalDate.now();
		ngayHetHan = ngaySanXuat;

	}

	public TPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
			throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-8s %-15s %13s %-14s %-13s %-12s", maHang, tenHang, df.format(donGia) + "VND",
				ngaySanXuat.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				ngayHetHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), (kiemTraHetHan()) ? "" : "Hang het han");
	}


}
