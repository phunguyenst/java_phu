package nguyenVanPhu.bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends LoaiSach {
	/**
	 * thuộc tính
	 */
	private boolean tinhTrang;

	/**
	 * phương thức
	 */
	public SachGiaoKhoa() {
		super();
		tinhTrang = false;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public boolean getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double tinhThanhTien() {
		if (tinhTrang) {
			return super.getSoLuong() * super.getDonGia();
		} else
			return super.getSoLuong() * super.getDonGia() * 0.5;
	}

	@Override
	public String toString() {
		return String.format("SACH GIAO KHOA\n %s thành tiền: %10.1f tình trạng: %-10s ", super.toString(),tinhThanhTien() ,this.tinhTrang);
	}

}
