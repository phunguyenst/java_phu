package nguyenVanPhu.bai01loaisachset;

import java.time.LocalDate;

public class SachGiaoKhoa extends LoaiSach{
	private boolean tinhTrang;

	public SachGiaoKhoa() {
		super();
		tinhTrang= false;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public double tinhThanhTien() {
		if(tinhTrang) {
			return super.getDonGia() *super.getSoLuong();
		}
		
		else 
			return  super.getSoLuong() *super.getDonGia() *0.5;
	}



	@Override
	public String toString() {
		return String.format("%s %-15s", super.toString(), tinhTrang? "mới": "cũ");
	}
	
	
}
