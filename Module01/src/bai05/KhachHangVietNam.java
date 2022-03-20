package truongVanThong.bai05;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang {
	private String doiTuongKH;
	private double dinhMuc;

	/**
	 * Tra ve Doi Tuong Khach Hang
	 * 
	 * @return doiTuongKH
	 */
	public String getDoiTuongKH() {
		return doiTuongKH;
	}

	/**
	 * Gan Doi Tuong Khach Hang
	 * 
	 * @param doiTuongKH : Sinh Hoat || Kinh Doanh || San Xuat
	 */
	public void setDoiTuong(String doiTuongKH) {
		if (doiTuongKH.equals("Sinh Hoat") || doiTuongKH.equals("Kinh Doanh") || doiTuongKH.equals("San Xuat"))
			this.doiTuongKH = doiTuongKH;
		else
			this.doiTuongKH = "Sinh Hoat";
	}

	/**
	 * Tra ve Dinh Muc
	 * 
	 * @return dinhMuc
	 */
	public double getDinhMuc() {
		return dinhMuc;
	}

	/**
	 * Gan Dinh Muc
	 * 
	 * @param dinhMuc
	 */
	public void setDinhMuc(double dinhMuc) {
		if (dinhMuc > 0)
			this.dinhMuc = dinhMuc;
		else
			this.dinhMuc = 0;
	}

	/**
	 * Ham khoi tao khong tham so
	 */
	public KhachHangVietNam() {
		super();
		setDoiTuong(doiTuongKH);
		setDinhMuc(dinhMuc);
	}

	/**
	 * Ham khoi tao du tham so
	 * 
	 * @param maKH
	 * @param hoTen
	 * @param ngayLapHD
	 * @param soKWTieuThu
	 * @param donGia
	 * @param doiTuongKH  : Sinh Hoat || Kinh Doanh || San Xuat
	 * @param dinhMuc
	 */
	public KhachHangVietNam(String maKH, String hoTen, LocalDate ngayLapHD, double soKWTieuThu, double donGia,
			String doiTuongKH, double dinhMuc) {
		super(maKH, hoTen, ngayLapHD, soKWTieuThu, donGia);
		setDoiTuong(doiTuongKH);
		setDinhMuc(dinhMuc);
	}

	/**
	 * @return Thong Tin Khach Hang Viet Nam
	 */
	@Override
	public String toString() {
		return String.format("Khach hang Viet Nam: %s Doi Tuong Khach Hang: %-15s Dinh muc: %s", super.toString(),
				doiTuongKH, Double.toString(dinhMuc));
	}

	/**
	 * Tinh thanh tien
	 * 
	 * @return ThanhTien
	 */
	public double tinhThanhTien() {
		if (getSoKWTieuThu() <= dinhMuc)
			return super.tinhThanhTien();
		else
			return super.tinhThanhTien() * dinhMuc + (getSoKWTieuThu() - dinhMuc) * getDonGia() * 2.5;
	}

}
