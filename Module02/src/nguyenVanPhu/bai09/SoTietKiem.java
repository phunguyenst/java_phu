package nguyenVanPhu.bai09;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SoTietKiem {
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;

	public int tinhSoThangGoiThuc() {
		Period age = Period.between(this.ngayMoSo, LocalDate.of(2021, 12, 10));
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0)
			return soThangGoi;
		else
			return soThangGoi / kyHan * kyHan;
	}

	public double tinhTienLai() {
		return tinhSoThangGoiThuc() * laiSuat * this.soTienGoi;
	}

	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		String ngayHetHan = dtf.format(LocalDate.now());
		return String.format("STK %s[%s - %s]KH %d Tháng, số tháng tính lãi: %d, ls %.3f, số tiền: %s --> Tiền lãi: %s",
				this.maSo, dtf.format(ngayMoSo), ngayHetHan, this.kyHan, this.tinhSoThangGoiThuc(), this.laiSuat,
				df.format(soTienGoi), df.format(tinhTienLai()));
	}

	public SoTietKiem() {
		this("", LocalDate.now(), 0, 0, 0);
	}

	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGui(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
	}

	public String getMaSo() {
		return maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public void setSoTienGui(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}

}
