package bai09;

import java.time.LocalDate;

public class KhachHang {
    private String maKH;
    private String hoTenKH;
    private SoTietKiem[] dsSoTietKiem;
    private int soLuongSoHienCo = 0;
    private int soLuongSoToiDa;

    public KhachHang() {
        // this("", "", dsSoTietKiem, 0);
        super();
    }

    public KhachHang(String maKH, String hoTenKH, int soLuongSoToiDa) {
        setHoTenKH(hoTenKH);
        this.maKH = maKH;
        this.soLuongSoToiDa = soLuongSoToiDa;
        dsSoTietKiem = new SoTietKiem[soLuongSoToiDa];

    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public SoTietKiem[] getDsSoTietKiem() {
        return dsSoTietKiem;
    }
    public int getSoLuongSoHienCo() {
        return soLuongSoHienCo;
    }

    public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
      
        if (this.soLuongSoHienCo < this.soLuongSoToiDa) {
            dsSoTietKiem[soLuongSoHienCo] = new SoTietKiem(maSo, ngayMoSo, soTienGoi, kyHan, laiSuat);
            this.soLuongSoHienCo++;
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < soLuongSoHienCo; i++) {
            s += dsSoTietKiem[i] + "\n";
        }
        return String.format("Khach hang: %s - %s\n%s", this.maKH, this.hoTenKH, s);
    }
}
