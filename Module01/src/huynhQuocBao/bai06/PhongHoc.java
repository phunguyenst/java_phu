package huynhQuocBao.bai06;

public abstract class PhongHoc {
	private int maPhong, soBongDen;
	private String dayNha;
	private double dienTich;

	public PhongHoc() {
		super();
	}

	public PhongHoc(int maPhong, int soBongDen, String dayNha, double dienTich) {
		super();
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public abstract boolean kiemTraDatChuan();

	public String getTitle() {
		return String.format("%-10s %-15s %-15s %-15s", "Ma phong", "Day nha", "Dien tich", "So bong den");
	}

	public String toString() {
		return String.format("%-10d %-15s %-15.2f %-15d", maPhong, this.dayNha, dienTich, soBongDen);
	}
}
