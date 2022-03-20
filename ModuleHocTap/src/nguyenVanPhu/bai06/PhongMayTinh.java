package nguyenVanPhu.bai06;

public class PhongMayTinh extends PhongHoc {
	private int soMayTinh;

	public PhongMayTinh() {
		super();
		soMayTinh = 0;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setSoMayTinh(soMayTinh);
	}

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		if (soMayTinh > 0) {
			this.soMayTinh = soMayTinh;
		} else
			this.soMayTinh = 0;
	}

	/**
	 * đủ ánh sáng (trung bình 10m2 - 1 bóng đèn) và Phòng máy tính: trung bình
	 * 1.5m2 đặt một máy
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return duAnhSang() && (getDienTich() / soMayTinh >= 1.5f);
	}

	public String toString() {
		return String.format("%s %-15d", super.toString(), this.soMayTinh);
	}

}
