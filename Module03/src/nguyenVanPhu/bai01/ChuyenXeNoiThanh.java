package nguyenVanPhu.bai01;

public class ChuyenXeNoiThanh extends ChuyenXe {
	/**
	 * thuộc tính
	 */
	private int soTuyen;
	private double soKMDiDuoc;

	/**
	 * phương thức
	 */
	public ChuyenXeNoiThanh() {
		this("chua biet", "chua biet", "chua biet", 0, 0, 0);
	}

	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			double soKMDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKMDiDuoc = soKMDiDuoc;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKMDiDuoc() {
		return soKMDiDuoc;
	}

	public void setSoKMDiDuoc(int soKMDiDuoc) {
		this.soKMDiDuoc = soKMDiDuoc;
	}

	@Override
	public String toString() {
		return String.format("*CHUYEN XE NOI THANH\n %s số tuyến: %-15d số km đi được: %10.1f", super.toString(),
				this.soTuyen, this.soKMDiDuoc);
	}

}
