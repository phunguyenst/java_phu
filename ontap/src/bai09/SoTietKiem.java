package bai09;

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
		Period age = Period.between(ngayMoSo, LocalDate.of(2021, 12, 10));
		int dt_nam = age.getYears();
		int dt_thang = age.getMonths();
		int soThangGoi = dt_nam * 12 + dt_thang;
		if (soThangGoi % kyHan == 0)
			return soThangGoi;
		else
			return soThangGoi / kyHan * kyHan;
	}

	public double tinhTienLai() {
		return this.soTienGoi * laiSuat * tinhSoThangGoiThuc();
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngayHetHan = dtf.format(LocalDate.now());
		return String.format("STK %s[%s-%s] KH %s tháng, số tháng tính lãi: %s, ls %f, số tiền: %f --> Tiền lãi: %f",
				this.maSo, dtf.format(ngayMoSo), ngayHetHan, this.kyHan, this.tinhSoThangGoiThuc(), this.laiSuat, this.soTienGoi, this.tinhTienLai());
	}

	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	public double getSoTienGoi() {
		return soTienGoi;
	}

	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public float getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}

}
