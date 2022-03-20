package bai02;

public class DiemSinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	public DiemSinhVien() {
		this(0, "chưa biết", 0,0);
	}
	public DiemSinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		if(maSV >0)
		{
			this.maSV = maSV;
		}
		else
			this.maSV = 0;
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		if(!hoTen.equals(""))
		{
			this.hoTen = hoTen;
		}
		else
			this.hoTen = "chưa biết";
		
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		if(diemLT>= 0 && diemLT<=10)
		{
			this.diemLT = diemLT;
		}
		else 
			this.diemLT = 0;
		
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		if(diemTH >= 0 && diemTH <=10)
		{
			this.diemTH = diemTH;
		}
		
	}
	public double tinhDiemTrungBinh()
	{
		return (diemLT + diemTH)/2;
	}
	public static String getTieuDe() {
		return String.format("%-10s %-20s %7s %7s %7s", "masv", "hoten", "diemlt", "diemth", "diemtb");
	}
	public String toString() {
		return String.format("%-10s %-20s %7.2f %7.2f %7.2f", this.maSV, this.hoTen, this.diemLT, this.diemTH, this.tinhDiemTrungBinh());
	}
	
}
