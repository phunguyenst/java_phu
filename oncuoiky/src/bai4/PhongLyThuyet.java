package bai4;

public class PhongLyThuyet extends PhongHoc {
	private boolean mayChieu;

	public PhongLyThuyet() {
		mayChieu = false;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean mayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setMayChieu(mayChieu);
	}

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	/**
	 * phòng lý thuyết phải có máy chiếu
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return (duAnhSang() && mayChieu);
	}

	@Override
	public String toString() {
		return String.format("%s %-20s", super.toString(), mayChieu?"có":"không");
	}

}
