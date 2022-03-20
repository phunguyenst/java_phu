package nguyenQuangVinh.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichDat extends GiaoDichNhaDat{
	private String loaiDat;

	/**
	 * @return the loaiDat
	 */
	public String getLoaiDat() {
		return loaiDat;
	}

	/**
	 * @param loaiDat the loaiDat to set
	 */
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiDat(loaiDat);
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super("", LocalDate.now(),0,0);
		setLoaiDat("");
	}
	public double getThanhTien() {
		if(loaiDat.equals("A"))
			return super.getThanhTien()*1.5;
		return super.getThanhTien();
		
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%s %-10s %10s\n", super.toString(),loaiDat,df.format(getThanhTien()));
		
	}
	public static String getLayTieuDe() {
		return String.format("%s %-10s %10s",GiaoDichNhaDat.getLayTieuDe(),"Loai dat","Thanh tien");
	}

}
