package bai3dek14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public abstract class NhanVien {
	private String maNhanVien;
	private String hoTen;
	private LocalDate ngayVaoLam;

	public NhanVien() {
		this("chưa biết", "chưa biết", LocalDate.now());
	}

	public NhanVien(String maNhanVien, String hoTen, LocalDate ngayVaoLam) {
		setMaNhanVien(maNhanVien);
		setHoTen(hoTen);
		setNgayVaoLam(ngayVaoLam);
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	/**
	 * mã nhân viên không để trống
	 * 
	 * @param maNhanVien
	 */
	public void setMaNhanVien(String maNhanVien) {
		if (!maNhanVien.equals("")) {
			this.maNhanVien = maNhanVien;
		} else
			this.maNhanVien = "chưa biết";
	}

	public String getHoTen() {
		return hoTen;
	}

	/**
	 * họ tên không để trống
	 * 
	 * @param hoTen
	 */
	public void setHoTen(String hoTen) {
		if (!hoTen.equals("")) {
			this.hoTen = hoTen;
		} else
			this.hoTen = "chưa biết";
	}

	public LocalDate getNgayVaoLam() {

		return ngayVaoLam;
	}

	/**
	 * ngày vào làm phải trước ngày hiện tại
	 * 
	 * @param ngayVaoLam
	 */
	public void setNgayVaoLam(LocalDate ngayVaoLam) {
		if (ngayVaoLam.isBefore(LocalDate.now())) {
			this.ngayVaoLam = ngayVaoLam;
		} else
			this.ngayVaoLam = LocalDate.now();
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNhanVien, other.maNhanVien);
	}

	public abstract double tinhTienLuong();

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-20s %-20s %-20s", this.maNhanVien, this.hoTen, dtf.format(ngayVaoLam));
	}

}
