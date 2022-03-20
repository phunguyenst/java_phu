package nguyenVanPhu.bai06;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh() {
		super();
		this.soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	/**
	 * tất cả các phòng đều phải đủ ánh sáng Phòng máy tính: trung bình 1.5m2 đặt
	 * một máy
	 */

	@Override
	public boolean kiemTraDatChuan() {
		// TODO Auto-generated method stub
		return (duAnhSang() && (getDienTich() / soMayTinh >= 1.5f));
	}

	@Override
	public String toString() {
		return String.format("%s %-15d", super.toString(), this.soMayTinh);
	}

}
