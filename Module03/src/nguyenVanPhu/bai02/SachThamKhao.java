package nguyenVanPhu.bai02;

import java.time.LocalDate;

public class SachThamKhao extends LoaiSach {
	/**
	 * thuộc tính
	 */
	private double thue;

	/**
	 * phương thức
	 */
	public SachThamKhao() {
		super();
		thue = 0;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public double tinhThanhTien() {
		return super.getSoLuong() * super.getDonGia() + this.thue;
	}

	@Override
	public String toString() {
		return String.format("SACH THAM KHAO\n%s thành tiền: %10.1f thuế: %10.1f", super.toString(),tinhThanhTien() ,this.thue);
	}

}
