package nguyenQuangVinh.bai01;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private int soKmDiDuoc;
	/**
	 * @return the soTuyen
	 */
	public int getSoTuyen() {
		return soTuyen;
	}
	/**
	 * @param soTuyen the soTuyen to set
	 */
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	/**
	 * @return the soKmDiDuoc
	 */
	public int getSoKmDiDuoc() {
		return soKmDiDuoc;
	}
	/**
	 * @param soKmDiDuoc the soKmDiDuoc to set
	 */
	public void setSoKmDiDuoc(int soKmDiDuoc) {
		this.soKmDiDuoc = soKmDiDuoc;
	}
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen,
			int soKmDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKmDiDuoc = soKmDiDuoc;
	}
	public ChuyenXeNoiThanh() {
		super("rong", "rong", "rong", 0);
		setSoTuyen(0);
		setSoKmDiDuoc(0);
	}
	
	@Override
	public String toString() {
		
		return String.format("Chuyen xe noi thanh:\n %s, %d, %d", super.toString(), soTuyen, soKmDiDuoc);
	}

}
