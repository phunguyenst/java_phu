package bai10;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	public CD() {
		this(999999,"chưa xác định", 0,0);
	}
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		if(maCD>0)
		{
			this.maCD = maCD;
		}
		else 
			maCD = 999999;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		if(!tuaCD.equals(""))
		{
			this.tuaCD = tuaCD;
		}
		else 
			this.tuaCD = "chưa xác định";
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat>0)
		{
			this.soBaiHat = soBaiHat;
		}
		
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		if(giaThanh>0)
		{
			this.giaThanh = giaThanh;
		}
		
	}
	
	public String toString() {
		return String.format("Mã cd: %d tựa cd: %s số bài hát: %d giá thành: %f", this.maCD, this.tuaCD, this.soBaiHat, this.giaThanh);
	}
	
}
