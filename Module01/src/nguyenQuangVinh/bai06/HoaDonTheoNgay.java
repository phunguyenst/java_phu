package nguyenQuangVinh.bai06;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon{
	private int soNgayThue;
	
	

	/**
	 * @return the soNgayThue
	 */
	public int getSoNgayThue() {
		return soNgayThue;
	}



	/**
	 * @param soNgayThue the soNgayThue to set
	 */
	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	



	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia,
			int soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		setSoNgayThue(soNgayThue);
	}
	



	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia) {
		super("Loi ma", LocalDate.now(),"", "", 0);
		setSoNgayThue(0);
	}


/**
 * nếu số ngày thuê lớn hơn 7 thì những ngày sau đó được giảm 20%
 * những ngày sau đó chỉ tính 80% tiền
 */
	@Override
	public double getThanhTien() {
		if(soNgayThue>7)	
			return (getDonGia()*7)+(soNgayThue-7)*getDonGia()*0.8; 
		else
			return getDonGia()*soNgayThue;
	}
	public static String layTieuDe() {
		return String.format("Hóa đơn theo ngày\n%-10s %15s %15s",HoaDon.layTieuDe(),"Số ngày thuê","Thành tiền");
	}
	@Override
	public String toString() {
		return String.format("%-10s %15d %15.2f",super.toString(),soNgayThue,getThanhTien());
	}

}
