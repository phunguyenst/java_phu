package bai02;

import java.text.DecimalFormat;

public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;

	public HangHoa() {
		this("chưa biết", "chưa biết", 0, 0);
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}

	public String getMaHang() {
		return maHang;
	}

	/**
	 * mã hàng (không được sửa, không được để trống)
	 * 
	 * @param maHang
	 */
	private void setMaHang(String maHang) {
		if (!maHang.equals("")) {
			this.maHang = maHang;
		} else
			this.maHang = "chưa biết";
	}

	public String getTenHang() {
		return tenHang;
	}

	/**
	 * tên hàng (không được rỗng, mặc định là “xxx”)
	 * 
	 * @param tenHang
	 */
	public void setTenHang(String tenHang) {
		if (!tenHang.equals("")) {
			this.tenHang = tenHang;
		} else
			this.tenHang = "xxx";
	}

	public double getDonGia() {
		return donGia;
	}

	/**
	 * đơn giá (>=0)
	 * 
	 * @param donGia
	 */
	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	/**
	 * số lượng tồn (>=0)
	 * 
	 * @param soLuongTon
	 */
	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0) {
			this.soLuongTon = soLuongTon;
		} else
			this.soLuongTon = 0;
	}

	public abstract String danhGiaMucDoBanBuon();

	public abstract double tinhTienVAT();

	public static String getTieuDeHangThucPham() {
		return String.format("%-15s %-20s %-20s %-20s %-25s %-20s %-20s %-20s", "mã hàng", "tên hàng", "đơn giá",
				"số lượng tồn", "tình trạng", "nhà cung cấp", "ngày sản xuất", "ngày hết hạn");
	}

	public static String getTieuDeHangSanhSu() {
		return String.format("%-15s %-20s %-20s %-20s %-25s %-20s %-20s", "mã hàng", "tên hàng", "đơn giá",
				"số lượng tồn", "tình trạng", "Nhà sản xuất", "ngày nhập kho");
	}

	public static String getTieuDeHangDienMay() {
		return String.format("%-15s %-20s %-20s %-20s %-25s %-20s %-10s", "mã hàng", "tên hàng", "đơn giá",
				"số lượng tồn", "tình trạng", "thời gianbh", "công suất");
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-20s %-20d %-25s", this.maHang, this.tenHang, df.format(donGia),
				this.soLuongTon, this.danhGiaMucDoBanBuon());
	}

}
