package huynhQuocBao.bai06;

public class PhongLyThuyet extends PhongHoc {
	private int mayChieu;

	public PhongLyThuyet(int maPhong, int soBongDen, String dayNha, double dienTich, int mayChieu) {
		super(maPhong, soBongDen, dayNha, dienTich);
		setMayChieu(mayChieu);
	}

	public int isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(int mayChieu) {
		this.mayChieu = mayChieu;
	}

	@Override
	public boolean kiemTraDatChuan() {
		return (getDienTich()/10 <= getSoBongDen()) && (mayChieu > 0) ? true : false; 
	}

	public String getTitle() {
		return super.getTitle() + String.format("%-15s", "Co may chieu");
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-15s", mayChieu > 0 ? "Co" : "Khong");
	}

}
