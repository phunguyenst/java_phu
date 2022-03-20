package bai01;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private String maPhong;
	private double donGia;

	public HoaDon() {
		this("chưa biết", LocalDate.now(), "chưa biết", "chưa biết", 0);
	}

	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		setMaHoaDon(maHoaDon);
		setNgayHoaDon(ngayHoaDon);
		setTenKhachHang(tenKhachHang);
		setMaPhong(maPhong);
		setDonGia(donGia);
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		if (!maHoaDon.equals("")) {
			this.maHoaDon = maHoaDon;
		} else
			this.maHoaDon = "chưa biết";
	}

	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		if (!ngayHoaDon.isBefore(LocalDate.now())) {
			this.ngayHoaDon = ngayHoaDon;
		} else
			this.ngayHoaDon = LocalDate.now();
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		if (!tenKhachHang.equals("")) {
			this.tenKhachHang = tenKhachHang;
		} else

			this.tenKhachHang = "chưa biết";
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		if (!maPhong.equals("")) {
			this.maPhong = maPhong;
		} else
			this.maPhong = "chưa biết";
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

	public abstract double tinhThanhTien();

	public static String getTieuDe() {
		return String.format("%-15s %-20s %-30s %-15s %-20s %-20s", "mã HD", "ngày hóa đơn", "tên khách hàng",
				"mã phòng", "đơn giá", "thành tiền");
	}

	@Override
	public int hashCode() {
		return Objects.hash(maHoaDon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHoaDon, other.maHoaDon);
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-30s %-15s %-20s %-20s", this.maHoaDon, dtf.format(ngayHoaDon),
				this.tenKhachHang, this.maPhong, df.format(donGia), df.format(tinhThanhTien()));

	}
}
