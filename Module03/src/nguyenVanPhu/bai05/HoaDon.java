package nguyenVanPhu.bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDon {
	/**
	 * thuộc tính
	 */
	private String maKH;
	private String hoTen;
	private LocalDate ngayLapHD;
	private double donGia;
	private double soKWTieuThu;
	/**
	 * phương thức
	 */
	public HoaDon() {
		this("chưa biết","chưa biết", LocalDate.now(), 0,0 );
	}
	public HoaDon(String maKH, String hoTen, LocalDate ngayLapHD, double donGia, double soKWTieuThu) {
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLapHD(ngayLapHD);
		setDonGia(donGia);
		setSoKW(soKWTieuThu);
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getSoKWTieuThu() {
		return soKWTieuThu;
	}
	public void setSoKW(double soKW) {
		this.soKWTieuThu = soKW;
	}
	public double tinhThanhTien() {
		return soKWTieuThu * donGia;
	}
	
	public static String getTieuDe() {
		return String.format("%s %18s %16s %10s", "Mã khách hàng", "Họ tên", "Ngày lập HD", "số KW");
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		return String.format("%8s %23s %16s %10.2f %15.2f", this.maKH, this.hoTen, dtf.format(ngayLapHD), this.donGia, this.soKWTieuThu);
	}
	
}
