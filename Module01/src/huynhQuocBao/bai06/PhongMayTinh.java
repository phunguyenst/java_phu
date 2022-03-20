package huynhQuocBao.bai06;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh(int maPhong, int soBongDen, String dayNha, double dienTich, int soMayTinh) {
		super(maPhong, soBongDen, dayNha, dienTich);
		setSoMayTinh(soMayTinh);
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean kiemTraDatChuan() {
		return (getDienTich() / 10 <= getSoBongDen()) && (getDienTich() / 1.5 <= soMayTinh) ? true : false;
	}

	public String getTitle() {
		return super.getTitle() + String.format("%-15s", "So may tinh");
	}

	public String toString() {
		return super.toString() + String.format("%-15d", soMayTinh);
	}
}
