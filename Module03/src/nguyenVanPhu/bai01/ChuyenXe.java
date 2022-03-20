package nguyenVanPhu.bai01;

public class ChuyenXe {
	/**
	 * thuộc tính
	 */
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;

	/**
	 * phương thức
	 */
	public ChuyenXe() {
		this("chua biet", "chua biet", "chua biet", 0);
	}

	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		setMaSoChuyen(maSoChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	@Override
	public String toString() {
		return String.format("mã số chuyến: %-10s họ tên: %-20s số xe: %-10s doanh thu: %15.1f", this.maSoChuyen,
				this.hoTenTaiXe, this.soXe, this.doanhThu);
	}

}
