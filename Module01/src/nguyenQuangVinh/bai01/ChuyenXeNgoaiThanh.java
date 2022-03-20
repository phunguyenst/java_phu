package nguyenQuangVinh.bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgayDiDuoc;
	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}
	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	/**
	 * @return the soNgayDiDuoc
	 */
	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}
	/**
	 * @param soNgayDiDuoc the soNgayDiDuoc to set
	 */
	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public ChuyenXeNgoaiThanh() {
		super("rong", "rong", "rong", 0);
		setNoiDen("");
		setSoNgayDiDuoc(0);
	}
	@Override
	public String toString() {
		
		return String.format("Chuyen xe ngoai thanh:\n %s, %s, %d", super.toString(), noiDen, soNgayDiDuoc);
	}

}
