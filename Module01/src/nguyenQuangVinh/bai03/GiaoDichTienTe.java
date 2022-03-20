package nguyenQuangVinh.bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private String loaiTienTe;
	/**
	 * @return the tiGia
	 */
	public double getTiGia() {
		return tiGia;
	}
	/**
	 * @param tiGia the tiGia to set
	 */
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	/**
	 * @return the loaiTienTe
	 */
	public String getLoaiTienTe() {
		return loaiTienTe;
	}
	/**
	 * @param loaiTienTe "VN" hoac "USD" hoac "euro"
	 */
	public void setLoaiTienTe(String loaiTienTe) {
		if(loaiTienTe.equalsIgnoreCase("VN")|| loaiTienTe.equalsIgnoreCase("USD")||loaiTienTe.equalsIgnoreCase("Euro"))
			this.loaiTienTe = loaiTienTe;
		else
				this.loaiTienTe="";
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			String loaiTienTe) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTienTe(loaiTienTe);
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		super("", LocalDate.now(), 0, 0);
		setTiGia(0);
		setLoaiTienTe("");
	}
	public double getThanhTien() {
		if(loaiTienTe.equals("VND"))
			return super.getThanhTien();
		else
			return super.getThanhTien()*tiGia;
		
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.0");
		return String.format("%s %10.1f %-10s %10s",super.toString(),tiGia,loaiTienTe,df.format(getThanhTien()));
	}
	public static String getLayTieuDe() {
		return String.format("%s %10s %-10s %10s",GiaoDich.layTieuDe(),"Ti gia","Loai tien","Thanh tien");
	}
	

}
