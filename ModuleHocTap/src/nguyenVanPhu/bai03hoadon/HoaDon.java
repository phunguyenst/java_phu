package nguyenVanPhu.bai03hoadon;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDon {
	private String maKhachHang;
	private String hoTen;
	private LocalDate ngayLapHoaDon;
	private double soKWTieuThu;
	private double donGia;

	public HoaDon() {
		this("chưa biết", "chưa biết", LocalDate.now(), 0, 0);
	}

	public HoaDon(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKWTieuThu, double donGia) {
		setMaKhachHang(maKhachHang);
		setHoTen(hoTen);
		setNgayLapHoaDon(ngayLapHoaDon);
		setSoKWTieuThu(soKWTieuThu);
		setDonGia(donGia);

	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		if (!maKhachHang.equals("")) {
			this.maKhachHang = maKhachHang;
		} else
			this.maKhachHang = "chưa biết";
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (!hoTen.equals("")) {
			this.hoTen = hoTen;
		} else
			this.hoTen = "chưa biết";
	}

	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		if (ngayLapHoaDon.isBefore(LocalDate.now())) {
			this.ngayLapHoaDon = ngayLapHoaDon;
		} else
			this.ngayLapHoaDon = LocalDate.now();
	}

	public double getSoKWTieuThu() {
		return soKWTieuThu;
	}

	public void setSoKWTieuThu(double soKWTieuThu) {
		if (soKWTieuThu >= 0) {
			this.soKWTieuThu = soKWTieuThu;
		} else

			this.soKWTieuThu = 0;
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
	public double tinhThanhTien() {
		return soKWTieuThu *donGia;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-20s %-15.1f %-15s %-20s", this.maKhachHang, this.hoTen, dtf.format(ngayLapHoaDon), this.soKWTieuThu, df.format(donGia), df.format(tinhThanhTien()));
	}
	
}
