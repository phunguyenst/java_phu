package nguyenVanPhu.bai06;

import java.util.Objects;

public abstract class PhongHoc {
	private String maPhong;
	private String dayNha;
	private double dienTich;
	private int soBongDen;

	public PhongHoc() {
		this("chưa biết", "chưa biết", 0, 0);
	}

	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setSoBongDen(soBongDen);

	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
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

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	public abstract boolean kiemTraDatChuan();

	/**
	 * tất cả các phòng đều phải đủ ánh sáng (trung bình 10m2 - 1 bóng đèn)
	 * 
	 * @return
	 */
	public boolean duAnhSang() {
		return (dienTich / soBongDen <= 10);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}

	public static String getTieuDePhongLyThuyet() {
		return String.format("%-15s %-15s %-15s %-10s %-15s", "mã phòng", "dãy nhà", "diện tích", "số bong đèn",
				"tình trạng");
	}

	public static String getTieuDePhongMayTinh() {
		return String.format("%-15s %-15s %-15s %-10s %-15s", "mã phòng", "dãy nhà", "diện tích", "số bong đèn",
				"số máy tính");
	}

	public static String getTieuDePhongThiNghiem() {
		return String.format("%-15s %-15s %-15s %-10s %-15s %-15s %-15s", "mã phòng", "dãy nhà", "diện tích",
				"số bong đèn", "chuyên ngành", "sức chứa ", "tình trạng");
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15.1f %12d", this.maPhong, this.dayNha, this.dienTich, this.soBongDen);
	}

}
