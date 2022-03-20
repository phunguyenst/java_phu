package bai09;

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

    public SoTietKiem() {
        this("", LocalDate.now(), 0, 0, 0);
    }

    public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
        setMaSo(maSo);
        setNgayMoSo(ngayMoSo);
        setSoTienGoi(soTienGoi);
        setKyHan(kyHan);
        setLaiSuat(laiSuat);
    }

   
    public int tinhSoThangGoiThuc() {
        Period age = Period.between(this.ngayMoSo, LocalDate.of(2021, 12, 10));
        int dt_nam = age.getYears();
        int dt_thang = age.getMonths();
        int soThangGoi = dt_nam * 12 + dt_thang;
        return soThangGoi % kyHan == 0 ? soThangGoi : soThangGoi / kyHan * kyHan;
    }

    public double tinhTienLai() {
        return laiSuat * tinhSoThangGoiThuc() * this.soTienGoi;
    }

    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ngayMoSo = dtf.format(this.ngayMoSo);
		String ngayHH = dtf.format(LocalDate.now());
        DecimalFormat df = new DecimalFormat("#,###.00");
        String tienGoi = df.format(this.soTienGoi);
        String tienLai = df.format(tinhTienLai());
        return String.format("STK %s[%s - %s]KH %d thang, so thang tinh lai: %d, 1s %.3f, so tien: %s --> Tien lai: %s"
                , this.maSo, ngayMoSo, ngayHH, kyHan, tinhSoThangGoiThuc(), this.laiSuat, tienGoi, tienLai);
    }
}
