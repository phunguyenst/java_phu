package nguyenQuangVinh.bai05;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;

	/**
	 * @return the quocTich
	 */
	public String getQuocTich() {
		return quocTich;
	}

	/**
	 * @param quocTich the quocTich to set
	 */
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHD, double soKW, double donGia,
			String quocTich) {
		super(maKhachHang, hoTen, ngayLapHD, soKW, donGia);
		setQuocTich(quocTich);
	}

	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHD, double soKW, double donGia) {
		super("", "",LocalDate.now(), 0, 0);
		setQuocTich("");
	}
	
	public double getThanhTien() {
		return super.getThanhTien();
		
	}
	@Override
	public String toString() {
		
		return String.format("%s %-10s %15.1f", super.toString(),quocTich,getThanhTien());
	}
	public static String getLayTieuDe() {
		return String.format("%s %-10s %15s",KhachHang.getLayTieuDe(),"Quoc tich","Thanh tien");
	}
	

}
