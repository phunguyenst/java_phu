package nguyenVanPhu.bai08hanghoaset;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;

	public HangHoa() throws Exception {
		this("chưa biết", "xxx", 0, 0);
	}

	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
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
	 * @throws Exception
	 */
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.equals("")) {
			this.maHang = maHang;
		} else
			throw new Exception("lỗi mã hàng rỗng");

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
		}
		else
		this.soLuongTon = 0;
	}

	public abstract String danhGiaMucDoBanBuon();

	public abstract double tinhTienVAT();

	public static String getTieuDeHangThucPham() {
		return String.format("%-15s %-20s %-15s %-15s %-15s %-20s %-15s %-15s", "mã hang", "tên hàng", "đơn giá",
				"số lượng tồn","tình trạng", "nhà cung cấp", "ngày sản xuất", "ngày hết hạn");
	}
	public static String getTieuDeHangDienMay() {
		return String.format("%-15s %-20s %-15s %-15s %-20s %-15s", "mã hang", "tên hàng", "đơn giá",
				"số lượng tồn", "thời gian bảo hành", "công suất");
	}
	public static String getTieuDeHangSangSu() {
		return String.format("%-15s %-20s %-15s %-15s %-15s %-15s", "mã hang", "tên hàng", "đơn giá",
				"số lượng tồn", "nhà sản xuất", "ngày nhập kho");
	}

	@Override
	public int hashCode() {
		return Objects.hash(maHang);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		return Objects.equals(maHang, other.maHang);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%-15s %-20s %-15s %-15d", this.maHang, this.tenHang, df.format(donGia), this.soLuongTon);
	}

}
