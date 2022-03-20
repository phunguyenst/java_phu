package baicuoiky;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	private String loaiVang;
	private int soLuong;
	private String donViTinh;
	public GiaoDichVang() {
		super();
		loaiVang = "chưa biết";
		soLuong = 0;
		donViTinh = "chưa biết";
	}
	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loaiVang, int soLuong,
			String donViTinh) {
		super(maGiaoDich, ngayGiaoDich, donGia);
		setLoaiVang(loaiVang);
		setSoLuong(soLuong);
		setDonViTinh(donViTinh);
		
	}
	public String getLoaiVang() {
		return loaiVang;
	}
	public void setLoaiVang(String loaiVang) {
		if(!loaiVang.equals(""))
		{
			this.loaiVang = loaiVang;
		}
		else
			
		this.loaiVang = "chưa biết";
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		if(soLuong>0)
		{
			this.soLuong = soLuong;
		}
		else
		this.soLuong = 0;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		if(!donViTinh.equals(""))
		{
			this.donViTinh = donViTinh;
		}
		else
		this.donViTinh = "chưa biết";
	}
	/**
	 * nếu vang 9999 thì sl * dg + 5%
	 */
	@Override
	public double tinhThanhTien() {
		double s = 0;
		if(loaiVang.equalsIgnoreCase("9999")) {
			s= soLuong*getDonGia() + 0.1* soLuong * getDonGia();
		}
		else if(loaiVang.equalsIgnoreCase("999"))
		{
			s= soLuong * getDonGia() + 0.05 *soLuong *getDonGia();
		}
		else if(loaiVang.equalsIgnoreCase("99")) {
			s= soLuong * getDonGia();
		}
		return s;
	}
	@Override
	public String toString() {
		return String.format("%s %-20s %-15d %-20s", super.toString(), this.loaiVang, this.soLuong, this.donViTinh);
	}
	
	
	
	
}
