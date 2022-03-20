package nguyenVanPhu.bai08;

import java.text.DecimalFormat;
import java.util.Objects;


public abstract class HangHoa {
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	public HangHoa() throws Exception {
		this("chưa biết","xxx", 0, 0 );
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	/**
	 * hàm trả về giá trị thuộc tính cho maHang
	 * 
	 * @return maHang
	 */
	public String getMaHang() {
		return maHang;
	}

	/**
	 * hàm gán giá trị cho maHang
	 * 
	 * @param maHang: giá trị muốn gán
	 */
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		} else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}

	/**
	 * hàm trả về giá trị thuộc tính cho tenHang
	 * 
	 * @return tenHang
	 */
	public String getTenHang() {
		return tenHang;
	}

	/**
	 * hàm gán giá trị cho tenHang
	 * 
	 * @param tenHang: giá trị muốn gán
	 */
	public void setTenHang(String tenHang) {
		if (!tenHang.equals("")) {
			this.tenHang = tenHang;
		} else
			this.tenHang ="xxx";
	}

	/**
	 * hàm trả về giá trị thuộc tính cho donGia
	 * 
	 * @return donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * hàm gán giá trị cho donGia
	 * 
	 * @param donGia: giá trị muốn gán
	 */
	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}
	/**
	 * hàm trả về giá trị thuộc tính cho soLuongTon
	 * 
	 * @return soLuongTon
	 */
	public int getSoLuongTon() {
		return soLuongTon;
	}
	/**
	 * hàm gán giá trị cho soLuongTon
	 * 
	 * @param soLuongTon: giá trị muốn gán
	 */
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon>= 0) {
			this.soLuongTon =soLuongTon;
		}
		else
			this.soLuongTon = 0;
	}
	public abstract double tinhTienVAT();
	public abstract String danhGiaMucDoBanBuon();
	public static String getTieuDe() {
		return String.format("%-15s %-20s %-15s, %10s", "mã hàng", "tên hàng", "đơn giá", "số lượng");
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return String.format("%-15s %-20s %-15s %10d", this.maHang, this.tenHang, df.format(donGia), this.soLuongTon);
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
	
	
}
