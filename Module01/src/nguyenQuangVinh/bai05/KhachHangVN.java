package nguyenQuangVinh.bai05;

import java.time.LocalDate;

public class KhachHangVN extends KhachHang{
	private String doiTuongKhachHang;
	private double dinhMuc;
	/**
	 * @return the doiTuongKhachHang
	 */
	public String getDoiTuongKhachHang() {
		return doiTuongKhachHang;
	}
	/**
	 * @param doiTuongKhachHang the doiTuongKhachHang to set
	 */
	public void setDoiTuongKhachHang(String doiTuongKhachHang) {
		this.doiTuongKhachHang = doiTuongKhachHang;
	}
	/**
	 * @return the dinhMuc
	 */
	public double getDinhMuc() {
		return dinhMuc;
	}
	/**
	 * @param dinhMuc the dinhMuc to set
	 */
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public KhachHangVN(String maKhachHang, String hoTen, LocalDate ngayLapHD, double soKW, double donGia,
			String doiTuongKhachHang, double dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHD, soKW, donGia);
		setDoiTuongKhachHang(doiTuongKhachHang);
		setDinhMuc(dinhMuc);
	}
	public KhachHangVN(String maKhachHang, String hoTen, LocalDate ngayLapHD, double soKW, double donGia) {
		super("", "", LocalDate.now(), 0, 0);
		setDoiTuongKhachHang("");
		setDinhMuc(0);
	}
	public double getThanhTien() {
		if(dinhMuc>=super.getSoKW())
			return super.getThanhTien();
		return super.getSoKW()*super.getDonGia()*dinhMuc
				+(super.getSoKW()-dinhMuc)*super.getDonGia()*2.5;
		
		
	}
	@Override
	public String toString() {
		
		return String.format("%s %-10s %10.1f %15.1f", super.toString(),doiTuongKhachHang,dinhMuc,getThanhTien());
	}
	public static String getLayTieuDe() {
		return String.format("%s %-10s %10s %15s",KhachHang.getLayTieuDe(),"Doi tuong","Dinh muc","Thanh tien");
	}

}
