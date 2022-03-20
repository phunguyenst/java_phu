package bai01;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private int soGioThue;

	public HoaDonTheoGio() {
		super();
		soGioThue = 0;
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soGioThue) throws Exception {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoGioThue(soGioThue);
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) throws Exception {
		if (soGioThue >= 0) {
			this.soGioThue = soGioThue;
		} else if (soGioThue > 24 && soGioThue < 30) {
			this.soGioThue = 24;
		} else if (soGioThue > 30)
			throw new Exception("lhong dung loai hoa don theo gio");

	}

	@Override
	public double tinhThanhTien() {

		return soGioThue * getDonGia();
	}

	@Override
	public String toString() {
		return String.format("%s %-10d", super.toString(), this.soGioThue);
	}

}
