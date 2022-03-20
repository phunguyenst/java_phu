package nguyenVanPhu.bai06;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;

	public PhongLyThuyet() {
		super();
		coMayChieu = false;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	/**
	 * tất cả các phòng đều phải đủ ánh sáng
	 */
	@Override
	public boolean kiemTraDatChuan() {
		return (duAnhSang() && coMayChieu);
	}

	/**
	 * Phòng học lý thuyết thì cần quan tâm xem có máy chiếu không.
	 * kiểm tra có hoặc ko có máy chiếu
	 */
	@Override
	public String toString() {
	
		return String.format("%s %-15s", super.toString(), coMayChieu? "co": "khong");
	}

}
