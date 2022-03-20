package nguyenQuangVinh.bai02;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;

	/**
	 * @return the thue
	 */
	public double getThue() {
		return thue;
	}

	/**
	 * @param thue the thue to set
	 */
	
	public void setThue(double thue) {
		this.thue = thue;
	}

	public SachThamKhao(String maSach, String nXB, double donGia, int soLuong, LocalDate ngayNhap, double thue) {
		super(maSach, nXB, donGia, soLuong, ngayNhap);
		setThue(thue);
	}
	
	public SachThamKhao() {
		super("", "", 0, 0, LocalDate.now());
		setThue(0);
	}

	public double getThanhTien() {
		return super.getThanhTien()+thue;
		
	}
	public static String layTieuDe(){
		return String.format("%-10s %-10s %-20s",Sach.layTieuDe(),"Thuế","Thanh tien");
	}
	@Override
	public String toString() {
		DecimalFormat df=new DecimalFormat("#,##0.0");
		return String.format("%-10s %-10.2f %-20s", super.toString(),thue,df.format(getThanhTien()));
	}

}
