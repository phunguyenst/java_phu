package nguyenVanPhu.bai06;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;

	public PhongLyThuyet() {
		super();
		coMayChieu = false;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		setCoMayChieu(coMayChieu);
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	/**
	 * đủ ánh sáng (trung bình 10m2 - 1 bóng đèn) và Phòng lý thuyết: phải có máy
	 * chiếu.
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return (duAnhSang() && coMayChieu);
	}

	@Override
	public String toString() {
		return String.format("%s %-15s", super.toString(), coMayChieu ? "có" : "không");
	}

}
