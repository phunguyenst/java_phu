package nguyenQuangVinh.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private boolean tinhTrang;

	/**
	 * @return the tinhTrang
	 */
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	/**
	 * @param tinhTrang the tinhTrang to set
	 */
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa(String maSach, String nXB, double donGia, int soLuong, LocalDate ngayNhap, boolean tinhTrang) {
		super(maSach, nXB, donGia, soLuong, ngayNhap);
		setTinhTrang(tinhTrang);
	}
	public double getThanhTien() {
		if(tinhTrang==true)
			return super.getThanhTien();
		else
			return super.getThanhTien()*0.5;
		
	}
	public SachGiaoKhoa() {
		super("", "", 0, 0, LocalDate.now());
		
	}
	
	public static String layTieuDe(){
		return String.format("%s %-10s %15s",Sach.layTieuDe(),"Tình trạng","Thành tiền");
	}
	@Override
	public String toString() {
		String s=(tinhTrang==true?"Mới":"cũ");
		
		DecimalFormat df= new DecimalFormat("#,##0.0");
		
		return String.format("%s %-10s %15s", super.toString(),s,df.format(getThanhTien()));
	}
	
}
