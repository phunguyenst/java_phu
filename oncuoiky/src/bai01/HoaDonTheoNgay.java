package bai01;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {

	private int soNgayThue;

	public HoaDonTheoNgay() {
		super();
		soNgayThue = 0;
	}

	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoNgayThue(soNgayThue);
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		if (soNgayThue >= 0) {
			this.soNgayThue = soNgayThue;
		} else

			this.soNgayThue = 0;
	}

	@Override
	public double tinhThanhTien() {
		if (soNgayThue > 7) {
			return (7 * getDonGia()) + ((soNgayThue - 7) * (getDonGia() * 0.8));
		} else
			return soNgayThue * getDonGia();
	}

	@Override
	public String toString() {
		return String.format("%s %-10d", super.toString(), this.soNgayThue);
	}

}
