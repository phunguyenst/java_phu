package baicuoiky;

import java.time.LocalDate;

public class GiaoDichDaQuy extends GiaoDich{
	private String loaiDa;
	private int soCarat;
	public GiaoDichDaQuy() {
		super();
		loaiDa = "chưa biết";
		soCarat = 0;
	}
	public GiaoDichDaQuy(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, String loaiDa, int soCarat) {
		super(maGiaoDich, ngayGiaoDich, donGia);
		setLoaiDa(loaiDa);
		setSoCarat(soCarat);
	}
	public String getLoaiDa() {
		return loaiDa;
	}
	public void setLoaiDa(String loaiDa) {
		this.loaiDa = loaiDa;
	}
	public int getSoCarat() {
		return soCarat;
	}
	public void setSoCarat(int soCarat) {
		this.soCarat = soCarat;
	}
	
	
	@Override
	public double tinhThanhTien() {
		double s = 0;
		if(loaiDa.equalsIgnoreCase("kim cương") && soCarat == 2) {
			s = soCarat *getDonGia() + 0.3 *soCarat *getDonGia();
		}
		else if(loaiDa.equalsIgnoreCase("kim cương") && soCarat<2)
		{
			s = soCarat * getDonGia();
		}
		else if(loaiDa.equalsIgnoreCase("cẩm thạch"))
		{
			s = soCarat * getDonGia() + 0.1* soCarat * getDonGia();
		}
		return s;
	}
	@Override
	public String toString() {
		return String.format("%s %-20s %-15d", super.toString(), this.loaiDa, this.soCarat);
	}
	
	
}
