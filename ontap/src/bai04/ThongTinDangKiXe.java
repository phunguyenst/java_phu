package bai04;

public class ThongTinDangKiXe {
	private String chuXe;
	private String loaiXe;
	private double triGiaXe;
	private int dungTichXyLanh;
	public ThongTinDangKiXe(String chuXe, String loaiXe, double triGiaXe, int dungTichXyLanh) {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setTriGiaXe(triGiaXe);
		setDungTichXyLanh(dungTichXyLanh);
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		if(!chuXe.equals(""))
		{
			this.chuXe = chuXe;
		}
		else
			this.chuXe = "chưa biết";
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		if(!loaiXe.equals(""))
		{
			this.loaiXe = loaiXe;
		}
		else
			this.loaiXe = "chưa biết";
	}
	public double getTriGiaXe() {
		return triGiaXe;
	}
	public void setTriGiaXe(double triGiaXe) {
		if(triGiaXe>0)
		{
			this.triGiaXe = triGiaXe;
		}
		else
			this.triGiaXe = 0;
	}
	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}
	public void setDungTichXyLanh(int dungTichXyLanh) {
		if(dungTichXyLanh>0)
		{
			this.dungTichXyLanh = dungTichXyLanh;
		}
		else 
			this.dungTichXyLanh = 0;
	
	}
	public double tinhMucThue() {
		if(dungTichXyLanh<100)
		{
			triGiaXe = triGiaXe * 0.01;
		}
		else if(dungTichXyLanh >= 100 && dungTichXyLanh <= 200)
		{
			triGiaXe = triGiaXe *0.03;
		}
		else if(dungTichXyLanh>200)
		{
			triGiaXe = triGiaXe *0.05;
		}
		return triGiaXe;
	}
		
	public static String getTieuDe() {
		return String.format("%-30s %-20s %10s %15s %15s", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
	}
	public String toString() {
		return String.format("%-30s %-20s %10d %15.2f %15.2f", this.chuXe, this.loaiXe, this.dungTichXyLanh, this.triGiaXe ,this.tinhMucThue());
	}
	
}
