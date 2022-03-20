package truongVanThong.bai05;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang {
	private String quocTich;

	/**
	 * Tra ve Quoc Tich
	 * 
	 * @return quocTich
	 */
	public String getQuocTich() {
		return quocTich;
	}

	/**
	 * Gan Quoc Tich
	 * 
	 * @param quocTich
	 */
	public void setQuocTich(String quocTich) {
		if (quocTich.isEmpty())
			this.quocTich = "Chua biet";
		else
			this.quocTich = quocTich;
	}

	/**
	 * Ham khoi tao khong tham so
	 */
	public KhachHangNuocNgoai() {
		super();
		setQuocTich(quocTich);
	}

	/**
	 * Ham khoi tao du tham so
	 * 
	 * @param maKH
	 * @param hoTen
	 * @param ngayLapHD
	 * @param soKWTieuThu
	 * @param donGia
	 * @param quocTich
	 */
	public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayLapHD, double soKWTieuThu, double donGia,
			String quocTich) {
		super(maKH, hoTen, ngayLapHD, soKWTieuThu, donGia);
		setQuocTich(quocTich);
	}

	/**
	 * @return Thong tin Khach Hang Nuoc Ngoai
	 */
	@Override
	public String toString() {
		return String.format("Khach Hang Nuoc Ngoai: %s Quoc tich: %s", super.toString(), quocTich);
	}

	/**
	 * Tinh thanh tien
	 * 
	 * @return thanh tien
	 */
	public double tinhThanhTien() {
		return super.tinhThanhTien();
	}

}
