package nguyenVanPhu.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	/**
	 * thuộc tính
	 */
	private String noiDen;
	private int soNgayDiDuoc;

	/**
	 * phương thức
	 */
	public ChuyenXeNgoaiThanh() {
		this("chua biet", "chua biet", "chua biet", 0, "chua biet", 0);
	}

	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public String toString() {
		return String.format("*CHUYEN XE NGOAI THANH\n%s nơi đến: %-15s số ngày đi được: %-10d", super.toString(),
				this.noiDen, this.soNgayDiDuoc);
	}

}
