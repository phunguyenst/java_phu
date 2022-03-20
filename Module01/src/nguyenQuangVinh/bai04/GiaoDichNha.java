package nguyenQuangVinh.bai04;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichNha extends GiaoDichNhaDat{
	private String loaiNha;
	private String diaChi;
	/**
	 * @return the loaiNha
	 */
	public String getLoaiNha() {
		return loaiNha;
	}
	/**
	 * @param loaiNha the loaiNha to set
	 */
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
	}
	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super("", LocalDate.now(),0,0);
		setLoaiNha("");
		setDiaChi("");
	}
	public double getThanhTien() {
		if(loaiNha.equals("cao cap"))
			return super.getThanhTien();
		return super.getDienTich()*0.9;
		
	}
	@Override
	public String toString() {
		DecimalFormat df= new DecimalFormat("#,##0.0");
		return String.format("%s %-10s %-15s %10s\n",super.toString(),loaiNha,diaChi,df.format(getThanhTien()));
	}
	
	public static String getLayTieuDe() {
		return String.format("%s %-10s %-15s %10s",GiaoDichNhaDat.getLayTieuDe(),"Loai nha","Dia chi","Thanh tien");
	}

}
