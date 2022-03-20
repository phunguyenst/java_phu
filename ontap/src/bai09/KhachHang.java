package bai09;

import java.time.LocalDate;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSoHienCo = 0;
	private int soLuongSoToiDa;
	public KhachHang(String maKH, String hoTenKH, int soLuongSoToiDa) {
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soLuongSoToiDa = soLuongSoToiDa;
		dsSoTietKiem = new SoTietKiem[ soLuongSoToiDa];
	}
	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGui, int kyHan, float laiSuat)
	{
		if(this.soLuongSoHienCo<this.soLuongSoToiDa)
		{
			dsSoTietKiem[soLuongSoHienCo] = new SoTietKiem(maSo, ngayMoSo, soTienGui, kyHan, laiSuat);
			soLuongSoHienCo++;
			return true;
		}
		else
			return false;
	}
	

	public String toString() {
		String s = "";
		for (int i = 0; i < soLuongSoHienCo; i++) {
			s += dsSoTietKiem[i] +"\n";
		}
		return String.format("Khách hàng: %s - %s\n %s", this.maKH, this.hoTenKH, s);
	}
	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}
	public void setDsSoTietKiem(SoTietKiem[] dsSoTietKiem) {
		this.dsSoTietKiem = dsSoTietKiem;
	}
	public String getMaKH() {
		return maKH;
	}
	public String getHoTenKH() {
		return hoTenKH;
	}
	public int getSoLuongSoHienCo() {
		return soLuongSoHienCo;
	}
	
	
}
