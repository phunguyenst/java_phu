package baicuoiky;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public abstract class GiaoDich {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	public GiaoDich() {
		this("chưa biết", LocalDate.now(), 0);
	}
	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
	}
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		if(!maGiaoDich.equals("")) {
			this.maGiaoDich = maGiaoDich;
		}
		else
		this.maGiaoDich = "chưa biết";
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		if(ngayGiaoDich.isBefore(LocalDate.now()))
		{
			this.ngayGiaoDich = ngayGiaoDich;
		}
		else
		this.ngayGiaoDich = LocalDate.now();
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia>0) {
			this.donGia = donGia;
		}
		else
		this.donGia = 0;
	}
	/**
	 * tính thành tiền
	 * @return
	 */
	public abstract double tinhThanhTien();
	
	public static String getTieuDeGiaoDichVang() {
		return String.format("%-15s %-20s %-25s %-20s %-15s %-20s", "mã giao dịch", "ngày giao dịch", "đơn giá", "loại vàng","số lượng", "dv tính");
	}
	public static String getTieuDeGiaoDichDaQuy() {
		return String.format("%-15s %-20s %-25s %-20s %-15s", "mã giao dịch", "ngày giao dịch", "đơn giá", "loại đá", "số carat");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-25s", this.maGiaoDich, dtf.format(ngayGiaoDich), df.format(donGia));
	}
	
	
	
	
}
