package bai3dek14;

import java.time.LocalDate;

public class NhanVienHopDong extends NhanVien {
	private int soNgayCongTrenThang;

	public NhanVienHopDong() {
		super();
	}

	public NhanVienHopDong(String maNhanVien, String hoTen, LocalDate ngayVaoLam, int soNgayCongTrenThang) {
		super(maNhanVien, hoTen, ngayVaoLam);
		this.soNgayCongTrenThang = soNgayCongTrenThang;
	}

	public int getSoNgayCongTrenThang() {
		return soNgayCongTrenThang;
	}

	/**
	 * số ngày công/tháng ko quá 30
	 * 
	 * @param soNgayCongTrenThang
	 */
	public void setSoNgayCongTrenThang(int soNgayCongTrenThang) {
		if (soNgayCongTrenThang > 0) {
			this.soNgayCongTrenThang = soNgayCongTrenThang;
		} else if (soNgayCongTrenThang > 30) {
			this.soNgayCongTrenThang = 30;
		} else
			this.soNgayCongTrenThang = 0;
	}

	/**
	 * nếu làm việc trên 20 ngày tiền cộng là 200000, 15 ngày thì dc 500000, 15 ngày
	 * trở xuống dc 100000
	 */
	@Override
	public double tinhTienLuong() {
		double s = 0;
		if (soNgayCongTrenThang > 20) {
			s = soNgayCongTrenThang*200000;
		} else if (soNgayCongTrenThang > 15 && soNgayCongTrenThang<=20) {
			s = soNgayCongTrenThang*150000;
		} else if (soNgayCongTrenThang <= 15) {
			s = soNgayCongTrenThang*100000;
		}
		return s;
	}

	@Override
	public String toString() {
		return String.format("%s %-10d", super.toString(), this.soNgayCongTrenThang);
	}

}
