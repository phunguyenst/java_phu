package vdchuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private String soTuyen;
	private double soKMDiDuoc;
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen,
			double soKMDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKMDiDuoc = soKMDiDuoc;
	}
	public String getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getSoKMDiDuoc() {
		return soKMDiDuoc;
	}
	public void setSoKMDiDuoc(double soKMDiDuoc) {
		this.soKMDiDuoc = soKMDiDuoc;
	}
	@Override
	public String toString() {
		return String.format("%s %s %f", super.toString(), this.soTuyen, this.soKMDiDuoc);
	}
	
}
