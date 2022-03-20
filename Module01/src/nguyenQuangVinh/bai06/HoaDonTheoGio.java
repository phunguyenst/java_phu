package nguyenQuangVinh.bai06;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon{
	private int soGioThue;

	/**
	 * @return the soGioThue
	 */
	public int getSoGioThue() {
		return soGioThue;
	}

	/**
	 * @param soGioThue the soGioThue to set
	 */
	public void setSoGioThue(int soGioThue) {
		this.soGioThue = soGioThue;
	}
	

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoGioThue(soGioThue);
	}

	@Override
	public double getThanhTien() {
		if(soGioThue>24 && soGioThue<30)
			return soGioThue*24;
		if(soGioThue<=24)
			return soGioThue*getDonGia();
		else
			return -1;
	}
	public static String layTieuDe() {
		return String.format("Hoa don theo gio\n%-10s %15s %15s", HoaDon.layTieuDe(),"so gio thue","Thanh tien");
		
	}
	@Override
	public String toString() {
		return String.format("%-10s %15d %15.2f", super.toString(),soGioThue,getThanhTien());
	}
	
	

}
