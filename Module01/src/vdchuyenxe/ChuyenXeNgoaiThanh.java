package vdchuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	public ChuyenXeNgoaiThanh() {
		super();
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
		return String.format("%s %s %d", super.toString(), this.noiDen, this.soNgayDiDuoc);
	}
	
	
}
