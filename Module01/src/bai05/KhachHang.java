package truongVanThong.bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private LocalDate ngayLapHD;
	private double soKWTieuThu;
	private double donGia;

	/**
	 * Tra ve ma khach hang
	 * 
	 * @return maKH
	 */
	public String getMaKH() {
		return maKH;
	}

	/**
	 * Gan ma khach hang
	 * 
	 * @param maKH
	 */
	public void setMaKH(String maKH) {
		if (!maKH.isEmpty())
			this.maKH = maKH;
		else
			this.maKH = "000";
	}

	/**
	 * Tra ve Ho ten
	 * 
	 * @return hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * Gan ho ten
	 * 
	 * @param hoTen
	 */
	public void setHoTen(String hoTen) {
		if (!hoTen.isEmpty())
			this.hoTen = hoTen;
		else
			this.hoTen = "Chua Biet";
	}

	/**
	 * Tra ve ngay lap hoa don
	 * 
	 * @return ngayLapHD
	 */
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}

	/**
	 * Gan ngay lap Hoa Don
	 * 
	 * @param ngayLapHD
	 */
	public void setNgayLapHD(LocalDate ngayLapHD) {
		if (!ngayLapHD.isAfter(LocalDate.now()))
			this.ngayLapHD = ngayLapHD;
		else
			this.ngayLapHD = LocalDate.now();
	}

	/**
	 * Tra ve So KW Tieu Thu
	 * 
	 * @return soKWTieuThu
	 */
	public double getSoKWTieuThu() {
		return soKWTieuThu;
	}

	/**
	 * Gan So KW Tieu Thu
	 * 
	 * @param soKWTieuThu
	 */
	public void setSoKWTieuThu(double soKWTieuThu) {
		if (soKWTieuThu > 0)
			this.soKWTieuThu = soKWTieuThu;
		else
			this.soKWTieuThu = 0;
	}

	/**
	 * Tra ve Don Gia
	 * 
	 * @return donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * Gan Don Gia
	 * 
	 * @param donGia
	 */
	public void setDonGia(double donGia) {
		if (donGia > 0)
			this.donGia = donGia;
		else
			this.donGia = 0;
	}

	/**
	 * Ham khoi tao khong tham so
	 */
	public KhachHang() {
		this("000", "Chua Biet", LocalDate.now(), 0, 0);
	}

	/**
	 * Ham khoi tao du tham so
	 * 
	 * @param maKH
	 * @param hoTen
	 * @param ngayLapHD
	 * @param soKWTieuThu
	 * @param donGia
	 */
	public KhachHang(String maKH, String hoTen, LocalDate ngayLapHD, double soKWTieuThu, double donGia) {
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLapHD(ngayLapHD);
		setSoKWTieuThu(soKWTieuThu);
		setDonGia(donGia);
	}

	/**
	 * @return Thong tin khach hang
	 */
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format(
				"\nMa Khach Hang: %-8s Ho Ten: %-20s Ngay lap HD: %-15s So KW tieu thu: %-10s Don Gia: %-10s", maKH,
				hoTen, dtf.format(ngayLapHD), Double.toString(soKWTieuThu), Double.toString(donGia));
	}

	/**
	 * Tinh Thanh Tien
	 * 
	 * @return ThanhTien
	 */
	public double tinhThanhTien() {
		return soKWTieuThu * donGia;
	}

}
