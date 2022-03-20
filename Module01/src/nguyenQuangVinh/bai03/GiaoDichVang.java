package nguyenQuangVinh.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	/**
	 * @return the loaiVang
	 */
	public String getLoaiVang() {
		return loaiVang;
	}

	/**
	 * @param loaiVang the loaiVang to set
	 */
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	public double getThanhTien() {
		return super.getThanhTien();
		
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super("", LocalDate.now(), 0, 0);
		setLoaiVang("");
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.0");
		return String.format("%s %-10s %10s", super.toString(),loaiVang,df.format(getThanhTien()));
	}
	public static String getLayTieuDe() {
		return String.format("%s %-10s %10s",GiaoDich.layTieuDe(),"Loai vang","Thanh tien");
	}
	

}
