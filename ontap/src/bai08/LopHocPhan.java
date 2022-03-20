package bai08;

import java.util.Arrays;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLopHoc;
	private SinhVien[] dsSV;

	public int getSoLuongSV() {
		return dsSV.length;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < dsSV.length; i++) {
			s += dsSV[i];
		}

		return String.format(" - Mã LHP: %s\n - Tên LHP: %s\n - GV giảng dạy: %s\n - Thông tin buổi học: %s\nDanh sách sinh viên\n %s\n Tổng số sinh viên : %d",
				this.maLHP, this.tenLHP, this.tenGV, this.thongTinLopHoc, s, this.getSoLuongSV());
	}

	public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongTinLopHoc, SinhVien[] dsSV) {
		setMaLHP(maLHP);
		setTenLHP(tenLHP);
		setTenGV(tenGV);
		setThongTinLopHoc(thongTinLopHoc);
		setDsSV(dsSV);
	}

	public LopHocPhan() {
		this("", "", "", "", null);
	}

	public String getMaLHP() {
		return maLHP;
	}

	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}

	public String getTenLHP() {
		return tenLHP;
	}

	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}

	public String getTenGV() {
		return tenGV;
	}

	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}

	public String getThongTinLopHoc() {
		return thongTinLopHoc;
	}

	public void setThongTinLopHoc(String thongTinLopHoc) {
		this.thongTinLopHoc = thongTinLopHoc;
	}

	public SinhVien[] getDsSV() {
		return dsSV;
	}

	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}

}
