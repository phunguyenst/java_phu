package nguyenQuangVinh.bai01;

public class ChuyenXe {
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private  double doanhThu;
	/**
	 * @return the maSoChuyen
	 */
	public String getMaSoChuyen() {
		return maSoChuyen;
	}
	
	/**
	 * @param maSoChuyen the maSoChuyen to set
	 */
	public void setMaSoChuyen(String maSoChuyen) {
		if(maSoChuyen.equals(""))
			this.maSoChuyen="rong";
		else
			this.maSoChuyen = maSoChuyen;
	}
	/**
	 * @return the hoTenTaiXe
	 */
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}
	/**
	 * @param hoTenTaiXe the hoTenTaiXe to set
	 */
	public void setHoTenTaiXe(String hoTenTaiXe) {
		if(hoTenTaiXe.equals(""))
			this.hoTenTaiXe="rong";
		else
			this.hoTenTaiXe = hoTenTaiXe;
	}
	/**
	 * @return the soXe
	 */
	public String getSoXe() {
		return soXe;
	}
	/**
	 * @param soXe the soXe to set
	 */
	public void setSoXe(String soXe) {
		if(soXe.equals(""))
			this.soXe="rong";
		else
			this.soXe = soXe;
	}
	/**
	 * @return the doanhThu
	 */
	public double getDoanhThu() {
		return doanhThu;
	}
	/**
	 * @param doanhThu the doanhThu to set
	 */
	public void setDoanhThu(double doanhThu) {
		if(doanhThu==0)
			this.doanhThu=0;
		else
			this.doanhThu = doanhThu;
	}
	public ChuyenXe() {
		this("rong", "rong", "rong", 0);
	}
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		super();
		setMaSoChuyen(maSoChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %s, %s, %f", this.maSoChuyen, this.hoTenTaiXe, this.soXe, this.doanhThu);
	}
	
	
}
