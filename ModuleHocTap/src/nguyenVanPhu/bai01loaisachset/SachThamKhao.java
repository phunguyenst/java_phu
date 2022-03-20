package nguyenVanPhu.bai01loaisachset;

import java.time.LocalDate;

public class SachThamKhao extends LoaiSach{
	private double thue;

	public SachThamKhao() {
		super();
		thue = 0;
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		if(thue>= 0)
		{
			this.thue = thue;
		}
		else 
		this.thue = 0;
	}
	
	public double tinhThanhTien() {
		return super.tinhThanhTien() +thue;
	}

	@Override
	public String toString() {
		return String.format("%s %-10.1f", super.toString(), this.thue);
	}

}
