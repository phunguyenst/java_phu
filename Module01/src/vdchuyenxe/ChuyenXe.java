package vdchuyenxe;

public class ChuyenXe {
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		setMaSoChuyen(maSoChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	public ChuyenXe() {
		this("", "","", 0);
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
		return String.format("%s %s %s %f", this.maSoChuyen, this.hoTenTaiXe, this.soXe, this.doanhThu);
	}
	
}
