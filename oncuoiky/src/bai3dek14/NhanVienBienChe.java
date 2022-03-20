package bai3dek14;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class NhanVienBienChe extends NhanVien {
	private double heSoLuong;
	private boolean trangThai;

	public NhanVienBienChe() {
		super();
		heSoLuong = 0;
		trangThai = false;
	}

	public NhanVienBienChe(String maNhanVien, String hoTen, LocalDate ngayVaoLam, double heSoLuong, boolean trangThai) {
		super(maNhanVien, hoTen, ngayVaoLam);
		setHeSoLuong(heSoLuong);
		setTrangThai(trangThai);
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	/**
	 * hệ số lương phải từ 2.34 đến 4.98
	 * 
	 * @param heSoLuong
	 */
	public void setHeSoLuong(double heSoLuong) {
		if (heSoLuong >= 2.34 && heSoLuong <= 4.98) {
			this.heSoLuong = heSoLuong;
		} else
			this.heSoLuong = 0;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	/**
	 * tính khoảng phụ cấp dựa trên hiệu quả công việc
	 */
	@Override
	public double tinhTienLuong() {
		if (trangThai == true) {
			return heSoLuong * 1400000 + 2000000;
		} else
			return heSoLuong * 1400000 + 500000;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%s %-20s %-15s", super.toString(), df.format(heSoLuong), trangThai ? "có" : "không");
	}

}
