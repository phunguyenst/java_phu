package arraylist;

import java.util.Objects;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private int namSinh;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public SinhVien(int maSV, String hoTen, int namSinh) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return maSV == other.maSV;
	}
	@Override
	public String toString() {
		return String.format("%d %s %d", this.maSV, this.hoTen, this.namSinh);
	}
	
	
}
