package bai4;

import java.text.DecimalFormat;
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
		if (!maPhong.equals("")) {
			this.maPhong = maPhong;
		} else
			this.maPhong = "chưa biết";
	}

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		if (!dayNha.equals("")) {
			this.dayNha = dayNha;
		} else
			this.dayNha = "chưa biết";
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		if (dienTich > 0) {
			this.dienTich = dienTich;
		} else

			this.dienTich = 0;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		if (soBongDen > 0) {
			this.soBongDen = soBongDen;
		} else
			this.soBongDen = soBongDen;
	}

	public boolean duAnhSang() {
		return (dienTich / soBongDen <= 10);
	}

	public abstract boolean kiemTraDatChuan();

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
		return String.format("%-20s %-10s %-15s %-15s %-20s", "mã phòng", "dãy nhà", "diện tích", "số bóng đèn",
				"máy chiếu");

	}

	public static String getTieuDePhongMayTinh() {
		return String.format("%-20s %-10s %-15s %-15s %-15s", "mã phòng", "dãy nhà", "diện tích", "số bóng đèn",
				"số mt");

	}
	
	public static String getTieuDePhongThucHanh() {
		return String.format("%-20s %-10s %-15s %-15s %-20s %-15s %-15s", "mã phòng", "dãy nhà", "diện tích",
				"số bóng đèn", "chuyên ngành", "sức chứa", "bồn rửa");

	}
	

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-20s %-10s %-15s %-15d ", this.maPhong, this.dayNha, df.format(dienTich),
				this.soBongDen);
	}

}
